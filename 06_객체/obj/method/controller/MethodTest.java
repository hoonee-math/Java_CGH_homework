package com.obj.method.controller;

import java.util.Scanner;

//06_객체/05_기본메소드실습.txt
public class MethodTest {
//	전달받아 = 매개변수, 반환하는 = 반환값
//	1. 오늘 수업 너무 쉽다 출력하는기능
	public void printToday() {
		System.out.println("오늘 수업 너무 쉽다.");
	}
//	2. 1부터 10까지 출력하는 기능
	public void printToTen() {
		for(int i=1; i<=10;i++) {
			System.out.print(i+" ");;
		}
		System.out.println();
	}
//	3. 1부터 사용자가 원하는 수 전달받아서까지 출력하는 기능
	public void printToInputNum(int inputNum) {
		for(int i=1; i<=inputNum;i++) {
			System.out.print(i+" ");;
		}
		System.out.println();
	}
//	4. 1부터 5까지 더한수를 반환하는 기능
	public int sumToFive() {
		int sum =0;
		for(int i=0; i<5; i ++) {
			sum += i+1;
		}
		return sum;
	}
//	5. 사용자에게 5번 메세지를 입력받고 입력받은 메세지를 반환하는 기능
	public String fiveStr() {
		String str = "";
		int count = 5;
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<count ; i++) {
			System.out.print((i+1)+"번재 메세지 입력: ");
			str += sc.next() +" ";
		}
		return str;
	}
//	6. 숫자두개, 연산자를 전달받아 계산한결과를 반환해주는 기능
	public double calculator(int num1, int num2, char operator) {
		double result = 0;
		switch(operator) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / (double)num2; break;
			case '%' : result = num1 % num2; break;
			default : System.out.println("잘못된 입력입니다.");
		}
		return result;
	}
//	7. 문자열을 전달받아 문자열에 중복값 있는지 확인 후 결과를 반환하는 기능
	public boolean isDuplicatedChar(String str) {
		//참거짓만 반환
		boolean result = false;
		checkDu:
		for(int i = 0; i<str.length(); i++) {
			char check = str.charAt(i);
			for(int j=i; j<str.length(); j++) {
				char check2 = str.charAt(j);
				if(check == check2) {
					result = true;
					break checkDu;
				}
			}
		}
		return result;
		// 어떤문자가 몇번씩 중복되는지 전부 체크
//		String result ="";
//		for(int i = 0; i<str.length(); i++) {
//			char check = str.charAt(i);
//			for(int j=0)
//		}
//		
//		return result;
	}
	
}
