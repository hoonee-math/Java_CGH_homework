package com.bs.hw.person.controller;

import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] countP=new int[2];
		for(Student st: s) {
			if(st!=null)
				countP[0]++; // 학생 객체수를 countP[0] 에 저장
		}
		for(Employee em: e) {
			if(em!=null)
				countP[1]++; // 사원 객체수를 countP[1] 에 저장
		}
		
		
		return countP;
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
				s[i]= new Student(name,age,height,weight,grade,major);
				break;
			}
		}
	}
	public Student[] printStudent() {
		
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i=0;i<s.length;i++) {
			if(e[i]==null) {
				e[i]= new Employee(name,age,height,weight,salary,dept);
				break;
			}
		}
	}
	public Employee[] printEmployee()	{
		
		return e;
	}
	
}
