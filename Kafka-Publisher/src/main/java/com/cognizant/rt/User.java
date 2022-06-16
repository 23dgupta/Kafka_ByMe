package com.cognizant.rt;

import java.util.Arrays;

public class User {
	
	private Integer id;
	private String name;
	private String[] address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String[] address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String[] getAddress() {
		return address;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + Arrays.toString(address) + "]";
	}
	
	

}
