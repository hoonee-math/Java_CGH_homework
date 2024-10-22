package com.obj.model.vo;

//06_객체/04_필드실습.txt
public class Person {
//	사람클래스를 만들어서 활용하자
//	com.obj.model.vo패키지에 선언
//	이름, 주소, 전화번호, 키, 몸무게
//	저장
//	이름, 주소는 클래스내부에서만 활용가능
//	전화번호 키, 몸무게는 외부패키지에서 활용가능
//
//	두개의 사람클래스를 생성해서
//	각각
//	01036446259 180.5 65.5
//	01012345678 195.5 100.2
//	저장 후 출력하기
	private String name;
	private String address;
	public String phone;
	public double height;
	public double weight;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String phone, double height, double weight) {
		super();
		this.phone = phone;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Person(String name, String address, String phone, double height, double weight) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.height = height;
		this.weight = weight;
	}
	
	public void printInfo() {
		System.out.println(name+" "+address+" "+phone+" "+height+" "+weight);
	}
}
