package com.bs.practice.arraylist.run;

import java.util.Scanner;
import java.util.List;

import com.bs.practice.arraylist.common.PersonHeightAsc;
import com.bs.practice.arraylist.common.PersonNameDesc;
import com.bs.practice.arraylist.controller.PersonListController;
import com.bs.practice.arraylist.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		PersonListController plc = new PersonListController();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== 컬렉션 과제 : arraylist실습문제.txt ======");
		System.out.println("1. Person 데이터 ADD");
		plc.inputPersonData();
		
		System.out.println("2. 키가 180 이상인 사람의 나이 1씩 증가 시킨 후 데이터 출력");
		plc.personList().stream()
						.filter(o->o instanceof Person p && p.getHeight()>=180)
						.forEach(o->((Person)o).setHeight(((Person)o).getHeight()+1));
		plc.personList().forEach(o->System.out.println((Person)o));
		
		System.out.println("3. 나이가 40세 이상인 사람 출력 (40대로 수정)");
		plc.personList().stream()
						.filter(o->((Person)o).getAge()/10==4)
						.forEach(o->System.out.println((Person)o));
		
		System.out.println("4. 사원을 이름(내림차순)순으로 정렬하기");
		plc.personList().sort(new PersonNameDesc());
		plc.personList().forEach(o->System.out.println((Person)o));
		
		System.out.println("5. 사원을 키(오름차순)순으로 정렬하기");
		plc.personList().sort(new PersonHeightAsc());
		plc.personList().forEach(o->System.out.println((Person)o));
		
		System.out.println("6. 2번 인덱스에 최주영,26,남,177.3,70.5 저장하기(추가)");
		plc.personList().add(2,new Person("최주영",26,'남',177.3,70.5));
		plc.personList().forEach(o->System.out.println((Person)o));
		
		System.out.println("7. 3번 인덱스 값을 이동제,25,175.3,68.3 으로 변경하기");
		
		
		System.out.println("8. 고길동, 20, 남, 175.5, 70.5이 리스트에 있는지 확인하고 없으면 추가하기");
		
		
		System.out.println("9. 이름이 선덕여왕인 사람의 위치를 찾아서 그 위치에 주몽,58,남,189.4,90.3을 추가하기");
		
		
		System.out.println("10. 4번 인덱스의 사람 삭제하기");
		
		
		System.out.println("11. 김두환, 42, 남, 188.2, 95.5 사람 삭제하기");
		
		
		System.out.println("12. 리스트에 값이 있는지 없는지 확인하고 값이 있으면 사람있어요~~ 출력 없으면 사람없어요~~ 출력");
		
		
		System.out.println("13. 리스트에 있는 모든데이터 삭제하기");
		
		
		
		
		


	}

}
