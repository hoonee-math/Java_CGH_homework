package com.list.library.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.list.library.controller.BookController;
import com.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("==== Welcome CGH Library ====\n");
		System.out.println("******** 메인 메뉴 ********");
		System.out.println(""
				+ "1. 새 도서 추가\n"
				+ "2. 도서 전체 조회\n"
				+ "3. 도서 검색 조회\n"
				+ "4. 도서 삭제\n"
				+ "5. 도서명 오름차순 정렬\n"
				+ "8. 더미 데이터 입력\n"
				+ "9. 종료\n");
		boolean selectMenuBoolean=true;
		while(selectMenuBoolean) {
			System.out.print("메뉴 번호 선택 : ");
			switch(sc.nextInt()) {
				case 1: insertBook(); selectMenuBoolean=false; break;
				case 2: selectList(); selectMenuBoolean=false; break;
				case 3: searchBook(); selectMenuBoolean=false; break;
				case 4: deleteBook(); selectMenuBoolean=false; break;
				case 5: ascBook();	  selectMenuBoolean=false; break;
				case 9: return;
				default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	public void insertBook() {
		System.out.println("---- 1. 새 도서 추가 ----");
		System.out.println("도서명,저자명,장르,가격을 차례대로 입력해주세요");
		System.out.print("도서명: ");
		String title=sc.next();
		System.out.print("저자명: ");
		String author=sc.next();
		System.out.println("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타)");
		String category="";
		boolean flag=true;
		while(flag) {
			System.out.print("장르 선택(번호 입력) : ");
			int categoryInt=sc.nextInt();
			switch(categoryInt) {
			case 1: category="인문"; break;
			case 2: category="자연과학"; break;
			case 3: category="의료"; break;
			case 4: category="기타"; break;
			default : System.out.println("장르 번호를 정확히 입력하세요.");
			}
		}
		System.out.print("가격: ");
		int price=sc.nextInt();
		
		Book bk=new Book(title,author,category,price);
		bc.insertBook(bk);
	}
	public void selectList() {
		ArrayList<Book> bookList = new ArrayList<Book>(bc.selectList());
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			bookList.forEach(System.out::println);
		}
	}
	public void searchBook() {
		System.out.print("검색할 도성와 관련된 키워드를 입력해주세요: ");
		String keyword = sc.next();
		ArrayList<Book> searchList = new ArrayList<Book>(bc.searchBook(keyword));
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			searchList.forEach(System.out::println);
		}
	}
	public void deleteBook() {
		System.out.print("삭제할 도서명: ");
		String title = sc.next();
		System.out.print("삭제할 도서 저자명: ");
		String author = sc.next();
		Book remove = new Book();
		remove = bc.deleteBook(title, author);
		if(remove != null) {
			System.out.println(remove+"가 성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}
	public void ascBook() {
		if(bc.ascBook()==1)
			System.out.println("정렬에 성공하였습니다.");
		else
			System.out.println("정렬에 실패하였습니다.");
	}
}
