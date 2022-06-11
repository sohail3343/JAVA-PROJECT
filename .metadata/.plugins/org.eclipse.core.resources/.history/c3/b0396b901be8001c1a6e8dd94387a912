package com.SpringCore.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("sameer ")
	
private String name;
	@Value("mumbai")
private String city;
	@Value("#{sohail}")
	private List<String> address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
}


}
