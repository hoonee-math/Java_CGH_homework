package com.bs.practice.inherit.vo;

public class Employee extends Person {

	private String department;
	private String phone;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, char gender, String department, String phone) {
		super(name, age, gender);
		this.department = department;
		this.phone = phone;
	}

	public String getDepartement() {
		return department;
	}

	public void setDepartement(String department) {
		this.department = department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+department+" "+phone;
	}
	
}
