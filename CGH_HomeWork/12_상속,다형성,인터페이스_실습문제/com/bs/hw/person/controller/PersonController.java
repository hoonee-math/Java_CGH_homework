package com.bs.hw.person.controller;

import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int personCount() {
		int countP=0;
		
		
		return countP;
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
	}
	public Student[] printStudent() {
		
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	public Employee[] printEmpolyee()	{
		
		return e;
	}
	
}
