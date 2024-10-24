package com.bs.practice1.func;

import java.util.Scanner;


public class VariablePractice4 {
	public void print4() {
		// 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력/
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요");
		String contents=sc.nextLine();
		
		System.out.print("첫 번째 문자: "+contents.charAt(0)+"\n");
		System.out.print("두 번째 문자: "+contents.charAt(1)+"\n");
		System.out.print("세 번째 문자: "+contents.charAt(2)+"\n");
		System.out.print("네 번째 문자: "+contents.charAt(3)+"\n");
	}
}
