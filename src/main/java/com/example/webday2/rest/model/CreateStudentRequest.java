package com.example.webday2.rest.model;

public class CreateStudentRequest {

	private String name;
	private int age;
	private String address;

	// Generate simple getter/setter
	public String getFullName() {
		return name;
	}

	public void setFullName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
