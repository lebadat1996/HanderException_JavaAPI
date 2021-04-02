package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/v1")
public class RestApiController {

    private List<Todo> todoList;

    @PostConstruct
    public void init() {
        todoList = IntStream.range(0, 10)
                .mapToObj(i -> new Todo("title-" + i, "detail-" + i))
                .collect(Collectors.toList());
    }

    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") Integer todoId) {
        return todoList.get(todoId);
    }

    @GetMapping("/todo")
    public Integer demo() {
        int a = 4 / 0;
        return a;
    }

    @PostMapping
    public String connerction() throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        if (connection == null) {
            return "error";
        }
        connection.close();
        return "success";
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        System.out.println("===== Start connection DB =====");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.209:1521:orcl", "SHB_LOGS", "SHB_LOGS");
        return connection;
    }
}