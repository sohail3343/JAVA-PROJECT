package com.pro.Dao;

import java.util.List;

import com.pro.pojo.Employee;

public interface EmployeeDao {
	public abstract void create(Employee e);
	public abstract List<Employee> read();
	
}

