package com.bs.practice.charCheck.controller;

import com.bs.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {}
	
	public int countAlpha(String msg) throws CharCheckException {
		int countAlpha = 0;
		
		char[] msgChar = new char[msg.length()];
		for(int i=0; i<msgChar.length; i++) {
			msgChar[i]=msg.charAt(i);
			if((msgChar[i]>=65 && msgChar[i]<=90)
					||(msgChar[i])>=97&&(msgChar[i]<=122)) {
				countAlpha++;
			} else if(msgChar[i]==' ') {
				throw new CharCheckException("체크할 룸자열 안에 공백이 포함되어 있습니다.");
				
			}
		}
		
		return countAlpha;
	}
}
