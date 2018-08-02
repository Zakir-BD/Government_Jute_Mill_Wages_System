


import java.sql.*;


public class DBConnection {

    public static Connection getDBConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wages", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
