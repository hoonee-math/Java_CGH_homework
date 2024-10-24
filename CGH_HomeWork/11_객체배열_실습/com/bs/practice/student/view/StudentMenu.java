package com.bs.practice.student.view;

import com.bs.practice.student.controller.StudentController;
import com.bs.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	public StudentMenu() {
		// TODO Auto-generated constructor stub
		System.out.println("========= 학생 정보 출력 ========");
		for(Student s : ssm.printStudent()) {
			System.out.println(s.inform());
		}
		System.out.println();
		System.out.println("========= 학생 성적 출력 ========");
		System.out.println("학생 점수 합계 : "+(int)ssm.avgScoer()[0]);
		System.out.println("학생 점수 평균 : "+ssm.avgScoer()[1]);
		System.out.println();
		System.out.println("========= 성적 결과 출력 ========");
		for(Student s : ssm.printStudent()) {
			System.out.println(s.getName()+"학생은 "+(s.getScore()<ssm.CUT_LINE?"재시험 대상":"통과")+"입니다.");
		}
		
	}
}
