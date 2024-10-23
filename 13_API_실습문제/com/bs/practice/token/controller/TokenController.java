package com.bs.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	
	public TokenController() {
	}
	
	public String afterToken(String str) {
		
	// 매개변수로 받아온 str을 StringTokenizer를 이용하여
	// 띄어쓰기를 없애고 없앤 문자열 반환
		
		//11_API 프로젝트 StringController.java 266 번째 줄 참고!
		StringTokenizer stz = new StringTokenizer(str," ");
		String dconcat = "";
		while(stz.hasMoreTokens()) {
			String d = stz.nextToken();
//			System.out.print(d);
			dconcat += d;
		}
		return dconcat;
	}
	public String firstCap(String input){
	// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		String result = input.substring(0,1).toUpperCase()+input.substring(1,input.length());
		return result;
	}
	public int findChar(String input, char one){
	// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int findChar = 0;
		for(int i = 0 ; i<input.length(); i++ ) {
			if(input.charAt(i)==one)
				findChar++;
		}
		return findChar;
		// StringTokenizer 를 String 문자열만 매개변수로 주면 기본적으로 공백을 기준으로 문자열을 토큰으로 나눔. 
//	    StringTokenizer stz = new StringTokenizer(input);
//	    int findChar = 0;
//	    while(stz.hasMoreTokens()) {
//	        char d = stz.nextToken().charAt(0);
//	        if(d==one)
//	            findChar++;
//	    }
		// 만약 배열로 풀고싶다면 toCharArray 를 써야함.
//		if (input == null) {
//	        return 0;
//	    }
//	    int count = 0;
//	    for (char c : input.toCharArray()) {
//	        if (c == one) {
//	            count++;
//	        }
//	    }
//	    return count;
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