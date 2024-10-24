package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainView {	

	//1.메뉴를 출력하는 기능
	public void mainMenu(StudentController studentController) {
		Scanner sc=new Scanner(System.in); 
		while(true) {
			System.out.println("\n============== 학생관리 프로그램 v1 ==============");
//			System.out.println();
			System.out.println("1.학생등록\t4.전체조회\t7.이름조회");
			System.out.println("2.학생수정\t5.번호조회\t9.기본 예제 자동 입력");
			System.out.println("3.학생삭제\t6.학년조회\t0.프로그램 종료");
			System.out.println("");
			System.out.print("선택: ");
			int choiceMenu=sc.nextInt();
			switch(choiceMenu) {
				case 1: studentController.insertStudent(); break; 
				case 2: studentController.modifyStudentInfo(); break;
				case 3: studentController.deleteStudent(); break;
				case 4: studentController.searchAllStudents(); break;
				case 5: studentController.searchStudentByNumber(); break;
				case 6: studentController.searchStudentByGrade(); break;
				case 7: studentController.searchStudentByName(); break;
				case 9: studentController.insertExample(); break;
				case 0: System.out.println("프로그램을 종료합니다. :)"); return;
				// return 하면 호출한 곳으로 되돌아감!
				default : break;
			}
		}
	}
	//2.학생을 입력받는 기능
	public Student inputStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====== 학생 등록 ======");
		System.out.print("학생 이름: ");
		String name=sc.nextLine();
//		st1.setName(sc.nextLine()); 
		System.out.print("나이: ");
		int age=sc.nextInt();
		System.out.print("학년(1~3): ");
		int grade=sc.nextInt();
		System.out.print("반: ");
		int classNumber=sc.nextInt();
		sc.nextLine(); //nextInt로  받았던전례가 있기 때문에 다음 nextLine 을 받기 전에 공란을 만들어줌
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("주소: ");
		String address=sc.nextLine();        
		System.out.print("키: ");
		double height=sc.nextDouble();
		System.out.print("성별(남/여): ");
		char gender=sc.next().charAt(0);
		
		Student s=new Student(name, age, grade, classNumber, phone, address,
				height, gender);
		return s;
	}
	
	//3.메시지를 출력하는 기능
	// 시스템 메시지를 출력해줌. 어떤 기능에서든 msg 를 넣어서 사용하면됨.
	public void printMessage(String msg) {
		System.out.println("----- 시스템 메세지 -----");
		System.out.println(msg);
		System.out.println("---------------------\n");
	}
	
		// 삭제할 학생 번호 입력 받아 반환하기!
	public int inputStudentNum(StudentController studentController, String title) {
//		System.out.println("====== 학생 "+title+" ======");
//		studentController.searchAllStudents(); // 저장된 학생 조회 기능 삭제
		System.out.print(title+"할 학생 번호 : ");
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	
	public void printStudents(String students) {
		System.out.println("----------------- 학생조회 결과 -----------------");
		if(!students.equals(""))
			System.out.println(students);
		else System.out.println("              조회할 학생이 없습니다.");
		System.out.println("----------------------------------------------\n");
	}
	
	public int inputStudentGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.print("조회할 학년 : ");
		return sc.nextInt();
	}
	
	public void deleteStudent(String msg) {
		System.out.println("----------------- 학생삭제 결과 -----------------");
		System.out.println(msg);
		System.out.println("----------------------------------------------\n");
	}
	
	// 수정할 항목, 대체 정보 입력 받기
	public String inputModiyStudentInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("수정가능한 항목: 학년(1), 반(2), 전화번호(3), 주소(4)");
		System.out.print("수정할 항목 선택 : ");
		String result = sc.next();
		System.out.print("삽입할 내용 입력 : ");
		result += sc.next();
		return result;
	}
	
	public void insertExampleStudents(String students) {
		System.out.println("----------------- 학생기본 예제 -----------------");
		if(!students.equals(""))
			System.out.println(students);
		else System.out.println("              조회할 학생이 없습니다.");
		System.out.println("----------------------------------------------\n");
	}
	
	public String inputStudentName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 학생 이름 : ");
		return sc.next();
	}
	
}







