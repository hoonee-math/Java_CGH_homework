package com.bs.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void casting()	{
		Scanner sc=new Scanner(System.in);
		
		double total=0.0, mean=0.0;
		
		System.out.print("국어: ");
		total+=sc.nextDouble();
		System.out.print("영어: ");
		total+=sc.nextDouble();
		System.out.print("수학: ");
		total+=sc.nextDouble();
		System.out.println("총점: "+(int)total);
		System.out.println("평균: "+(int)total/3);
	}

}
