package com.student.model.vo;

public abstract class Member {
	
	private static int memberCount; // 학생 번호를 자동으로 부여하기 위한 작업
	private int memberNo;
	private String name;
	private int age;
	private String phone;
	private String address;
	private char gender;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int memberNo, String name, int age, String phone, String address, char gender) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}
	public Member(String name, int age, String phone, String address, char gender) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}

	public static int getMemberCount() {
		return memberCount;
	}

	public static void setMemberCount(int memberCount) {
		Member.memberCount = memberCount;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
