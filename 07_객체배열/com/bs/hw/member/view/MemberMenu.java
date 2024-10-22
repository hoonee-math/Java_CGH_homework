package com.bs.hw.member.view;

import java.util.Scanner;

import com.bs.hw.member.model.controller.MemberController;

public class MemberMenu {
	Scanner sc=new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() { // 기본생성자
		// TODO Auto-generated constructor stub
	}
	
	//메인 메뉴 출력 메소드
	public void mainMenu() {
//		 최대 등록 가능한 회원 수는 10명입니다. 
//		 현재 등록된 회원 수는 0명입니다. 
//		  // MemberController(mc)클래스 안에 있는 멤버필드를 이용하여  
//		  // 최대 등록 가능한 회원 수가 몇 명인지 출력 
//		  // 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로 
//		  // 몇 명이 등록되어 있는지 출력  
		System.out.println("최대 등록 가능한 회원 수는 "+mc.SIZE+"명입니다.");
		System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명입니다.");
//		 
//		  // 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력 
//		  // 현재 등록된 회원 수가 10명이 아닐 때 
//		  1. 새 회원 등록  è insertMember() 
//		  2. 회원 검색  è searchMember() 
//		  3. 회원 정보 수정 è updateMemner() 
//		  4. 회원 삭제  è deleteMember() 
//		  5. 모두 출력  è printAll() 
//		  9. 끝내기 
//		  메뉴 번호 :  
		if(mc.existMemberNum()<10) {
			System.out.println("1. 새 회원 등록");
		}
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 모두 출력");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호: ");
		int playNum = sc.nextInt();
		boolean flag = true;
		
		
		
		while(flag) {
			switch(playNum) {
				case 1: insertMember(); flag=false; break;
				case 2: searchMember(); flag=false; break;
				case 3: updateMember(); flag=false; break;
				case 4: deleteMember(); flag=false; break;
				case 5: printAll(); flag=false; break;
				case 9: return;
				default : flag=true;
			}
			if(flag) {
				System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.\n"
						+ "메뉴 번호: ");
				playNum = sc.nextInt();
			}
		}
	}
	//회원등록하기 위한 데이터를 사용자에게 입력 받는 메소드
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String emali = sc.next();
		System.out.print("성별(M/F) : ");
		String gender = sc.next(); // Member 클래스에서만 char 그 전까지는 String
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// MemberController 의 insertMember 메소드에 매개변수로 전달!
		mc.insertMember(id, name, password, emali, gender, age);
	}
	//검색 메뉴 출력 메소드
	public void searchMember() {	}
	//아이디 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchId() {	}
	//이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchName() {	}
	//이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchEmail() {	}
	//수정 메뉴 출력 메소드
	public void updateMember() {}
	//비밀번호 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updatePassword(){}
	//이름 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updateName() {	}	
	//이메일 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updateEmail() {	}	
	//삭제 메뉴 출력 메소드
	public void deleteMember() {}
	//하나의 회원 삭제 결과를 출력하는 메소드
	public void deleteOne() {	}
	//전체 회원 삭제 결과를 출력하는 메소드
	public void deleteAll() {	}
	//전체 회원을 출력하는 메소드
	public void printAll() {	}
	
}
