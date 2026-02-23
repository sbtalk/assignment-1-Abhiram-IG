package com.demo.que3;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/assessment", "root", "root");
                PreparedStatement pst = conn.prepareStatement("select id,name,age,class from student");
        ) {
            ResultSet rs = pst.executeQuery();
            System.out.println("Records are:");
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age= rs.getInt("age");
                int Grade =rs.getInt("class");
                System.out.println(id+" "+name+" "+age+" "+Grade);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
