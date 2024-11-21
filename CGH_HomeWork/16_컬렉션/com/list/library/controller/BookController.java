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
		list.add(bk);
	}
	public List selectList() {
		
		return list;
	}
	public List searchBook(String keyword) {
		List<Book> selectList = new ArrayList<Book>();
		list.stream().filter(o->((Book)o).toString().contains(keyword)).forEach(selectList.add(((Book)o)));
		
		return selectList;
	}
	public Book deleteBook(String title, String author) {
		Book bk = new Book();
		return bk;
	}
	public int ascBook() {
		
		return 0;
	}
}
