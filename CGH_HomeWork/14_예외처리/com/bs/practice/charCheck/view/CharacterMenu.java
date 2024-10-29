package com.bs.practice.charCheck.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		String msg = sc.next();
		char[] msgChar = new char[msg.length()];
		for(int i=0; i<msgChar.length; i++) {
			msgChar[i]=msg.charAt(i);
		}
//		if(msgChar[i]>=)
	}
}
