====RUN FILE BAT VÀ SET MÔI TRƯỜNG JAVA TRONG WINDOW
@echo off
echo Setting JAVA_HOME
set JAVA_HOME=C:\Program Files\Java\openjdk-15.0.1
echo setting PATH
set PATH=%JAVA_HOME%\bin;%PATH%
echo Display java version
java -version
java -jar demo-0.0.1-SNAPSHOT.jar
pause


====RUN FILE .SH VÀ SET MÔI TRƯỜNG JAVA TRONG LINUX=====
Bước 1 : Tạo file sh
touch name_file;
content:
!/bin/bash
clear
java -jar HelloWorld.jar


Bước 2 :Cấp quyền
sudo chmod 754 hello.sh

Bước 3 chạy .sh
./name_file.sh


Set Môi trường java trong linux

Bước 1: cd $HOME
Bước 2: open .bashrc file
nano .bashrc
Bước 3: set Java_HOME
coppy đường dẫn phù hợp đến thư mục chứa jdk
export  JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64
export  PATH=$JAVA_HOME/bin$PATH
Bước 4: Kiểm tra PATH
 open termnal: $PATH
	ECHO $JAVA_HOME
	java -version
End




