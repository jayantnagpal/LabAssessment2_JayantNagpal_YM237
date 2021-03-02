package com.customerapp.model.dao;

import java.sql.Date;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String mobileNo;
	private Date dob;
	public Customer() {

	}
	
	
	public Customer(int id, String name, String address, String mobileNo, Date dob) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}


	public Customer(String name, String address, String mobileNo, Date dob) {
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getId() {
		return id;
	}
	public Date getDob() {
		return dob;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=").append(id).append(", name=").append(name).append(", address=").append(address)
				.append(", mobileNo=").append(mobileNo).append(", dob=").append(dob).append("]");
		return builder.toString();
	}
	
	
	
	

}
