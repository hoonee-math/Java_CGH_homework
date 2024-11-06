package com.bs.practice.arraylist.common;

import java.util.Comparator;

import com.bs.practice.arraylist.model.vo.Person;

public class PersonHeightAsc implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		
		return (p1.getHeight()>p2.getHeight())?1:-1;
	}
}
