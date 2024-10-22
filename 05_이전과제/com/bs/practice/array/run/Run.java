package com.bs.practice.array.run;

import java.util.Scanner;

import com.bs.practice.array.ArrayPractice;

public class Run {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("배열 실습 / Cgh_Practice / src / com.bs.practice.array\n");
		
		int number;
        if (ArrayPractice.runPractice == 0) {
            System.out.print("실행할 실습 문제 번호를 입력하세요: ");
            number = sc.nextInt();
            System.out.println("============ practice"+number+"() 이 실행되었습니다. ============\n");
        } else {        	
            number = ArrayPractice.runPractice;
            System.out.println("============ practice"+number+"() 이 실행되었습니다. ============\n");
        }
		
		switch(number) {
		case 1 : new ArrayPractice().practice1(); break;
		case 2 : new ArrayPractice().practice2(); break;
		case 3 : new ArrayPractice().practice3(); break;
		case 4 : new ArrayPractice().practice4(); break;
		case 5 : new ArrayPractice().practice5(); break;
		case 6 : new ArrayPractice().practice6(); break;
		case 7 : new ArrayPractice().practice7(); break;
		case 8 : new ArrayPractice().practice8(); break;
		case 9 : new ArrayPractice().practice9(); break;
		case 10 : new ArrayPractice().practice10(); break;
		case 11 : new ArrayPractice().practice11(); break;
		case 12 : new ArrayPractice().practice12(); break;
		case 13 : new ArrayPractice().practice13(); break;
		case 14 : new ArrayPractice().practice14(); break;
		case 15 : new ArrayPractice().practice15(); break;
		case 16 : new ArrayPractice().practice16(); break;
		default : System.out.println("유효한 값을 입력하세요!");
		}
		
		System.out.println("\n\n프로그램을 종료합니다.");
	}

}
