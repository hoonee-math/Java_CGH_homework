package com.bs.hw.person.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bs.hw.person.controller.PersonController;
import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonMenu {
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		System.out.printf("학생은 최대 3명까지 저장할 수 있습니다.\n",0);
		System.out.printf("현재 저장된 학생은 %d명 입니다.\n",pc.personCount()[0]);
		System.out.printf("사원은 최대 10명까지 저장할 수 있습니다.\n",0);
		System.out.printf("현재 저장된 사원은 %d명 입니다\n",pc.personCount()[1]);
		System.out.println();
		System.out.print(
					"1.학생 메뉴\n"
				+ 	"2.사원 메뉴\n"
				+ 	"9.끝내기\n"
				+ 	"메뉴 번호 : ");
		Scanner sc=new Scanner(System.in);
		int selectMenu=0;
		try {
			selectMenu=sc.nextInt();	
		} catch(InputMismatchException e) {
			System.out.println("잘못된 입력입니다.");
			mainMenu();
		}
		switch(selectMenu) {
		case 1: studentMenu(); break;
		case 2: employeeMenu(); break;
		case 9: System.out.println("종료합니다."); return;
			default: System.out.println("“잘못 입력하셨습니다. 다시 입력해주세요."); 
		}
		System.out.println();
		mainMenu();
	}
	public void studentMenu() {
		System.out.print(
				  "1.학생 추가\n"
				+ "2.학생 보기\n"
				+ "9.메인으로\n");
		Scanner sc = new Scanner(System.in);
		int selectMenu = 0;
		while(!(selectMenu==1||selectMenu==2||selectMenu==9)) {
			try {
				System.out.print("메뉴 번호 : ");
				selectMenu=sc.nextInt();
				if(selectMenu==1||selectMenu==2||selectMenu==9)	break;
				else System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			} catch(InputMismatchException e) {
				selectMenu=0;
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		switch(selectMenu) {
			case 1: insertStudent(); break;
			case 2:	printStudent(); break;
			case 9: mainMenu(); break;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
		System.out.println();
		studentMenu();
	}
	public void employeeMenu() {
		System.out.print(
				  "1.사원 추가\n"
				+ "2.사원 보기\n"
				+ "9.메인으로\n");
		Scanner sc = new Scanner(System.in);
		int selectMenu = 0;
		while(!(selectMenu==1||selectMenu==2||selectMenu==9)) {
			try {
				System.out.print("메뉴 번호 : ");
				selectMenu=sc.nextInt();
				if(selectMenu==1||selectMenu==2||selectMenu==9)	break;
				else System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			} catch(InputMismatchException e) {
				selectMenu=0;
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		switch(selectMenu) {
			case 1: insertEmployee(); break;
			case 2:	printEmployee(); break;
			case 9: mainMenu(); break;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
		System.out.println();
		employeeMenu();
		
	}
	public void insertStudent() {
		if(pc.personCount()[0]==3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름:");
		String name = sc.next();
		System.out.print("학생 나이:");
		int age = sc.nextInt();
		System.out.print("학생 키:");
		double height = sc.nextDouble();
		System.out.print("학생 몸무게:");
		double weight = sc.nextDouble();
		System.out.print("학생 학년:");
		int grade = sc.nextInt();
		System.out.print("학생 전공:");
		String major = sc.next();
		pc.insertStudent(name, age, height, weight, grade, major);
		if(pc.personCount()[0]<3) {
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char initial = sc.next().charAt(0);
			if(initial=='N'||initial=='n') {
				return;
			} else {
				insertStudent();
			}
		} else {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
			studentMenu();
		}
	}
	public void printStudent() {
		for(Student s : pc.printStudent()) {
			System.out.println(s);
		}
	}
	public void insertEmployee() {
		if(pc.personCount()[0]==3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("사원 이름:");
		String name = sc.next();
		System.out.print("사원 나이:");
		int age = sc.nextInt();
		System.out.print("사원 키:");
		double height = sc.nextDouble();
		System.out.print("사원 몸무게:");
		double weight = sc.nextDouble();
		System.out.print("사원 급여:");
		int salary = sc.nextInt();
		System.out.print("사원 부서:");
		String dept = sc.next();
		pc.insertEmployee(name, age, height, weight, salary, dept);
		if(pc.personCount()[0]<3) {
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char initial = sc.next().charAt(0);
			if(initial=='N'||initial=='n') {
				
				return;
			} else {
				insertEmployee();
			}
		} else {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 사원 메뉴로 돌아갑니다.");
			employeeMenu();
		}
		
	}
	public void printEmployee() {
		for(Employee e : pc.printEmployee()) {
			System.out.println(e);
		}
	}
}
