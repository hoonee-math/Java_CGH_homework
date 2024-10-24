package com.bs.practice.dimension.run;

import java.util.Scanner;

import com.bs.practice.dimension.DimensionPractice;


public class Run {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = DimensionPractice.dimensionPracticeNumber;
		
		System.out.println("2차원배열 실습 / 1~9 ");
		System.out.print("2차원배열 실습 / 실행할 함수 번호를 입력하세요: ");
		if(num!=0) {
			System.out.print(num+"번 함수 자동 실행됨.");
		} else {
			num=sc.nextInt();
		}
		System.out.println();
		switch(num) {
			case 1 : new DimensionPractice().parctice1(); break;
			case 2 : new DimensionPractice().parctice2(); break;
			case 3 : new DimensionPractice().parctice3(); break;
			case 4 : new DimensionPractice().parctice4(); break;
			case 5 : new DimensionPractice().parctice5(); break;
			case 6 : new DimensionPractice().parctice6(); break;
			case 7 : new DimensionPractice().parctice7(); break;
			case 8 : new DimensionPractice().parctice8(); break;
			case 9 : new DimensionPractice().parctice9(); break;
			case 99 : break;
			default : System.out.println("정확한 숫자를 입력해주 주세요."); break;
		}
			
		
		
	}

}
