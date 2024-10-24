package com.obj.model.run;

//06_객체/06_필드 이용하는 메소드실습.txt
import com.obj.model.vo.Developer;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer dev = new Developer("김개발",10,"java",1000);
		dev.printField();
		dev.printSalary();
		dev.setSalary(10);
		dev.printSalary();
		dev.setMainLanguage("파이썬");
	}

}
