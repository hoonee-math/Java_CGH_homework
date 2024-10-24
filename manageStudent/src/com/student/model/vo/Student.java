package com.student.model.vo;

import java.util.Objects;

// 학생 한명에 대한 정보들을 종합적으로 저장하는 클래스
public class Student extends Member { 
	private static int studentCount; // 학생 번호를 자동으로 부여하기 위한 작업
	private int studentNo;
//	private String name;
//	private int age;
	private int grade;
	private int classNumber;
//	private String phone;
//	private String address;
	private double height;
//	private char gender;
	
	//단축키
	// 기본생성자 - ctrl+space 뭘 만들지 않았다면 엔터까지 누르면 기본생성자 바로 생성됨.
	// 매개변수 있는 생성자 - alt+s+a+g // 맥북은 [source] [generate constructor space]
	// setter/getter 만들기 - alt+s+r+a+r // 맥북은 [source] [generate getter/setter] [select all]
	
	// 1011-4-8 학생 번호를 자동으로 생성하는 로직 - 초기화 블럭!
	{
		studentNo=++studentCount;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int memberNo, String name, int age, String phone, String address, char gender, int studentNo,
				int grade, int classNumber, double height) {
			super(memberNo, name, age, phone, address, gender);
			this.studentNo = studentNo;
			this.grade = grade;
			this.classNumber = classNumber;
			this.height = height;
		}

	public Student(String name, int age, int grade, int classNumber, String phone, String address,
			double height, char gender) {
		super(name, age, phone, address, gender);
		this.grade = grade;
		this.classNumber = classNumber;
		this.height = height;
	}
//
//	public static int getStudentCount() {
//		return studentCount;
//	}
//
//	public int getStudentNo() {
//		return studentNo;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public int getGrade() {
//		return grade;
//	}
//
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//
//	public int getClassNumber() {
//		return classNumber;
//	}
//
//	public void setClassNumber(int classNumber) {
//		this.classNumber = classNumber;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public double getHeight() {
//		return height;
//	}
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
	
	public static int getStudentCount() {
		return studentCount;
	}

	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// 학생 정보를 출력해주는 기능 만들어 두기
	public String infoStudent() {
		return this.studentNo+" "+getName()
				+" "+getAge()+" "+grade
				+" "+classNumber+" "+getPhone()
				+" "+getAddress()+" "+height
				+" "+getGender();
	}
	
	@Override
	public boolean equals(Object o) { //equals 를 객체 동등성 비교를 위해서 
		if(this == o){
			return true;
		}
		if(o instanceof Student) {
			Student inputStudent = (Student)o;
			if(this.getName().equals(inputStudent.getName()) 
					&&this.getAge()==inputStudent.getAge()
					&&this.grade==inputStudent.getGrade()
					&&this.classNumber==inputStudent.getClassNumber()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getName(),this.getAge(),
				this.getGender(),this.grade,this.classNumber);
	}
	
}
