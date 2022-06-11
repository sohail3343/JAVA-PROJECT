package com.hibernate;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name ="student_address")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_address")
private int addressid;
	@Column(length = 50)
private String street;
	
private String city;

private boolean isOpen;
@Transient
private double x;
@Temporal(TemporalType.DATE)
private Date addeddate;

@Lob

private byte [] image;

public Address() {
	super();
	
}

public Address(int addressid, String street, String city, boolean isOpen, double x, Date addeddate, byte[] image) {
	super();
	this.addressid = addressid;
	this.street = street;
	this.city = city;
	this.isOpen = isOpen;
	this.x = x;
	this.addeddate = addeddate;
	this.image = image;
}

public int getAddressid() {
	return addressid;
}

public void setAddressid(int addressid) {
	this.addressid = addressid;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public boolean isOpen() {
	return isOpen;
}

public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public Date getAddeddate() {
	return addeddate;
}

public void setAddeddate(Date addeddate) {
	this.addeddate = addeddate;
}

public byte[] getImage() {
	return image;
}

public void setImage(byte[] image) {
	this.image = image;
}

@Override
public String toString() {
	return "Address [addressid=" + addressid + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x="
			+ x + ", addeddate=" + addeddate + ", image=" + Arrays.toString(image) + "]";
}


}
