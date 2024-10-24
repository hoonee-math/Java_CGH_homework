package com.bs.practice.inherit.vo;

//06_상속실습.txt
public class Driver extends Person {

	private String area;
	private int year;
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public Driver(String name, int age, char gender, String area, int year) {
		super(name, age, gender);
		this.area = area;
		this.year = year;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+area+" "+year+"년";
	}
	
	
	
}
