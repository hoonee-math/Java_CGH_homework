package com.bs.practice.inherit.vo;

//06_상속실습.txt
public class Teacher extends Person {

	private String major;
	private String subject;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, char gender, String major, String subject) {
		super(name, age, gender);
		this.major = major;
		this.subject = subject;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+major+" "+subject;
	}
	
	
}
