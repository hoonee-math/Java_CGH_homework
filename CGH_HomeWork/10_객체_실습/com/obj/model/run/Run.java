package com.obj.model.run;

import com.obj.model.vo.Employee;
import com.obj.model.vo.Person;

//06_객체/04_필드실습.txt
public class Run {

	public static void main(String[] args) {

//		com.obj.model.vo패키지에
//		사원클래스를 만들어보자
//		이름, 부서, 직책, 월급, 보너스가 있고
//		이름, 부서 는 외부패키지에서 수정, 접근이 가능하게 설정
//		직책, 월급 내부패키지에서만 수정, 접근이 가능
//		보너스는 클래스 내부에서만 수정, 접근이 가능
//		main클래스에서 사원클래스 두개를 (생성)만들고 
//		이름 부서에 각각
//		유병승 강사부
//		은세계 학생부 로 등록하고 출력할것
//		객체는 두개를 생성
//		사람클래스를 만들어서 활용하자
//		
//		com.obj.model.vo패키지에 선언
//		이름, 주소, 전화번호, 키, 몸무게
//		저장
//		이름, 주소는 클래스내부에서만 활용가능
//		전화번호 키, 몸무게는 외부패키지에서 활용가능
//		두개의 사람클래스를 생성해서 ...귀찮으니 생성자를 만들었음.
//		각각
//		01036446259 180.5 65.5
//		01012345678 195.5 100.2
//		저장 후 출력하기 ... 귀찮으니 출력메소드 만들었음
		Employee em1 = new Employee();
		Employee em2 = new Employee();
		em1.name = "유병승";
		em1.team = "강사부";
		em2.name = "은세계";
		em2.team = "학생부";
		System.out.println(
				em1.name+" "+em1.team+"\n"+
				em2.name+" "+em2.team
		);
		
		Person p1 = new Person("01036446259", 180.5, 65.5);
		Person p2 = new Person("01012345678", 195.5, 100.2);
		
		p1.printInfo();
		p2.printInfo();
	}

}
