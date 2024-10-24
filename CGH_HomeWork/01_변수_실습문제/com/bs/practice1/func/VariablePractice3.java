package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	// 가로, 세로 값을 실수형으로 입력 받아 사각혀의 면적과 둘레를 계산하여 출력
	public void rectangle() {
		double width=0.0, length=0.0;
		
		Scanner sc=new Scanner(System.in);
	
		System.out.print("가로: ");
		width=sc.nextDouble();
		System.out.print("세로: ");
		length=sc.nextDouble();
		
		System.out.printf("면적: %.2f\n",width*length);
		System.out.printf("둘레: %.2f\n",(width+length)*2);

	}
}
