package com.tka.jan14;

import java.sql.*;

public class SelectOperation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/batch1297_db";
        String username = "root";
        String password= "root";
        //String sqlQuery = "SELECT * FROM batch1297_db.student";
        String sqlQuery2 = "SELECT * FROM batch1297_db.student where roll in (1,2,3,4)";

         Class.forName(driver);
        System.out.println("Driver Loaded Successfully");

        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established Successfully");

        Statement statement = connection.createStatement();
        System.out.println("Statement object created Successfully ");

        ResultSet resultSet = statement.executeQuery(sqlQuery2);
        System.out.println("Query executed Successfully");

        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int marks = resultSet.getInt(3);

            System.out.println(id +" | "+name+" | " + marks);



        }
        resultSet.close();
        statement.close();
        connection.close();

    }
}
