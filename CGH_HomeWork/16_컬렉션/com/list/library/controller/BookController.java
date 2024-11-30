package com.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.lang.model.type.UnknownTypeException;

import com.list.library.model.vo.Book;

public class BookController {
	private ArrayList<Book> bookList= new ArrayList<Book>();
	
	public BookController() {
		// TODO Auto-generated constructor stub
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	public ArrayList<Book> selectList() {
		
		return bookList;
	}
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> selectList = new ArrayList<Book>();
		bookList.stream().filter(o->((Book)o).toString().contains(keyword)).forEach(o->selectList.add(((Book)o)));
		
		return selectList;
	}
	public Book deleteBook(String title, String author) {
		Book removeBook = new Book();
		for(Book o : bookList) {
			if(o.getTitle().equals(title) && o.getAuthor().equals(author)) {
				removeBook = o;
				bookList.remove(o);
				return removeBook;
			}
		}
		return null;
	}
	public int ascBook() {
		try {
			Collections.sort(bookList);
			return 1;
		} catch(Exception e ) {
			return 0;
		}
	}
}
