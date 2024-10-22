package com.bs.practice.inherit.vo;

public class Student extends Person {

	private String study;
	private int classNumber;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, char gender, String study, int classNumber) {
		super(name, age, gender);
		this.study = study;
		this.classNumber = classNumber;
	}

	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+study+" "+classNumber+"반";
	}
	
	
}
