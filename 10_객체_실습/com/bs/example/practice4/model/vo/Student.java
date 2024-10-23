package com.bs.example.practice4.model.vo;

//02_0_필드 실습예제3
//02_2_필드 초기화 실습예제1
public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade=1;
		classroom = 9;
		name="최광훈";
		height=174.5;
		gender='M';
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public static int getGrade() {
		return grade;
	}
	public static void setGrade(int grade) {
		Student.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public void information() {
		System.out.println(grade+" "+classroom+" "+name+" "+height+" "+gender);
	}
}
