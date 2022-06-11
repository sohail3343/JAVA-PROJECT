package com.SpringCore.Standalone.Collections;

import java.util.List;
import java.util.Map;

public class Person {
private List<String> friends;
private Map<String, Integer> feeStructure;

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

public Map<String, Integer> getFeeStructure() {
	return feeStructure;
}

public void setFeeStructure(Map<String, Integer> feeStructure) {
	this.feeStructure = feeStructure;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public Person(List<String> friends) {
	super();
	this.friends = friends;
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", feeStructure=" + feeStructure + "]";
}



}
