package com.bs.practice.point.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bs.practice.point.controller.CircleController;
import com.bs.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1.원");
		System.out.println("2.사각형");
		System.out.println("9.끝내기");
		System.out.print("메뉴 번호 : ");
		int select = 0;
		while(true) {
			try {
				select = sc.nextInt();
				if(select==1||select==2||select==9) {
					break;
				} else {
					continue;
				}
			} catch(InputMismatchException e) {
				sc.nextInt();
				System.out.print("메뉴 번호 : ");
			}
		}
		switch(select) {
		case 1: circleMenu(); break;
		case 2: rectangleMenu(); break;
		case 9: System.out.println("종료합니다."); return;
			default : break;
		}
		//다시받기
		sc.nextLine();
		mainMenu();
	}
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1.원 둘레");
		System.out.println("2.원 넓이");
		System.out.println("9.메인으로");
		System.out.print("메뉴 번호 : ");
		int select = 0;
		while(true) {
			try {
				select = sc.nextInt();
				if(select==1||select==2||select==9) {
					break;
				} else {
					continue;
				}
			} catch(InputMismatchException e) {
				sc.nextInt();
				System.out.print("메뉴 번호 : ");
			}
		}
		switch(select) {
		case 1: calcCircum(); mainMenu(); break;
		case 2: calcCircleArea(); mainMenu(); break;
		case 9: mainMenu(); break;
			default : circleMenu(); break;
		}
		
		//메인메뉴로
	}
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1.사각형 둘레");
		System.out.println("2.사각형 넓이");
		System.out.println("9.메인으로");
		System.out.print("메뉴 번호 : ");
		int select = 0;
		while(true) {
			try {
				select = sc.nextInt();
				if(select==1||select==2||select==9) {
					break;
				} else {
					continue;
				}
			} catch(InputMismatchException e) {
				sc.nextInt();
				System.out.print("메뉴 번호 : ");
			}
		}
		switch(select) {
		case 1: calcPerimeter(); mainMenu(); break;
		case 2: calcRectArea(); mainMenu(); break;
		case 9: mainMenu(); break;
			default : rectangleMenu(); break;
		}
		//메인메뉴로
	}
	public void calcCircum() {
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcCircum(radius));
		//둘레 출력
	}
	public void calcCircleArea() {
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(radius));
		//넓이 출력
	}
	public void calcPerimeter() {
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(height,width));
		//둘레 출력
	}
	public void calcRectArea() {
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(height,width));
		//넓이 출력
	}
	
	
}
