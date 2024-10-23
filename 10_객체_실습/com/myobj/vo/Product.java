package com.myobj.vo;

//06_객체/02_객체생성자연습.txt
public class Product {
//	myobj프로젝트에서 
//	상품을 저장할 수 있는 클래스를 선언 -> vo패키지, Main실행
//	상품번호, 상품명, 가격, 색상, 할인율
//	1. 상품번호는 중복되지않게 자동을 생성되게 함. P_1, P_2, P_3 상품이 생성될때마다 자동생성
//	    수정이 불가능해야함.
//	2. 상품을 등록할때(생성) 상품명, 가격 / 상품명, 가격, 색상 / 상품명,가격,색상, 할인율의 데이터를
//	   대입해서 생성이 되어야함. 기본생성은 불가능

	private String productNo;
	private String name;
	private int price;
	private String color;
	private double discount;
	private static int countProduct=0;
	{
		productNo = "P_"+ ++countProduct;
	}
	//기본생성은 불가능
//	public Product() {
//		// TODO Auto-generated constructor stub
//	}
	public Product(String name, int price) {
		this.productNo = productNo;
		this.name = name;
		this.price = price;
		this.color = color;
		this.discount = discount;
	}
	public Product(String name, int price, String color) {
		this.productNo = productNo;
		this.name = name;
		this.price = price;
		this.color = color;
		this.discount = discount;
	}
	public Product(String name, int price, String color, double discount) {
		this.productNo = productNo;
		this.name = name;
		this.price = price;
		this.color = color;
		this.discount = discount;
	}
	public String getProductNo() {
		return productNo;
	}
//	//상품번호 수정 불가능하도록 변경
//	public void setProductNo(String productNo) {
//		this.productNo = productNo;
//	}
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public static int getCountProduct() {
		return countProduct;
	}
	public static void setCountProduct(int countProduct) {
		Product.countProduct = countProduct;
	}
	
}
