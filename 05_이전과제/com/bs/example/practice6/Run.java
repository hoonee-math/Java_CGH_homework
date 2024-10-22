package com.bs.example.practice6;

import com.bs.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("해리포터","블롬즈베리","j.k롤링");
		Book book2 = new Book("채식주의자","창비","한강",15000,0.3);
		
		book1.inform();
		book2.inform();
	}

}
