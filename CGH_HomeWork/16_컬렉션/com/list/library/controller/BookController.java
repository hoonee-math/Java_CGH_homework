package com.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.list.library.model.vo.Book;

public class BookController {
	private List list= new ArrayList();
	
	public BookController() {
		// TODO Auto-generated constructor stub
	}
	public void insertBook(Book bk) {
		
	}
	public List selecList() {
		
		return list;
	}
	public List searchBook(String keyword) {
		
		return list;
	}
	public Book deleteBook(String title, String author) {
		Book bk = new Book();
		return bk;
	}
	public int ascBook() {
		
		return 0;
	}
}
