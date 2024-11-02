package com.bs.practice.token.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bs.practice.token.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();

	// 필드
	public void mainMenu() {
//	1. 지정 문자열 -> tokenMenu()
//	2. 입력 문자열 -> inputMenu()
//	3. 프로그램 끝내기 -> “프로그램을 종료합니다” 출력 후 종료
	// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
//		tc.afterToken("");
//		tc.firstCap(null);
//		tc.findChar("", ' ');
		System.out.print("1. 지정 문자열\n"
				+ "2. 입력 문자열\n"
				+ "9. 프로그램 끝내기\n"
				+ "메뉴 번호 : ");
		
		try {
			int playNo = sc.nextInt();
			switch(playNo){
				case 1: tokenMenu(); break;
				case 2: inputMenu(); break;
				case 9: break;
				default : System.out.println("잘못 입력하였습니다. 다시 입력하세요."); mainMenu();
		}} catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("잘못 입력하였습니다. 다시 입력하세요."); mainMenu();
		}
	}
	public void tokenMenu(){
		
		String str = "J a v a P r o g r a m "; 
		System.out.println("토큰 처리 전 글자 : "+str);
		System.out.println("토큰 처리 전 개수 : "+str.length());
		str = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : "+str);
		System.out.println("토큰 처리 후 개수 : "+str.length());
		System.out.println("모두 대무자로 변환 : "+str.toUpperCase());
		
		mainMenu();
	
	// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
	// TokenController(tc)의 afterToken()의 반환 값을 가지고
	// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
	}
	public void inputMenu(){
		
		System.out.println("문자열을 입력하세요 : ");
		String input = sc.next();
		System.out.print("첫 글자 대문자 : ");
		// Question 필드 위에 tc를 한번 선언했는데 여기서 다른걸로 다시 선언해서사용함?
		String tcS = tc.firstCap(input);
//		String tc = new TokenController().firstCap(input);
		System.out.println(tcS);
		
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char one = sc.next().charAt(0);
		int findChar = tc.findChar(input, one);
		System.out.println(one+" 문자가 들어간 개수: "+findChar);

		mainMenu();
		
	//문자열을 입력하세요 :
	// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
	//찾을 문자를 하나 입력하세요 : 
	// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
	// 반환 값 출력
	}
	
}


//1. 지정 문자열
//2. 입력 문자열
//9. 프로그램 끝내기
//메뉴 번호 : 5
//잘못 입력하셨습니다. 다시 입력하세요.
//1. 지정 문자열
//2. 입력 문자열
//9. 프로그램 끝내기
//메뉴 번호 : 1
//토큰 처리 전 글자 : J a v a P r o g r a m 
//토큰 처리 전 개수 : 22
//토큰 처리 후 글자 : JavaProgram
//토큰 처리 후 개수 : 11
//모두 대문자로 변환 : JAVAPROGRAM
//1. 지정 문자열
//2. 입력 문자열
//9. 프로그램 끝내기
//메뉴 번호 : 2
//문자열을 입력하세요 : application
//첫 글자 대문자 : Application
//찾을 문자 하나를 입력하세요 : i
//i 문자가 들어간 개수 : 2
//1. 지정 문자열
//2. 입력 문자열
//9. 프로그램 끝내기
//메뉴 번호 : 9
//프로그램을 종료합니다.