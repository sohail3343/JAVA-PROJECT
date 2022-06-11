package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Khan@3343");
		
		String q="create table table4(Tid int primary key auto_increment,Tname varchar(200) not null,Tcity varchar(200))";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(q);
		System.out.println("table created in database");
		String q1="insert into table4 values(?,?,?)";
		PreparedStatement p = con.prepareStatement(q1);
		p.setInt(1, 20);
		p.setString(2, "murgbaz");
		p.setString(3, "hyderabad");
		p.executeUpdate();
		System.out.println("values inserted");
		String q2="select * from table4";
		ResultSet set = p.executeQuery(q2);
		while(set.next())
		{
			int id=set.getInt(1);
			String name=set.getString(2);
			String city =set.getString(3);
			System.out.println(id+" "+name+" "+city);
		}
		
		
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
