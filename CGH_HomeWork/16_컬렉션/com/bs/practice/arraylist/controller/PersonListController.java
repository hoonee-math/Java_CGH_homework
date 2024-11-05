package com.bs.practice.arraylist.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bs.practice.arraylist.model.vo.Person;

public class PersonListController {
	ArrayList p = new ArrayList();
	
	public void inputPersonData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== Person 데이터 입력 ======");
		boolean flag=true;
		while(flag) {
			System.out.print("더미 데이터를 바로 입려하시겠습니까(y/n) : ");
			char startDummy = sc.next().charAt(0);
			if(startDummy=='y'||startDummy=='Y') {
				dummyData();
				return;
			} else if(startDummy=='n'||startDummy=='N') {
				flag = false;
			} else {
				sc.nextLine();
			}
		}
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("성별: ");
		char gender = sc.next().charAt(0);
		System.out.print("키: ");
		double height = sc.nextDouble();
		System.out.print("몸무게: ");
		double weight = sc.nextDouble();
		
		System.out.println("이름\t나이\t성별\t키\t몸무게");
		System.out.printf("%s\t%d\t%s\t%.1f\t%.1f\n",name,age,gender,height,weight);
		flag=true;
		while(flag) {
			System.out.println("입력하신 정보를 데이터에 저장하시겠습니까(y/n) : ");
			char saveData = sc.next().charAt(0);
			if(saveData=='y'||saveData=='Y') {
				p.add(new Person(name,age,gender,height,weight));
				System.out.println("데이터가 저장되었습니다.");
			} else if(saveData=='n'||saveData=='N') {
				flag = false;
			} else {
				sc.nextLine();
			}
		}
	}
	
	public void dummyData() {
		p.add( new Person("유병승", 19, '남', 180.5, 65.5));
		p.add( new Person("홍길동", 44, '여', 155.5, 45.5));
		p.add( new Person("고길동", 20, '남', 175.5, 70.5));
		p.add( new Person("선덕여왕", 35, '여', 150.2, 50.5));
		p.add( new Person("김두환", 42, '남', 188.2, 95.5));
	}
	
	public List personList() {
		return p;
	}
}
