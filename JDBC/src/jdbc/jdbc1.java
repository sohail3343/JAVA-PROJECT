package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc1 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/learn";
		String username="root";
		String paasword="Khan@3343";
		Connection con = DriverManager.getConnection(url, username, paasword);
		if(con.isClosed())
		{
			System.out.println("connection is closed");
		}
		else
		{
			System.out.println("connection is created");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
