package com.obj.method.run;

import java.util.Scanner;

import com.obj.method.controller.MethodTest;

//06_객체/05_기본메소드실습.txt
public class MyMain {

	public static void main(String[] args) {
//		전달받아 = 매개변수, 반환하는 = 반환값
		Scanner sc= new Scanner(System.in);
		
		MethodTest mt = new MethodTest();
		System.out.println("1.오늘 수업 너무 쉽다 출력하는기능");
		mt.printToday();
		System.out.println("2.1부터 10까지 출력하는 기능");
		mt.printToTen();
		System.out.println("3.1부터 사용자가 원하는 수 전달받아서까지 출력하는 기능");
		int inputNum = 6;
		System.out.print("자연수 입력: ");
		System.out.println(inputNum); // inputNum = sc.nextInt();
		mt.printToInputNum(inputNum);
		System.out.println("4.1부터 5까지 더한수를 반환하는 기능");
		int sumResult = mt.sumToFive();
		System.out.println(sumResult);
		System.out.println("5.사용자에게 5번 메세지를 입력받고 입력받은 메세지를 반환하는 기능");
		String concatResult = mt.fiveStr();
		System.out.println(concatResult);
		System.out.println("6.숫자두개, 연산자를 전달받아 계산한결과를 반환해주는 기능");
		int num1=7, num2=3; char operator = '+';
		System.out.println("num1 : "+num1); 
//		num1 = sc.nextInt();
		System.out.println("num2 : "+num2); 
//		num2 = sc.nextInt();
		System.out.println("연산자 : "+operator); 
//		operator = sc.next().charAt(0);
		double result = mt.calculator(num1, num2, operator);
		String resultCalc = num1+""+operator+""+num2+"="+result;
		System.out.println(resultCalc);
		System.out.println("7.문자열을 전달받아 문자열에 중복값 있는지 확인 후 결과를 반환하는 기능");
		System.out.print("문자열 입력 : " );
		sc.nextLine();
		String str = sc.nextLine();
		boolean isDup = mt.isDuplicatedChar(str);
		System.out.println(isDup?"중복값 있음":"중복값 없음");
	}

}
