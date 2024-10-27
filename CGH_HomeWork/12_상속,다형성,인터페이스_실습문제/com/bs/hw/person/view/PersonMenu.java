package com.bs.hw.person.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bs.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc=new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		System.out.printf("학생은 최대 %d명까지 저장할 수 있습니다.",0);
		System.out.printf("현재 저장된 학생은 %d명 입니다.",0);
		System.out.printf("사원은 최대 %d명까지 저장할 수 있습니다.",0);
		System.out.printf("현재 저장된 사원은 %d명 입니다",0);
		System.out.println();
		System.out.print(
				"1. 학생 메뉴\n"
				+ "2.사원 메뉴\n"
				+ "9.끝내기"
				+ "메뉴 번호 : ");
		int selectMenu=0;
		try {
				selectMenu=sc.nextInt();	
				sc.nextLine();
		} catch(InputMismatchException e) {
			System.out.println("잘못된 입력입니다.");
			mainMenu();
		}
//		switch() {
//		case 1:
//		case 2:
//		case 9:
//			default: 
//		}
		
	}
	public void studentMenu() {
		
	}
	public void employeeMenu() {
		
	}
	public void insertStduent() {
		
	}
	public void pritnStudentd() {
		
	}
	public void isertEmployee() {
		
	}
	public void printEmployee() {
		
	}
}
