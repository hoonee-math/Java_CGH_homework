package com.myobj.run;

import java.util.Arrays;

import com.myobj.vo.Member;
import com.myobj.vo.Product;
import com.myobj.vo.Product2;

public class Main {

	public static void main(String[] args) {

//06_객체/01_필드이용실습.txt
//		myobject프로젝트를 생성하고
//		com.myobj.run.Main -> 1, 2, 3 객체를 생성하고 출력하기
//		com.myobj.vo.Member
//		1. 우리는 커뮤니티사이트를 만들기 위해
//		회원가입을 받으려고한다. 회원에 대한
//		정보를 저장할 객체를 만드세요!
//		 아이디, 비밀번호, 이메일, 나이, 취미의 정보가 
//		필요하다 * 객체를 생성해서 직접접근해서 데이터를 저장 2개
//		admin 1234 admin@admin.com 55 운동,코딩
//		user01 1111 user01@user01.com 33 코딩
//		minhyuk 12345 minhyuk@minhyuk.com 21 코딩,러닝,편식
//		생성 후 출력하기
		
		System.out.println("== 객체/01_필드이용실습.txt ==");
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		m1.setId("admin");
		m1.setPw("1234");
		m1.setEmail("admin@admin.com");
		m1.setAge(55);
		m1.setHobby(new String[] {"운동","코딩"});

//		admin 1234 admin@admin.com 55 운동,코딩
//		user01 1111 user01@user01.com 33 코딩
//		minhyuk  minhyuk@minhyuk.com 21 코딩,러닝,편식
		m2.setId("user01");
		m2.setPw("1111");
		m2.setEmail("user01@user01.com");
		m2.setAge(33);
		m2.setHobby(new String[] {"코딩"});
		
		m3.setId("minhyuk");
		m3.setPw("12345");
		m3.setEmail("minhyuk@minhyuk.com");
		m3.setAge(21);
		m3.setHobby(new String[] {"코딩","러닝","편식"} );
		
		System.out.println(
				m1.getId()+" "+m1.getPw()+" "+m1.getEmail()+" "+m1.getAge()+" "+Arrays.toString(m1.getHobby())+"\n"+
				m2.getId()+" "+m2.getPw()+" "+m2.getEmail()+" "+m2.getAge()+" "+Arrays.toString(m2.getHobby())+"\n"+
				m3.getId()+" "+m3.getPw()+" "+m3.getEmail()+" "+m3.getAge()+" "+Arrays.toString(m3.getHobby())+"\n"
				);
		
//06_객체/02_객체생성자연습.txt		
//		3. 상품 -> 생성자를 이용해서 아래 상품을 생성 후 출력
//		   맥북 590 그레이 0.2
//		   갤럭시S24 180 블랙 0.1
//		   아파트34평 40000... 핫핑크 0
//		4. 상품추가 후 아래처럼 출력 * 매개변수있는 생성자활용
//		   책상 200 null 0.0
//		   이어폰 30 화이트
//		   자동차 800 블랙 0.3
		System.out.println("== 객체/02_객체생성자연습.txt ==");
		Product p1 = new Product("맥북",590,"그레이",0.2);
		Product p2 = new Product("갤럭시S24", 180, "블랙", 0.1);
		Product p3 = new Product("아파트34평", 40000, "핫핑크", 0);
		Product p4 = new Product("책상", 200, null, 0.0);
		Product p5 = new Product("이어폰", 30, "화이트");
		Product p6 = new Product("자동차", 800, "블랙", 0.3);
		
		System.out.println(
				p1.getProductNo()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getColor()+" "+p1.getDiscount()+"\n"+
				p2.getProductNo()+" "+p2.getName()+" "+p2.getPrice()+" "+p2.getColor()+" "+p2.getDiscount()+"\n"+
				p3.getProductNo()+" "+p3.getName()+" "+p3.getPrice()+" "+p3.getColor()+" "+p3.getDiscount()+"\n"+
				p4.getProductNo()+" "+p4.getName()+" "+p4.getPrice()+" "+p4.getColor()+" "+p4.getDiscount()+"\n"+
				p5.getProductNo()+" "+p5.getName()+" "+p5.getPrice()+" "+p5.getColor()+" "+p5.getDiscount()+"\n"+
				p6.getProductNo()+" "+p6.getName()+" "+p6.getPrice()+" "+p6.getColor()+" "+p6.getDiscount()+"\n"
				);
		
//06_객체/03_클래스 생성자 실습.txt
//		각 객체 생성 후 내용 출력하기 생성은 매개변수 생성자로할것
//		컴퓨터, maxbook, 200
//		핸드폰, 갤럭시노트, 120, 0.2
//		마스크, 10, 0.5, 100
//		출력시에는 전체 필드출력하기
//		* 다 하신분 
//		  -> 생성시 마다 상품번호가 1부터 1씩증가해서 대입
		System.out.println("== 객체/03_클래스생성자실습.txt ==");
		Product2 p2_1 = new Product2("컴퓨터", "maxbook", 200);
		Product2 p2_2 = new Product2("핸드폰", "갤럭시노트", 120, 0.2);
		Product2 p2_3 = new Product2("마스크", 10, 0.5, 100);
		System.out.println(
				p2_1.getProductNo()+" "+p2_1.getType()+" "+p2_1.getName()+" "+p2_1.getPrice()+" "+p2_1.getDiscount()+" "+p2_1.getStock()+"\n"+
				p2_2.getProductNo()+" "+p2_2.getType()+" "+p2_2.getName()+" "+p2_2.getPrice()+" "+p2_2.getDiscount()+" "+p2_2.getStock()+"\n"+
				p2_3.getProductNo()+" "+p2_3.getType()+" "+p2_3.getName()+" "+p2_3.getPrice()+" "+p2_3.getDiscount()+" "+p2_3.getStock()+"\n"
				);
	}

}
