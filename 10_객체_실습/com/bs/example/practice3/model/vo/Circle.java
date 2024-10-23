package com.bs.example.practice3.model.vo;

//02_0_필드 실습예제2
//02_3_예약어 실습예제
public class Circle {
	private static final double PI = 3.14;
	private static int radius = 1;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public static int getRadius() {
		return radius;
	}

	public static void setRadius(int radius) {
		Circle.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	public void incrementRadius() {
		radius+=1;
	}
	
	public void getAreaOfCircle() {
		double area = radius*radius*PI;
		System.out.println("원의 넓이는 "+area);
	}
	
	public void getSizeOfCircle() {
		double size = 2*PI*radius;
		System.out.println("원의 둘레는 "+size);
	}
}
