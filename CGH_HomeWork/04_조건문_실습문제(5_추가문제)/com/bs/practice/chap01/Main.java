package com.bs.practice.chap01;

import java.util.Scanner;
import com.bs.practice.chap01.*;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("조건문 실습 / 실행할 함수 번호를 입력하세요: ");
	int num=sc.nextInt();
	
	switch(num) {
		case 1 : new ControlPractice().practice1(); break;
		case 2 : new ControlPractice().practice2(); break;
		case 3 : new ControlPractice().practice3(); break;
		case 4 : new ControlPractice().practice4(); break;
		case 5 : new ControlPractice().practice5(); break;
		case 6 : new ControlPractice().practice6(); break;
		case 7 : new ControlPractice().practice7(); break;
		case 8 : new ControlPractice().practice8(); break;
		case 9 : new ControlPractice().practice9(); break;
		case 10 : new ControlPractice().practice10(); break;
		case 11 : new ControlPractice().practice11(); break;
		case 110 : new ControlPractice().practice110(); break;
		case 111 : new ControlPractice().practice111(); break;
		case 112 : new ControlPractice().practice112(); break;
		
		default : System.out.println("유효한 값을 입력하세요!");
	}
}
}
