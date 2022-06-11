package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUD {
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
		System.out.println("connection created");
	}
	/*
	 * String q="delete from sohail1 where sname='sam'"; PreparedStatement pst =
	 * con.prepareStatement(q); pst.executeUpdate(); System.out.println("deleted");
	 */
	  String q1="select * from sohail1 where sid=12";
	  Statement st = con.createStatement();
	  ResultSet rt = st.executeQuery(q1);
	  while(rt.next())
	  {
		  int id=rt.getInt("sid");
		  String name=rt.getString("sname");
		  System.out.println(id);
		  System.out.println(name);
		  
	  }
	 
	 
	
	
} catch (Exception e) {
	e.printStackTrace();
}
	
}
}
