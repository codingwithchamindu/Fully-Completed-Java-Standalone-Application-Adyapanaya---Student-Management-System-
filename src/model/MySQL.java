package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {
      private static Connection connection;

    static {    //static block ekak
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adyapanayadb", "root", "@123DiLaN08GiMhAnA");
        } catch (Exception e) {
            e.printStackTrace();
        }   //static block ekta demmama 1ka connection ekai thiyenne
    }

    public static ResultSet execute(String query) throws Exception {

        Statement statement = connection.createStatement();

        if (query.startsWith("SELECT")) {
           return statement.executeQuery(query); //ResultSet ekak return weno
            
        } else {
            statement.executeUpdate(query); //int ekak return weno
            return null;
        }

    }
}
