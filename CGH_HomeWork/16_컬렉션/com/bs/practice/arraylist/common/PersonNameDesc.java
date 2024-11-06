package com.bs.practice.arraylist.common;

import java.util.Comparator;

import com.bs.practice.arraylist.model.vo.Person;

public class PersonNameDesc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		
		//p1 이 더 크면 순서 바꿈: 큰게 뒤로! 오름차순!
		return p2.getName().compareTo(p1.getName());
	}
}
