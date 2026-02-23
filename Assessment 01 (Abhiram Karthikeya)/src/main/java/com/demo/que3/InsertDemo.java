package com.demo.que3;

import java.sql.*;

public class InsertDemo {
    public static void main(String[] args){

        //Get connection (auto connection)
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/assessment", "root", "root");
                PreparedStatement pst = conn.prepareStatement("insert into student(id,name,age,class) values (?,?,?,?) ");
                )
        {

            pst.setInt(1, 10);
            pst.setString(2, "Abhi");
            pst.setInt(3, 15);
            pst.setInt(4, 10);
            pst.executeUpdate();

            pst.setInt(1, 20);
            pst.setString(2, "Ram");
            pst.setInt(3, 14);
            pst.setInt(4, 9);
            pst.executeUpdate();

            pst.setInt(1, 30);
            pst.setString(2, "Karthikeya");
            pst.setInt(3, 16);
            pst.setInt(4, 11);
            pst.executeUpdate();

            pst.setInt(1, 40);
            pst.setString(2, "Anoop");
            pst.setInt(3, 15);
            pst.setInt(4, 10);
            pst.executeUpdate();

            pst.setInt(1, 50);
            pst.setString(2, "Charan");
            pst.setInt(3, 14);
            pst.setInt(4, 9);
            pst.executeUpdate();

            System.out.println("Inserted done");
        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
