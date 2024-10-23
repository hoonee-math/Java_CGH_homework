package com.bs.practice.student.controller;

import com.bs.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public static int CUT_LINE = 60;
	
	public StudentController() {
		sArr[0]=new Student("김길동","자바",100);
		sArr[1]=new Student("박길동","디비",50);
		sArr[2]=new Student("이길동","화면",85);
		sArr[3]=new Student("정길동","서버",60);
		sArr[4]=new Student("홍길동","자바",20);
	}
	
	public Student[] printStudent() {
		return sArr;
	}
	public int sumScore() {
		int sumScore =0;
		for(Student s : sArr) {
			if(s!=null)
				sumScore += s.getScore();
		}
		return sumScore;
	}
	public double[] avgScoer() {
		double[] avgScore = new double[2];
		int count=0;
		for(Student s : sArr) {
			if(s!=null)
				count++;
		}
		
		avgScore[0]=sumScore();
		if(count!=0)
			avgScore[1]=avgScore[0]/(double)count;
		else
			avgScore[1]=0;
		
		return avgScore;
	}
	
}
