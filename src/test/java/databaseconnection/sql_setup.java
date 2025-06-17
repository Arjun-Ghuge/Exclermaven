package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sql_setup {
	public static void main(String[] args) {
	  String url = "jdbc:mysql://localhost:3306/employee_database";
      String user = "root";
      String password = "Arjun@123";{

      try (Connection conn = DriverManager.getConnection(url, user, password)) {
          System.out.println("Connected to MySQL!");

          String query = "select * from students" + ""; // Adjust according to your table
          try (Statement stmt = conn.createStatement();
        		  ResultSet rs = stmt.executeQuery(query)) {
              System.out.println("Students in the database:");
              while (rs.next()) {
                  System.out.println("- " + rs.getString("first_name"));
              }
          }

      } catch (SQLException e) {
          e.printStackTrace();
      } 
    }
  }
}
