package com.obj.model.vo;

//06_객체/06_필드 이용하는 메소드실습.txt
public class Developer {
	//이름, 년차, 주언어, 연봉
	//1.각 필드는 private으로 선언
	private String name;
	private int year;
	private String mainLanguage;
	private int salary;
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	// 각 필드를 생성자를 이용해서 값을 저장?!
//	public Developer(String name) {
//		super();
//		this.name = name;
//	}
//	public Developer(int year) {
//		super();
//		this.year = year;
//	}
//	public Developer(String mainLanguage) {
//		super();
//		this.mainLanguage = mainLanguage;
//	}
//	public Developer(int salary) {
//		super();
//		this.salary = salary;
//	}
	//2.각 필드를 생성자를 이용해서 값을 저장
	public Developer(String name, int year, String mainLanguage, int salary) {
		this.name = name;
		this.year = year;
		this.mainLanguage = mainLanguage;
		this.salary = salary;
	}
	//4.연봉값만 수정할 수 있는 메소드 만들기
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//5.연봉값만 출력하는 메소드 만들기
	public void printSalary() {
		System.out.println(salary);
	}
	//6.주언어를 수정하는 메소드만들기
	public void setMainLanguage(String mainLanguage) {
		this.mainLanguage = mainLanguage;
	}
	//7.주언어를 반환하는 메소드만들기
	public String getMainLanguage() {
		return mainLanguage;
	}
	
	//3.각 필드에 있는 값을 출력해주는 메소드 만들기.
	public void printField() {
		System.out.println(name+" "+year+" "+mainLanguage+" "+salary);
	}
}
