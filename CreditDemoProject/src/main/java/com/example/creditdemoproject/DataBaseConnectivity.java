package com.example.creditdemoproject;
import java.sql.*;

public class DataBaseConnectivity implements Connectivity {
    public  boolean isValid(Integer number, String expiryDate, Integer cvv,String name) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:8080/Webdemos","root","root");
            String query = "select * from  where number  = ? and expiryDate = ? and cvv =? and   name =?";
            PreparedStatement pstmt = con.prepareStatement(query);
//            pstmt.setString(1,username);
//            pstmt.setString(2 ,password);
            pstmt.setInt(1,number);
            pstmt.setString(2,expiryDate);
            pstmt.setInt(3,cvv);
            pstmt.setString(4,name);

            ResultSet rs = pstmt.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}

