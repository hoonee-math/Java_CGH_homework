package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	public String calcArea(int height, int width) {
		r = new Rectangle(height,width);
		int area = height*width;
		return "면적 = "+area+" "+r.toString();
	}
	public String calcPerimeter(int height, int width) {
		r = new Rectangle(height,width);
		int perimeter = (height+width)*2;
		return "둘레 = "+perimeter+" "+r.toString();
	}
}
