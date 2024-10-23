package com.bs.practice1.run;

import com.bs.practice1.func.VariablePractice1;
import com.bs.practice1.func.VariablePractice2;
import com.bs.practice1.func.VariablePractice3;
import com.bs.practice1.func.VariablePractice4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        System.out.println("사용 가능한 옵션:");
        System.out.println("1. VariablePractice1().userInfo()");
        System.out.println("2. VariablePractice2().calculator()");
        System.out.println("3. VariablePractice3().rectangle()");
        System.out.println("4. VariablePractice4().print4()");
//        System.out.println("5. ");
//        System.out.println("6. ");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("실행시킬 함수를 선택하시오: ");
		int funcNum=sc.nextInt();
		System.out.print("======================\n");
		
		switch(funcNum){
			case 1: new VariablePractice1().userInfo();	break;
			case 2: new VariablePractice2().calculator();	break;
			case 3: new VariablePractice3().rectangle(); break;
			case 4: new VariablePractice4().print4(); break;
//			case 5:
//			case 6:
			default : System.out.println("유효한 값을 입력하세요!");
		}
		
	}
//	public static void main(String[] args) {
//
//        System.out.println("사용 가능한 옵션:");
////        System.out.println("1. ");
////        System.out.println("2. ");
////        System.out.println("3. ");
////        System.out.println("4. ");
////        System.out.println("5. ");
////        System.out.println("6. ");
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("실행시킬 함수를 선택하시오: ");
//		int funcNum=sc.nextInt();
//		System.out.print("======================\n");
//		
//		switch(funcNum){
////			case 1: 
////			case 2:
////			case 3:
////			case 4:
////			case 5:
////			case 6:
//			default : System.out.println("유효한 값을 입력하세요!");
//		}
//		
//	}
}
