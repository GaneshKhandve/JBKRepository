package com.tka.jan14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/batch1297_db";
        String username = "root";
        String password= "root";
        //String sqlQuery = "SELECT * FROM batch1297_db.student";
        String updateQuery = "Update batch1297_db.student set marks = ? where roll = ?";

        Class.forName(driver);
        System.out.println("Driver Loaded Successfully");

        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established Successfully");

        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
        System.out.println("Prepared Statement object created Successfully ");

        preparedStatement.setInt(1,100);
        preparedStatement.setInt(2,1);


        int ack = preparedStatement.executeUpdate();

        System.out.println("Query executed Successfully");

        System.out.println("Number of Rows updated" +ack);

        if (ack>0){
            System.out.println("Update Successful");
        } else {
            System.out.println("Update Unsuccessful");
        }

        preparedStatement.close();
        connection.close();

    }
}
