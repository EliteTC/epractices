package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnector {

    public static Connection getConnection() {
        ResourceBundle resource = ResourceBundle.getBundle("database");
        String url = resource.getString("url");
        String user = resource.getString("user");
        String pass = resource.getString("password");
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_11_db","root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(conn != null) System.out.println("Connection successful!");
        return conn;
    }
    */

}
