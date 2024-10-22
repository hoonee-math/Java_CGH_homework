package com.bs.example.practice7.run;

import com.bs.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// setter/getter 이용해서 아래 내용 저장 후 출력하기
//		empNo empName dept job age gender salary bonusPoint phone address
//		100 홍길동 영업부 과장 25 남 2500000 0.05 010-1234-5678 서울시 강남구
		
//		기본 생성자로 객체를 만들고 Setter를
//		이용해 값 변경 후 Getter를 이용해 출력
		
		// Employee 클래스 호출! em1 이라는 객체 하나 생성해서 저장하기!
		// 기본 생성자로 객체 만들기!
		Employee em1=new Employee();
		
		// setter 이용해서 값 변경하기
		em1.setEmpNo(100);
		em1.setEmpName("홍길동");
		em1.setDept("영업부");
		em1.setJob("과장");
		em1.setAge(25);
		em1.setGender('남');
		em1.setSalary(2500000);
		em1.setBonusPoint(0.05);
		em1.setPhone("010-1234-5678");
		em1.setAddress("서울시 강남구");
		
		// getter 이용해서 출력하기
		System.out.println(
				em1.getEmpNo()
				+" "+em1.getEmpName()
				+" "+em1.getDept()
				+" "+em1.getJob()
				+" "+em1.getAge()
				+" "+em1.getGender()
				+" "+em1.getSalary()
				+" "+em1.getBonusPoint()
				+" "+em1.getPhone()
				+" "+em1.getAddress()
				
				);
	}

}
