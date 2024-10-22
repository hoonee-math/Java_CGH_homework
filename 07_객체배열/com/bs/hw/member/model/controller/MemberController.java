package com.bs.hw.member.model.controller;

import java.util.Scanner;

import com.bs.hw.member.model.vo.Member;

public class MemberController {
	
	public static final int SIZE=10;
	Member[] m = new Member[SIZE];
	
	//현재 존재하는 멤버 수 반환
	public int existMemberNum() {
		int existMemberNum = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null)
				existMemberNum++;
		}
		return existMemberNum;
	}
	//아이디 중복확인 하는 메소드(중복이면 false, 중복안되면 true)
	public boolean checkId(String inputId) {
		for(Member member : m) {
			if(member.getId().equals(inputId)){
				return false;
			}
		}
		return true;
	}
	//Member객체를 객체배열에 저장하는 메소드
	public void insertMember(
			String id, String name, String password,
			String email, String gender, int age) {
		for(int i=0; i<SIZE; i++) {
			if(m[i]==null) {
				m[i] = new Member(id,name,password,email,gender.charAt(0),age);
				System.out.printf("m[%d] 저장소에 새 회원 정보 등록됨!",i);
				break;
			}
		}
	}
	//id로 회원을 조회하는 메소드
	public String searchId(String id) {
		for(Member member : m) {
			if(member.getId().equals(id))
				return member.inform();
		}
		return "해당하는 회원이 존재하지 없습니다.";
	}
	//이름으로 회원을 조회하는 메소드
	public Member searchName(String name) {
		for(Member member : m) {
			if(member.getName().equals(name))
				return member;
		}
		return null;
	}
	//이메일로 회원을 조회하는 메소드
	public Member searchEmail(String email) {
		for(Member member : m) {
			if(member.getEmail().equals(email))
				return member;
		}
		return null;
	}
	//비밀번호 변경 메소드
	public boolean updatePassword(String id, String password) {
		for(Member member : m) {
			if(member.getId().equals(id))
				member.setPassword(password);
			return true;
		}
		return false;
	}
	//이름 변경 메소드
	public boolean updateName(String id, String name) {
		for(Member member : m) {
			if(member.getId().equals(id))
				member.setName(name);
			return true;
		}
		return false;
	}
	//이메일 변경 메소드
	public boolean updateEmail(String id, String email) {
		for(Member member : m) {
			if(member.getId().equals(id))
				member.setEmail(email);
			return true;
		}
		return false;
	}
	//한 회원만 삭제하는 메소드
	public boolean delete(String id) {
		Scanner sc = new Scanner(System.in);
		for(Member member : m) {
			if(member.getId().equals(id))
				while(true) {
					System.out.print(member.getName()+"님에 대한 정보를 정말 삭제하시겠습니까(Y/N): ");
					char doDelete = sc.next().charAt(0); 
					if(doDelete=='y'||doDelete=='Y') {
						member = null;
						System.out.print(member.getId()+"님의 정보가 삭제되었습니다.");
						break;
					}
					else if(doDelete=='n'||doDelete=='N')
						System.out.print(member.getId()+"님의 정보가 삭제되지 않았습니다..");
						break;
				}
			return true;
		}
		return false;
	}
	//전체 회원을 삭제하는 메소드
	public void delete() {
		for(Member member : m) {
			member = null;
			System.out.println("폭탄이다~~ 모든 회원정보가 날아가버렸네 ㅋㅋㅋ");
		}
	}
	//Member 객체 반환 메소드
	public Member[] printAll() {
		return m;
	}
}
