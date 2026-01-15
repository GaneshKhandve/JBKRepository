package com.tka.jan14;

import java.sql.*;

public class InsertOperation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/batch1297_db";
        String username = "root";
        String password= "root";
        //String sqlQuery = "SELECT * FROM batch1297_db.student";
        String insertQuery = "INSERT INTO batch1297_db.student VALUES (?,?,?)";

        Class.forName(driver);
        System.out.println("Driver Loaded Successfully");

        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established Successfully");

        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        System.out.println("Prepared Statement object created Successfully ");

        preparedStatement.setInt(1,9);
        preparedStatement.setString(2,"Suraj");
        preparedStatement.setInt(3,88);


       int ack = preparedStatement.executeUpdate();

        System.out.println("Query executed Successfully");

        System.out.println("Number of Rows inserted" +ack);

        if (ack>0){
            System.out.println("Insertion Successful");
        } else {
            System.out.println("Insertion Unsuccessful");
        }

        preparedStatement.close();
        connection.close();

    }
}
