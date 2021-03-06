package com.tnsif.onetone.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	//@Column(name="ADDRESS_ID")
	private int address_id;
	
	//@Column(name="ADDRESS_DNO")
	private int dno;
	
	//@Column(name="ADDRESS_STREET")
	private String street;
	
	//@Column(name="ADDRESS_CITY")
	private String city;
	
	//@Column(name="ADDRESS_PINCODE")
	private long pincode;

	@OneToOne(mappedBy="address_id")
	private Student student;
	
	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
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

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	

}
