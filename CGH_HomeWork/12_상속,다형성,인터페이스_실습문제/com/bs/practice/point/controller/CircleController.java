package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	public String calcArea(int radius) {
		c = new Circle(radius);
		double area = 3.14*radius*radius;
		return "면적 = "+area+" "+c.toString();
	}
	public String calcCircum(int radius) {
		c = new Circle(radius);
		double circum = 3.14*2*radius;
		return "둘레 = "+circum+" "+c.toString();
	}
}
