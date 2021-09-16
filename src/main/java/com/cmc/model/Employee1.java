package com.cmc.model;

public class Employee1 {
	private Long id;
	private String name_employee;
	private String email;
	private int age;
	private String gender;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(Long id, String name_employee, String email, int age, String gender) {
		super();
		this.id = id;
		this.name_employee = name_employee;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName_employee() {
		return name_employee;
	}
	public void setName_employee(String name_employee) {
		this.name_employee = name_employee;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
