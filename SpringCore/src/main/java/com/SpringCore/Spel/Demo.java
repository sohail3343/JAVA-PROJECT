package com.SpringCore.Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{11+11+11}")	
private int x;
	@Value("#{22+22-22}")
private int y;
	@Value("#{T(java.lang.Math).sqrt(144)}")
private double d;
	@Value("#{T(java.lang.Math).PI}")
private double z;
	@Value("#{new java.lang.String('sohail')}")
private String name;
@Value("#{8>3}")	
private boolean isActive;
	
	
public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

public int getX() {
	return x;
}

public double getD() {
	return d;
}

public void setD(double d) {
	this.d = d;
}

public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}

@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", d=" + d + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
}





}
