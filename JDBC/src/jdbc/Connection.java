package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connection {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sohail";
		String username="root";
		String password="Khan@3343";
		java.sql.Connection con = DriverManager.getConnection(url, username, password);
		if(con.isClosed())
		{
			System.out.println("connection is closed");
			
		}
		else
		{
			System.out.println("connection is created");
		}
		/*
		 * String q="insert into table1(tid,tname,tcity) values(?,?,?)";
		 * PreparedStatement pstmt = con.prepareStatement(q); pstmt.setInt(1, 120);
		 * pstmt.setString(2,"mudda" ); pstmt.setString(3, "mumbai"); pstmt.execute();
		 * ResultSet r = pstmt.executeQuery(q); while(r.next()) { int id=r.getInt(1);
		 * String name=r.getString(2); String city=r.getString(3);
		 * System.out.println(name); System.out.println(id); System.out.println(city); }
		 * System.out.println("inserted");
		 */
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
