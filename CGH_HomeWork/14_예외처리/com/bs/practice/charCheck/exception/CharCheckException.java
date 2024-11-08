package com.bs.practice.charCheck.exception;

public class CharCheckException extends Exception {
	
	public CharCheckException() {
		
	}
	
	public CharCheckException(String msg) {
		super("2. "+msg);
		System.err.println("1. "+msg);
	}
	
}
