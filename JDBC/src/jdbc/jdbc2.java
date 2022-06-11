package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc2 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sohail";
		String username="root";
		String password="Khan@3343";
		Connection con = DriverManager.getConnection(url, username, password);
		if(con.isClosed())
		{
			System.out.println("connection is closed");
		}
		else
		{
			System.out.println("connection is created");
		}
		
		  String
		  q="create table sohail3(sid int primary key,sname varchar(200) not null,scity varchar(200))"
		  ; Statement stmt = con.createStatement(); stmt.executeUpdate(q);
		  System.out.println("table is created");
		 
		String q1="insert into sohail3(sid,sname,scity)Values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(q1);
		pst.setInt(1, 102);
		pst.setString(2,"sam");
		pst.setString(3, "amchi mumbai");
		pst.executeUpdate();
		System.out.println("inserted");
		String q2="select * from sohail3 where name=sam";
		ResultSet set = stmt.executeQuery(q2);
		while(set.next())
		{
			int id = set.getInt("sid");
		 String name = set.getString("sname");
		 String city = set.getString("city");
		 System.out.println(id);
		 System.out.println(name);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
