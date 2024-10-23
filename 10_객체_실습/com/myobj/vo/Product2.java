package com.myobj.vo;

//06_객체/03_클래스생성자실습.txt
public class Product2 {
//	상품클래스를 생성해보자
//	저장내용
//	상품번호, 상품타입, 상품이름, 상품가격, 상품할인율, 상품재고
//	모든 필드는 외부에서 접근할 수 있게 설정
//	클래스를 생성할때 
//	기본생성 가능
//	타입, 이름, 가격만 설정가능
//	타입 이름, 가격, 할인률 설정가능
//	상품이름, 가격, 할인률, 재고 설정가능
//	할 수 있게 클래스를 구성하고
//	각 객체 생성 후 내용 출력하기 생성은 매개변수 생성자로할것
//	컴퓨터, maxbook, 200
//	핸드폰, 갤럭시노트, 120, 0.2
//	마스크, 10, 0.5, 100
//	출력시에는 전체 필드출력하기
//	* 다 하신분 
//	  -> 생성시 마다 상품번호가 1부터 1씩증가해서 대입
	private String productNo;
	private String type;
	private String name;
	private int price;
	private double discount;
	private int stock;
	private static int countProduct2=0;
	{
		productNo = "P_"+ ++countProduct2;
	}
	public Product2() {
		// TODO Auto-generated constructor stub
	}
	public Product2(String type, String name, int price) {
		this.type = type;
		this.name = name;
		this.price = price;
	}
	public Product2(String type, String name, int price, double discount) {
		super();
		this.type = type;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	public Product2(String name, int price, double discount, int stock) {
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.stock = stock;
	}
	public String getProductNo() {
		return productNo;
	}
//	public void setProductNo(String productNo) {
//		this.productNo = productNo;
//	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
