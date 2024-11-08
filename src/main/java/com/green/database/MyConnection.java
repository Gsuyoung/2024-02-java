package com.green.database;

import java.sql.*;

import static java.lang.Class.forName;

//DB-Connection을 만드는 공장
public class MyConnection {
    private static final String DB_URL = "jdbc:mariadb://localhost/board_1"; //목적지 URL
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() throws SQLException, ClassNotFoundException{
        Class.forName("org.mariadb.jdbc.Driver"); // 빨간 줄이 뜨는 이유는 보통 throw를 던지고있다.
        Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        System.out.println("접속 성공!!");
        return conn;
    }
}