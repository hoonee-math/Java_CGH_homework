package com.bs.practice.chap02.run;

import java.util.Scanner;

import com.bs.practice.chap02.loop.BaseBallGame;
import com.bs.practice.chap02.loop.LoopPractice;
import com.bs.practice.chap02.loop.Supplementary;


public class Run {
	public static void main(String[] argsdfasgadfgss) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("반복문 실습 / 1~22 /\n"
				+ "추가문제 31,32,33\n"
				+ "야구게임 41");
		System.out.print("반복문 실습 / 실행할 함수 번호를 입력하세요: ");
		int num = Supplementary.playFunctionNumber;
		if(num!=0) {
			System.out.print(num+"번 함수 자동 실행됨.");
		} else {
			num=sc.nextInt();
		}
		System.out.println();
		
		switch(num) {
			case 1 : new LoopPractice().practice1(); break;
			case 2 : new LoopPractice().practice2(); break;
			case 3 : new LoopPractice().practice3(); break;
			case 4 : new LoopPractice().practice4(); break;
			case 5 : new LoopPractice().practice5(); break;
			case 6 : new LoopPractice().practice6(); break;
			case 7 : new LoopPractice().practice7(); break;
			case 8 : new LoopPractice().practice8(); break;
			case 9 : new LoopPractice().practice9(); break;
			case 10 : new LoopPractice().practice10(); break;
			case 11 : new LoopPractice().practice11(); break;
			case 12 : new LoopPractice().practice12(); break;
			case 13 : new LoopPractice().practice13(); break;
			case 14 : new LoopPractice().practice14(); break;
			case 15 : new LoopPractice().practice15(); break;
			case 16 : new LoopPractice().practice16(); break;
			case 17 : new LoopPractice().practice17(); break;
			case 18 : new LoopPractice().practice18(); break;
			case 19 : new LoopPractice().practice19(); break;
			case 20 : new LoopPractice().practice20(); break;
			case 21 : new LoopPractice().practice21(); break;
			case 22 : new LoopPractice().practice22(); break;
			
			case 31 : new Supplementary().rockScissorsPaper(); break;
			case 32 : new Supplementary().printNumLoop(); break;
			case 33 : new Supplementary().printStirngLoop(); break;
			case 34 : new Supplementary().practice34(); break;
			case 41 : new BaseBallGame().inputCheck(); break;
			
			case 0 : break;
			
			default : System.out.println("유효한 값을 입력하세요!");
		}
		
		
	}
}
