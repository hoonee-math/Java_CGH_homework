package com.bs.practice.inherit.controller;

import java.util.Arrays;

import com.bs.practice.inherit.vo.Driver;
import com.bs.practice.inherit.vo.Employee;
import com.bs.practice.inherit.vo.Person;
import com.bs.practice.inherit.vo.Student;
import com.bs.practice.inherit.vo.Teacher;

//06_상속실습.txt
public class InheritController {

	private int memberLength = 13;
	private Person[] member;
	
	public InheritController() {
		member = new Person[memberLength];
		member[0] = new Student("오민현",19,'M',"java",8);
		member[1] = new Teacher("유병승",34,'M',"알수 없읍","풀스텍");
		member[2] = new Teacher("유병승",34,'F',"java","풀스텍");
		member[3] = new Driver("최광훈",33,'M',"천안",2);	
		member[4] = new Driver("최광훈",33,'M',"천안",1);	
		member[5] = new Teacher("유병승",34,'F',"알수 없읍","풀스텍");
		member[6] = new Teacher("유병승",34,'M',"python","풀스텍");
		member[7] = new Employee("김민호",31,'M',"IT교육센터","010-9876-6543");
		member[8] = new Employee("김민호",31,'F',"운동부","010-1234-5678");
		member[9] = new Driver("최광훈",33,'F',"천안",2);	
		member[10] = new Driver("최광훈",33,'M',"아산",2);	
		member[11] = new Employee("김민호",31,'F',"IT교육센터","010-1234-5678");
		member[12] = new Employee("김민호",31,'M',"IT교육센터","010-1234-5678");
	}
	

	public void inheritClass() {
		System.out.println("===== inheritClass 실행됨 =====");

		for(Person p : member) {
			System.out.println(p);
		}
		System.out.println("\n");
	}
	
	public void instanceofClass() {
		System.out.println("===== instanceofClass 실행됨 =====");
		
		String[] types = new String[] {"Student","Teacher","Employee","Driver"};
		System.out.println(types[1]);
//		for(Person p : member) {
//			for(String t : types ) {
//				
//				if(p instanceof t) {}
//			}
//		}
				
		System.out.println(member[1].getClass());
		// 데이터 내부에 같은 객체가 존재하는지 일일이 확인한 후 같은 객체 출력 및 삭제
		// 외부로 입력받는 데이터와 같은 객체가 존재하면 삽입 실패 출력
		boolean isSame = false;
		boolean[] isCheck = new boolean[memberLength];
		System.out.println(Arrays.toString(isCheck)+"\n\n");
		
		String duplicatedMember = "";
		for(int i=0; i<member.length-1;i++) {
			if(isCheck[i]==true) continue;
//			String type = member[i].getClass().toString();
//			System.out.println(type);
			
			for(int j=i+1; j<member.length; j++) {
				if(isCheck[j]==true) continue;
				
				// 클래스가 서로 다르면 skip
				if(member[i].getClass()!=member[j].getClass()) continue;
				// 이름이 서로 다르거나, 나이가 서로 다르면 skip
				if(
						!( member[i].getName().equals(member[j].getName()) )
						|| (member[i].getAge()!=member[j].getAge())
					) continue;
				// 학생 : + 성별 반이 같으면 같은 객체
				if(member[i] instanceof Student) {
					isSame = member[i].getGender()==member[j].getGender()
							&& ((Student)member[i]).getClassNumber()==((Student)member[j]).getClassNumber();
				}
				// 선생 : + 전공과목이 같으면 같은 객체
				else if(member[i] instanceof Teacher) {
					isSame = ((Teacher)member[i]).getMajor().equals(((Teacher)member[j]).getMajor());
				}
				// 직원 : + 부서 가 같으면 같은 객체
				else if(member[i] instanceof Employee) {
					isSame = ((Employee)member[i]).getDepartement().equals(((Employee)member[j]).getDepartement());
				}
				// 운전 : + 성별 담당지역 운전경력이 같으면 같은 객체
				else if(member[i] instanceof Driver) {
					isSame = member[i].getGender()==member[j].getGender()
							&& ((Driver)member[i]).getArea().equals(((Driver)member[j]).getArea())
							&& ((Driver)member[i]).getYear()==((Driver)member[j]).getYear();
				}
				else {
					continue;
				}
				if(isSame) {
					isCheck[j]=true;
					isCheck[i]=true;
				}
			}
		}
		for(int i=0; i<member.length; i++) {
			duplicatedMember +=	isCheck[i]?"member["+i+"] : "+member[i].toString()+"\n":"";
		}
		System.out.println("========= 중복된 객체 목록 =========\n" + duplicatedMember);
		
		
		
	}
}
