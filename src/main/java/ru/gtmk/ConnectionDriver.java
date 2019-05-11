package ru.gtmk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDriver {
    private static String USERNAME="root";
    private static String PASSWORD="12345";
    private static String URL="jdbc:mysql://localhost:3306/logistic?useSSL=false";

    public static void main(String[] args){
        Connection connection= null;
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("not connected");
            e.printStackTrace();

        } finally {
            if(connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
