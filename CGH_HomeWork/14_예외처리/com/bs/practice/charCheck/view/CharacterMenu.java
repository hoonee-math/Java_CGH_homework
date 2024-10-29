package com.bs.practice.charCheck.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterMenu {
	public void menu() {
		int count =0;
		Scanner sc = new Scanner(System.in);
		String msg = sc.next();
		char[] msgChar = new char[msg.length()];
		for(int i=0; i<msgChar.length; i++) {
			msgChar[i]=msg.charAt(i);
			if((msgChar[i]>=65 && msgChar[i]<=90)
					||(msgChar[i])>=97&&(msgChar[i]<=122)) {
				count++;
			}
		}
	}
}
