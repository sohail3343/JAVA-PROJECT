package com.pro.pojo;
import java.io.Serializable;
public class Employee implements Serializable {
private int id;
private String name;
private double salary;
private String address;
public Employee() {
	super();
	
}
public Employee(int id, String name, double salary, String address) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
}



}
