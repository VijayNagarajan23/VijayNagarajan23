package org.Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {
	
	public static void main(String[] Args) throws SQLException {

		 

		String Url,UserName,UserPassword,Query;

		 

		Url= "Jdbc:Mysql://Localhost:3306";

		UserName="Root";

		UserPassword="Admin";

		Query="SELECT Post FROM Mysqltest.User_table Join Mysqltest.User_post_table On User_table.Id=User_post_table.Userid Where User_table.Id=1";

		Connection Connection=DriverManager.getConnection(Url,UserName,UserPassword);

		Statement Statement = Connection.createStatement();

		ResultSet Result = Statement.executeQuery(Query);

		Result.next();

		System.out.println(Result.getString(1));

		}



}
