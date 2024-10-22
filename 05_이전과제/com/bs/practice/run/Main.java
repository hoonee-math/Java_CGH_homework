package com.bs.practice.run;

import java.util.Scanner;

import com.bs.practice.func.OperatorPractice;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("연산자 실습 / 실행시킬 함수를 선택하시오: ");
		int funcNum=sc.nextInt();
		System.out.print("======================\n");
		
		switch(funcNum){
			case 1: new OperatorPractice().practice1(); break;
			case 2: new OperatorPractice().practice2(); break;
			case 3: new OperatorPractice().practice3(); break;
			case 4: new OperatorPractice().practice4(); break;
			case 5: new OperatorPractice().practice5(); break;
			case 6: new OperatorPractice().practice6(); break;
			case 7: new OperatorPractice().practice7(); break;
			case 8: new OperatorPractice().practice8(); break;
			case 9: new OperatorPractice().practice9(); break;
			case 10: new OperatorPractice().practice10(); break;
			case 11: new OperatorPractice().practice11(); break;
			default : System.out.println("유효한 값을 입력하세요!");
		}
	}
}
