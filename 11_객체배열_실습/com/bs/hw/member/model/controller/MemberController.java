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
		if(m.length==0) {
			return true;
		}
		for(Member member : m) {
			if(member==null) {
				continue;
			}
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
				System.out.printf("m[%d] 저장소에 새 회원 정보 등록됨!\n",i);
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
		return null;
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
//		for(Member member : m) {
//			if(member.getId().equals(id))
//				while(true) {
//					System.out.print(member.getName()+"님에 대한 정보를 정말 삭제하시겠습니까(Y/N): ");
//					char doDelete = sc.next().charAt(0); 
//					String tempId = member.getId();
//					if(doDelete=='y'||doDelete=='Y') {
//						member = new Member();
//						System.out.print(tempId+"님의 정보가 삭제되었습니다.");
//						break;
//					}
//					else if(doDelete=='n'||doDelete=='N')
//						System.out.print(tempId+"님의 정보가 삭제되지 않았습니다..");
//						break;
//				}
//			return true;
//		}
		for(int i=0; i<SIZE ; i++) {
			if(m[i].getId().equals(id)) {
				while(true) {
					System.out.print(m[i].getName()+"님에 대한 정보를 정말 삭제하시겠습니까(Y/N): ");
					char doDelete = sc.next().charAt(0); 
					String tempId = m[i].getId();
					if(doDelete=='y'||doDelete=='Y') {
						m[i] = null;
						System.out.print(tempId+"님의 정보가 삭제되었습니다.");
						break;
					}
					else if(doDelete=='n'||doDelete=='N')
						System.out.print(tempId+"님의 정보가 삭제되지 않았습니다..");
						break;
				}
			return true;
			}
		}
		return false;
	}
	//전체 회원을 삭제하는 메소드
	public void delete() {
		for(int i=0; i<SIZE ; i++) {
			m[i]=null;
		}
		System.out.println("성공적으로 삭제하였습니다.");
	}
	//Member 객체 반환 메소드
	public Member[] printAll() {
		return m;
	}
	
	public void sampleDataInput() {
		insertMember("aaaaa", "박신우", "aa", "aaa@aaa.aaa", "F", 33);
		insertMember("bbbbb", "강고결", "bb", "bbb@bbb.bbb", "M", 34);
		insertMember("ccccc", "남나눔", "cc", "ccc@ccc.ccc", "M", 28);
		insertMember("ddddd", "도대담", "dd", "ddd@ddd.ddd", "M", 35);
		insertMember("eeeee", "류라라", "ee", "eee@eee.eee", "F", 17);
		insertMember("fffff", "문미미", "ff", "fff@fff.fff", "F", 20);
		insertMember("ggggg", "박보배", "gg", "ggg@ggg.ggg", "M", 26);
		insertMember("hhhhh", "송성실", "hh", "hhh@hhh.hhh", "M", 41);
		insertMember("iiiii", "윤예의", "ii", "iii@iii.iii", "F", 28);
		insertMember("jjjjj", "정재주", "jj", "jjj@jjj.jjj", "M", 23);
	}
}
