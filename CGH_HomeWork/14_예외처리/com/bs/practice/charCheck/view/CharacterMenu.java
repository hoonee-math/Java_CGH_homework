package com.bs.practice.charCheck.view;

import java.util.Scanner;

import com.bs.practice.charCheck.controller.CharacterController;
import com.bs.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	
	CharacterController cc = new CharacterController();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String msg = sc.nextLine();
		int countA = 0;
		try {
			countA = cc.countAlpha(msg);
			System.out.println("\'"+msg+"\'에 포함된 영문자 개수 : "+countA);
		} catch(CharCheckException e) {
			e.printStackTrace();
		}
		
	}
}
