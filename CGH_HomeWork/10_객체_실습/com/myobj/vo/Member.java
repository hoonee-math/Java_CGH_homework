package com.myobj.vo;

//객체/01_필드이용실습.txt
public class Member {
//	myobject프로젝트를 생성하고
//	com.myobj.run.Main -> 1, 2, 3 객체를 생성하고 출력하기
//	com.myobj.vo.Member
//	1. 우리는 커뮤니티사이트를 만들기 위해
//	회원가입을 받으려고한다. 회원에 대한
//	정보를 저장할 객체를 만드세요!
//	 아이디, 비밀번호, 이메일, 나이, 취미의 정보가 
//	필요하다 * 객체를 생성해서 직접접근해서 데이터를 저장 2개
//	admin 1234 admin@admin.com 55 운동,코딩
//	user01 1111 user01@user01.com 33 코딩
//	minhyuk 12345 minhyuk@minhyuk.com 21 코딩,러닝,편식
//	생성 후 출력하기
	private String id;
	private String pw;
	private String email;
	private int age;
	private String[] hobby;
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String pw, String email, int age, String[] hobby) {
		super();
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.age = age;
		this.hobby = hobby;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
}
