package com.bs.practice.charCheck.run;

import com.bs.practice.charCheck.view.CharacterMenu;

public class Run {


	public static void main(String[] args) {
		System.out.println("===== 예외처리 과제 프로그램이 실행되었습니다 =====");
		System.out.println("------------ 1_예외실습문제.pdf -----------");
		while(true) {
			CharacterMenu cm = new CharacterMenu();
			cm.menu();
		}
	}

}
