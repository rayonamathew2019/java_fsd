package ustbatchno3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateDatabaseExample {
   public static void main(String args[]) throws SQLException {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost/MyDatabase";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "pass@word1");
      System.out.println("Connection established......");
      //Creating the Statement
      Statement stmt = con.createStatement();
      //Query to create a database
//      String query = "CREATE database MyDatabase";
//      String query1 = "CREATE TABLE CUSTOMERS( name varchar(10), age int)";
//    	         
//    	      stmt.execute(query1);
//    	      System.out.println("Table Created......");
//    String query2= "insert into customers values('rayona',22)";
//    stmt.execute(query2);
    String query3= "insert into customers values('amru',21),('migha',23),('merin',20)";
    stmt.execute(query3);
    
      //Executing the query
//      stmt.execute(query);
//      System.out.println("Database created");
   }
}