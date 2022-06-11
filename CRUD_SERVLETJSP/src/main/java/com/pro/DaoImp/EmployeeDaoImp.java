package com.pro.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pro.Dao.EmployeeDao;
import com.pro.pojo.Employee;
import com.pro.utility.DbConnection;

public class EmployeeDaoImp implements EmployeeDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	@Override
	public void create(Employee e) {

		String query = "insert into Employee(name,salary,address) values (?,?,?)";
		Connection con = DbConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, e.getName());
			ps.setDouble(2, e.getSalary());
			ps.setString(3, e.getAddress());
			ps.executeUpdate();

		} catch (SQLException e1) {

			e1.printStackTrace();
		}

	}

	public List<Employee> read() {
		String query = "select * from Employee";
		con = DbConnection.getConnection();
		List<Employee> list = new ArrayList<Employee>();
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setAddress(rs.getString("address"));
				list.add(employee);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return list;
	}

}
