package com.example.demo.model;

public class User {
	
	private Address address;
	private Company company;
//	public User(Address address, Company company) {
//		super();
//		this.address = address;
//		this.company = company;
//	}
	
	public Address getAddress() {
		return address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	


}
