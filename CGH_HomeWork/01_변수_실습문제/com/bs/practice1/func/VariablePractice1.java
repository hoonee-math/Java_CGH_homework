package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void userInfo() {
//		 Class Name : com.bs.practice1.func.VariablePractice1
//		 실행 클래스: com.bs.practice1.run.Run
//		 이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 값을 변수에 담고 출력하세요.
//		  ex.
//		 이름을 입력하세요: 아무개
//		 성별을 입력하세요(남/여) : 남
//		 나이를 입력하세요: 20
//		 키를 입력하세요(cm) : 180.5
//		 키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		
		Scanner sc=new Scanner(System.in);
		
		String name="", gender="";
		int age=0;
		double height=0.0;
		
		System.out.print("이름을 입력하세요: ");
		name=sc.next();
		System.out.print("성별을 입력하세요: ");
		gender=sc.next();
		System.out.print("나이를 입력하세요: ");
		age=sc.nextInt();
		System.out.print("키를 입력하세요: ");
		height=sc.nextDouble();
		
		System.out.printf("키 %.1f인 %d살 %s자 %s님 반갑습니다^^", height,age, gender, name);
		
		
	}

}

