package sample;

import java.sql.*;

public class DataBaseConnection implements Connectivity {
    public  boolean isValid(String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.drive");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Webdemos","root","root");
            String query = "select * from users where username = ? and password = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,username);
            pstmt.setString(2 ,password);

            ResultSet rs = pstmt.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
