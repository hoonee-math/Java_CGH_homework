package com.bs.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		int num1=0;
		String result="";
		
		System.out.print("정수 입력: ");
		num1=sc.nextInt();
		
		result=num1>0?"양수":"양수가 아니다";

		System.out.println(result);
	}
	
	public void practice2()	{
//		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
//		양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		int num1=0;
		String result="";
		
		System.out.print("정수 입력: ");
		num1=sc.nextInt();
		
		result=num1>0?"양수":(num1==0?"0이다":"음수다");
		System.out.println(result);
	}
	
	public void practice3()	{
//		키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		int num1=0;
		String result="";
		
		System.out.print("정수 입력: ");
		num1=sc.nextInt();
		
		result=num1%2==0?"짝수다":"홀수다";
		System.out.println(result);
	}
	public void practice4()	{
//		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
//		ex.
//		인원 수 : 29
//		사탕 개수 : 100
//		1인당 사탕 개수 : 3
//		남는 사탕 개수 : 13
		int person=0, candy=0;
		System.out.print("인원 수: ");
		person=sc.nextInt();
		System.out.print("사탕 개수: ");
		candy=sc.nextInt();
		System.out.printf("1인당 사탕 개수: %d",candy/person);
		System.out.printf("남는 사탕 개수: %d",candy%person);
	}
	public void practice5()	{
//		키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요. 
//		이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
//		ex.
//		이름 : 홍길동
//		학년(숫자만) : 3
//		반(숫자만) : 4
//		번호(숫자만) : 15
//		성별(M/F) : F
//		성적(소수점 아래 둘째자리까지) : 85.75
//		3학년 4반 15번 홍길동 여학생의 성적은 85.75이다.
		
		String name="";
		char gender=' ';
		int grade=0, classN=0, stnum=0;
		double score=0.0;
		
		System.out.print("이름: ");
		name=sc.next();
		System.out.print("학년(숫자만): ");
		grade=sc.nextInt();
		System.out.print("반(숫자만):");
		classN=sc.nextInt();
		System.out.print("번호(숫자만):");
		stnum=sc.nextInt();
		System.out.print("성별(M/F):");
		gender=sc.next().charAt(0);
		gender=gender=='M'?'남':'여';
		System.out.print("성적(소수점 아래 둘째자리까지): ");
		score=sc.nextDouble();
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.",grade,classN,stnum,name,gender,score);
	}
	public void practice6()	{
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
//		성인(19세 초과)인지 출력하세요.
//		ex.
//		나이 : 19
//		청소년
	}
	public void practice7()	{
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요. 
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//		ex.
//		국어 : 60
//		영어 : 80
//		수학 : 40
//		합계 : 180
//		평균 : 60.0
//		합격
		int kor=0, eng=0, math=0;
		double total=0.0, mean=0.0;
		
		System.out.print("국어: ");
		kor=sc.nextInt();
		System.out.print("영어: ");
		eng=sc.nextInt();
		System.out.print("수학: ");
		math=sc.nextInt();
		total=kor+eng+math;
		System.out.println("합계: "+(int)total);
		System.out.println("평균: "+total/3);
		System.out.println(kor>=40&&eng>=40&&math>=40&&total/3>=60?"합격":"불합격");	
	}
	public void practice8()	{
//		주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
//		ex. 
//		주민번호를 입력하세요(- 포함) : 132456-2123456
//		여자
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char gender=sc.next().charAt(7);
		System.out.println(gender=='1'?"남자":"여자");
	}
	public void practice9()	{
//		키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요. 
//		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//		아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함)
//		ex.
//		정수1 : 4
//		정수2 : 11
//		입력 : 13
//		true
		int num1=0, num2=0, compare=0;
		System.out.print("정수1: ");
		num1=sc.nextInt();
		System.out.print("정수2: ");
		num2=sc.nextInt();
		System.out.print("비교할 정수: ");
		compare=sc.nextInt();
		System.out.println(num1>=compare||num2<compare);
		
	}
	public void practice10()	{
//		3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
//		ex.
//		입력1 : 5
//		입력2 : -8
//		입력3 : 5
//		false
		int num1=0, num2=0, num3=0;
		System.out.print("정수1: ");
		num1=sc.nextInt();
		System.out.print("정수2: ");
		num2=sc.nextInt();
		System.out.print("정수3: ");
		num3=sc.nextInt();
		System.out.println(num1==num2&&num2==num3);
		
	}
	public void practice11()	{
//		A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
//		인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요. 
//		(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
//		ex.
//		A사원의 연봉 : 2500
//		B사원의 연봉 : 2900
//		C사원의 연봉 : 2600
//		A사원 연봉/연봉+a : 2500/3500.0
//		3000 이상
//		B사원 연봉/연봉+a : 2900/2900.0
//		3000 미만
//		C사원 연봉/연봉+a : 2600/2989.9999999999995
//		3000 미만
		int num1=0, num2=0, num3=0;
		System.out.print("A사원의 연봉 : ");
		num1=sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		num2=sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		num3=sc.nextInt();
		System.out.print("A사원 연봉/연봉+a : "+num1+"/"+num1*1.4+"\n"+(num1*1.4>=3000?"3000 이상":"3000 미만")+"\n");
		System.out.print("B사원 연봉/연봉+a : "+num2+"/"+num2*1.0+"\n"+(num2>=3000?"3000 이상":"3000 미만")+"\n");
		System.out.print("C사원 연봉/연봉+a : "+num3+"/"+num3*1.15+"\n"+(num3*1.15>=3000?"3000 이상":"3000 미만")+"\n");
		
	}
	
}
