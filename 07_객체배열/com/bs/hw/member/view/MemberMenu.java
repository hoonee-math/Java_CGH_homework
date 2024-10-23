package com.bs.hw.member.view;

import java.util.Scanner;

import com.bs.hw.member.model.controller.MemberController;
import com.bs.hw.member.model.vo.Member;

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
		System.out.println();
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
				case 1: insertMember(); flag=false; mainMenu(); break;
				case 2: searchMember(); flag=false; mainMenu(); break;
				case 3: updateMember(); flag=false; mainMenu(); break;
				case 4: deleteMember(); flag=false; mainMenu(); break;
				case 5: printAll(); flag=false; mainMenu(); break;
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
		boolean checkId = false, checkGender = false;
		System.out.println("새 회원을 등록합니다.");
		System.out.print("Sample data 를 입력하시겠습니까(Y/N) : ");
		char sample = sc.next().charAt(0);
		String id = "";
		if(sample=='Y'||sample=='y')
			mc.sampleDataInput();
		else {
			while(!checkId) {
				System.out.print("아이디 : ");
				id = sc.next();
				checkId = mc.checkId(id);
				if(!checkId) {
					System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				}
			}
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			String gender = "";
			while(!checkGender) { // M,m,F,f 이면 true, 아니면 false
				System.out.print("성별(M/F) : ");
				gender = sc.next(); // Member 클래스에서만 char 그 전까지는 String
				char genderChar = gender.charAt(0);
				boolean checkChar = genderChar=='M'||genderChar=='m'||genderChar=='F'||genderChar=='f';
				if(gender.length()==1 && checkChar)
					checkGender = true;
				else {
					checkGender = false;
					System.out.println("성별을 다시 입력하세요.");
				}
					
			}
			System.out.print("나이 : ");
			int age = sc.nextInt();
			// MemberController 의 insertMember 메소드에 매개변수로 전달!
			mc.insertMember(id, name, password, email, gender, age);
		}
	}
	//검색 메뉴 출력 메소드
	public void searchMember() {
		System.out.println("1.아이디로 검색하기");
		System.out.println("2.이름으로 검색하기");
		System.out.println("3.이메일로 검색하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int searchNum = sc.nextInt();
		switch(searchNum) {
		case 1: searchId(); break;
		case 2: searchName(); break;
		case 3: searchEmail(); break;
		case 9: mainMenu(); break;
		default : System.out.println("잘못 입력하셨습니다."); mainMenu(); break;
		}
		
	}
	//아이디 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchId() {	
		System.out.print("검색할 아이디 : ");
		String memberInfo =mc.searchId(sc.next());
		if(memberInfo!=null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(memberInfo);
		} else {
			System.out.println("검색 결과가 없습니다.");
			mainMenu();
		}
	}
	//이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String memberInfo = mc.searchName(sc.next()).inform();
		if(memberInfo!=null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(memberInfo);
		} else {
			System.out.println("검색 결과가 없습니다.");
			mainMenu();
		}
	}
	//이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchEmail() {
		System.out.print("검색할 이름 : ");
		String memberInfo = mc.searchEmail(sc.next()).inform();
		if(memberInfo!=null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(memberInfo);
		} else {
			System.out.println("검색 결과가 없습니다.");
			mainMenu();
		}
	}
	//수정 메뉴 출력 메소드
	public void updateMember() {
		System.out.println("1.비밀번호 수정하기");
		System.out.println("2.이름 수정하기");
		System.out.println("3.이메일 수정하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int searchNum = sc.nextInt();
		switch(searchNum) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9: mainMenu(); break;
		default : System.out.println("잘못 입력하셨습니다."); mainMenu(); break;
		}
		
	}
	//비밀번호 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updatePassword(){
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 비밀번호 : ");
		String pw = sc.next();
		boolean success = mc.updatePassword(id, pw);
		System.out.println(success?"수정이 성공적으로 되었습니다.":"해당 회원이 존재하지 않습니다.");
	}
	//이름 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		boolean success = mc.updateName(id, name);
		System.out.println(success?"수정이 성공적으로 되었습니다.":"해당 회원이 존재하지 않습니다.");
	}	
	//이메일 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		boolean success = mc.updateEmail(id, email);
		System.out.println(success?"수정이 성공적으로 되었습니다.":"해당 회원이 존재하지 않습니다.");
	}	
	//삭제 메뉴 출력 메소드
	public void deleteMember() {	
		System.out.println("1.특정 회원 삭제하기");
		System.out.println("2.모든 회원 삭제하기");
		System.out.println("9.메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int selectMenu = sc.nextInt();
		switch(selectMenu) {
		case 1: deleteOne(); mainMenu(); break;
		case 2: deleteAll(); mainMenu(); break;
		case 9: System.out.println("메인으로 돌아갑니다."); mainMenu(); break;
		}
	}
	//하나의 회원 삭제 결과를 출력하는 메소드
	public void deleteOne() { // 정말 삭제할지 controller 안에서 물어봄
		System.out.print("삭제할 회원의 아이디 : ");
		String name = sc.next();
		boolean success = mc.delete(name);
		System.out.println(success?"성공적으로 삭제하였습니다.":"해당 회원이 존재하지 않습니다.");
	}
	//전체 회원 삭제 결과를 출력하는 메소드
	public void deleteAll() { // 정말 삭제할지 Menu view 에서 물어봄
		boolean checkChar = false;
		while(!checkChar) {
			System.out.print("정말 삭제하시겠습니까?(y/n) : ");
			String deleteYN = sc.next(); // Member 클래스에서만 char 그 전까지는 String
			char delelteChar = deleteYN.charAt(0);
			checkChar = deleteYN.length()==1 && (delelteChar=='Y'||delelteChar=='y'||delelteChar=='N'||delelteChar=='n');
			if(checkChar)
				mc.delete();
			else {
				System.out.println("삭제가 되지 않았습니다.");
			}
		}
		
		
	}
	//전체 회원을 출력하는 메소드
	public void printAll() {
		if(mc.printAll().length==0) {
			System.out.println("등록되 회원이 없습니다.");
		}
		for(Member m : mc.printAll()) {
			if(m!=null)
				System.out.println(m.inform());
		}
	}
	
}
