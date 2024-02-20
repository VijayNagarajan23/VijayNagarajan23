package org.Mysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {
	public static void main(String[] args) throws SQLException {
		String url,username,userpassword,query;
		url="Jdbc:Mysql://Localhost:3306";
		username="root";
		userpassword="root";
		
		query="SELECT post FROM mysqltest.user_table join mysqltest.user_post_table On user_table.id=user_post_table.userid where user_table.id=1";

		Connection Connection1=DriverManager.getConnection(url,username,userpassword);

		Statement statement = Connection1.createStatement();

		ResultSet result = statement.executeQuery(query);

		result.next();

		System.out.println(result.getString(1));
	}
		

		
}
	


