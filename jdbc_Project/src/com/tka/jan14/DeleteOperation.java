package com.tka.jan14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/batch1297_db";
        String username = "root";
        String password= "root";
        //String sqlQuery = "SELECT * FROM batch1297_db.student";
        String deleteQuery = "DELETE FROM batch1297_db.student where roll =? ";

        Class.forName(driver);
        System.out.println("Driver Loaded Successfully");

        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established Successfully");

        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
        System.out.println("Prepared Statement object created Successfully ");

        preparedStatement.setInt(1,9);


        int ack = preparedStatement.executeUpdate();

        System.out.println("Query executed Successfully");

        System.out.println("Number of Rows deleted" +ack);

        if (ack>0){
            System.out.println("Deleted Successful");
        } else {
            System.out.println("Deleted Unsuccessful");
        }

        preparedStatement.close();
        connection.close();

    }
}
