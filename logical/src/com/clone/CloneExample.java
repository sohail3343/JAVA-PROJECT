package com.clone;

public class CloneExample implements Cloneable {
 private int id;
 private String name;
	
	
public CloneExample(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}



public CloneExample() {
	super();
	// TODO Auto-generated constructor stub
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



@Override
public String toString() {
	return "CloneExample [id=" + id + ", name=" + name + "]";
}



public static void main(String[] args) throws CloneNotSupportedException {
	CloneExample c1=new CloneExample();
	
	
	  c1.setId(1); c1.setName("sohail");
	 
	CloneExample c2=(CloneExample)c1.clone();

	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1);
	System.out.println(c2);
	c2.setName(null);
	System.out.println(c2);
	
}
}
