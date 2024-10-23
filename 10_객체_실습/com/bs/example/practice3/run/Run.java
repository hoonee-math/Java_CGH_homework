package com.bs.example.practice3.run;

import com.bs.example.practice3.model.vo.Circle;

//02_0_필드 실습예제2
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		System.out.println("1증가");
		c.incrementRadius();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
	}

}
