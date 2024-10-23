package com.bs.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void casting()	{
		Scanner sc=new Scanner(System.in);
		System.out.print("문자 입력: ");
		char text=sc.next().charAt(0);
		
		System.out.println(text+" unicode : "+(int)text);
	}
}
