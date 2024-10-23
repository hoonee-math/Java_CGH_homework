package com.bs.practice.chap02.loop;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Supplementary {
	
	public static int playFunctionNumber = 0;

	public void rockScissorsPaper() {
		Scanner sc=new Scanner(System.in);
		int userType=0;

		Random ran=new Random();
		int comType=0;

		int userV=0, comV=0, same=0;
		String result="";

		do{
			System.out.print("가위바위보 게임입니다. \n가위:1 바위:2 보:3 게임종료:0\n숫자를 입력하세요: ");
			userType=sc.nextInt();
			comType=ran.nextInt(3)+1;

			if(userType==0) {
				System.out.println("\n\n====== 가위 바위 보 게임 최종 결과 ======");
				System.out.printf("컴퓨터 승: %d번,  사용자 승: %d번, 무승부: %d번",comV,userV,same);
				break;
			}
			else if(userType==1){
				switch(comType) {
				    case 1 : result = "비겼습니다."; same++; break;
				    case 2 : result = "컴퓨터가 이겼습니다."; comV++; break;
				    case 3 : result = "사용자가 이겼습니다."; userV++; break;
				    default : result = "결과에 문제가 발생했습니다.";
				}
			}
			else if(userType==2){
				switch(comType) {
				    case 2 : result = "비겼습니다."; same++; break;
				    case 3 : result = "컴퓨터가 이겼습니다."; comV++; break;
				    case 1 : result = "사용자가 이겼습니다."; userV++; break;
				    default : result = "결과에 문제가 발생했습니다.";
				}
			}
			else if(userType==3){
				switch(comType) {
				    case 3 : result = "비겼습니다."; same++; break;
				    case 1 : result = "컴퓨터가 이겼습니다."; comV++; break;
				    case 2 : result = "사용자가 이겼습니다."; userV++; break;
				    default : result = "결과에 문제가 발생했습니다.";
			    }
			} 
			else{
			  System.out.println("0~3서이의 정수를 입력하세요.");  continue;
			}
	
			System.out.printf("컴퓨터는 %d 를 냈습니다. %s \n\n", comType, result);
		} while(userType!=0);
	}
	
	public void printNumLoop() {  // practice32
		System.out.println("\n1. 1부터 100까지 숫자를 출력하세요.");
		for(int i =0; i<100; i++) {
			System.out.print(i+1+" ");
			if(i%20==19) System.out.println();
		}
		

		System.out.println("\n2. 100부터 0까지 숫자를 출력하세요.");
		for(int i =0; i<100; i++) {
			System.out.print(100-i+" ");
			if(i%20==19) System.out.println();
		}

		System.out.println("\n3. 1부터 100까지 짝수만 출력하세요.");
		for(int i =0; i<100; i+=2) {
			System.out.print(i+2+" ");
			if(i%20==18) System.out.println();
		}

		System.out.println("\n4. 1부터 100까지의 합을 출력하세요.");
		int sum =0;
		for(int i =0; i<100; i++) {
			sum+=i+1;
		}
		System.out.println("1부터 100까지의 합: "+sum);

		System.out.println("\n5. 입력 받은 정수까지의 짝수를 출력하세요.");
		System.out.print("정수 입력: ");
		Scanner sc=new Scanner(System.in);
		int inputNum = sc.nextInt();
		int intSum = 0;
		for(int i =2; i<=inputNum; i+=2) {
			System.out.print(i+"  ");
			if(i%20==0) System.out.println();
			intSum += i;
		}
		System.out.println();

		
		System.out.println("\n6. 입력 받은 정수까지의 짝수의 합을 출력하세요.");
		System.out.println("조금 전 입력받은 정수까지 짝수의 합은 : "+intSum);
		
		
		System.out.println("\n7. 정수를 입력 받아 1부터 입력 받은 정수까지 수를 "
				+ "\n 홀수와 짝수를 나눠서 짝수면 \"박\", 홀수면 \"수\"를 출력 하세요.");
//	  
//	  예) 4입력 : 수박수박 / 5입력 : 수박수박수 출력
//
		System.out.print("실행 결과 : ");
		for(int i=1 ; i<=inputNum ; i++) {
			if(i%2==0) System.out.print("박");
			else System.out.print("수");
		}
		System.out.println();
	
     
		System.out.println("\n8. 정수를 입력 받아 입력된 값의 구구단 프로그램을 만들어보세요.");
//	 예) 5입력 
//	      5X1=5
//	      5X2=10
//	      5X3=15
//	         .
//	         .
//	      5X9=45
//
//	   단, 1~9까지만 가능하고 이외에 값을 넣으면 “잘못입력하셨습니다. 프로그램종료합니다”출력
		System.out.print("구구단 몇단을 출력할까요: ");
		inputNum = sc.nextInt();
		for(int i=1 ; i<10; i++) {
			System.out.println(inputNum+"X"+i+"="+inputNum*i);
		}
	}
		
	public void printStirngLoop() { // practice33
		Scanner sc= new Scanner(System.in);
	
		System.out.println("\n9. 문자열과 문자열에서 검색될 문자를 입력 받아 "
				+ "문자열에 그 문자가 몇 개이었는지 개수를 확인하는 프로그램을 작성하세요.	"
				+ "단 문자열은 영문자만 작성 영문자 이외의문자가 있으면 영문자가 아닙니다 출력");
//	출력 예)
//	   문자열 입력 : application
//		문자 입력 : p
//		포함된 갯수 : 2 개
//		====================
//		문자열 입력 : apple_test123
//		문자 입력 : p
//		영문자가 아닙니다.
		System.out.print("문자열 입력 : ");
		String inputString = sc.next();
		System.out.print("검색할 문자 : ");
		char inputChar = sc.next().charAt(0);
		
		int countChar = 0;
		for(int i=0; i<inputString.length(); i++) {
			if(		(inputString.charAt(i)>='a' && inputString.charAt(i)<='z')
					|| (inputString.charAt(i)>='A' && inputString.charAt(i)<='Z')) {
				System.out.println("영문자가 아닌 문자를 포함하고 있습니다.");
				countChar=0;
				break;
			}
				
			if(inputString.charAt(i)==inputChar)
				countChar++;
		}
		
		if(countChar>0) {
			System.out.print("\n포함된 갯수 : ");
			System.out.print(countChar);
		}
	}
	
	public void practice34() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("\n10. 5명의 회원정보를 입력 받아 저장하고 출력하는 프로그램을 만드세요. "
				+ "\n입력 : 이름, 나이, 주소, 키, 몸무게, 연락처");
		int low = 2, column = 6 ;
		String[][] members = new String[low][column];
		String[] category = {"이름","나이","주소","키","몸무게","연락처"};
		
		for(int i=0; i<low; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(category[j]+": ");
				members[i][j]=sc.next();
			}
		}
		for(int i=0; i<low; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(members[i][j]+" ");
			}
			System.out.println();
		}
		
		
	
//
//	출력 예) 
//	=========== 저장회원==========
//	홍길동 19세 서울시 강남구 170cm 68kg 010…
//	임걱정 20세 경기도 수원시 180cm 75kg 010…
//	                             .
		System.out.println("\n11. 몬스터 사냥하기 게임의 사냥하는 기능을 만드시오.");
		System.out.println("사용법"
				+ "\n0. 사냥시작 1. 오크사냥 2. 용사냥 3. 사람사냥 99.끝내기 "
				+ "\n선택: ");
		int inputNum = 0, expSum = 0, killMonster =0, killHuman=0;
		
		while(inputNum!=99) {
			switch(inputNum) {
				case 0 : System.out.println("사냥을 시작합니다."); expSum+=1; break;
				case 1 : System.out.println("오크 사냥 완료 +1 exp"); expSum+=1; killMonster +=1; break;
				case 2 : System.out.println("용 사냥 완료 +15 exp"); expSum+=15; killMonster +=1; break;
				case 3 : System.out.println("사람 사냥 -100 exp"); expSum+=-100; killHuman +=1; break;
				default : System.out.println("잘못된 값을 입력하였습니다."); break;
			}
			System.out.print("입력: ");
			inputNum = sc.nextInt();
		}
		System.out.println("사냥을 마쳤습니다.");
		System.out.println("사냥한 몹의 수는 "+killMonster+"마리, 획득한 경험치는 "+expSum+"입니다.");
	
//
//	출력 예) 
//	사용법 
//	0. 사냥시작 1. 오크사냥 2. 용사냥 3. 사람사냥 99.끝내기
//	선택 : 
//	사냥을 시작합니다.
//	입력 : 1
//	오크사냥완료 +1 exp
//	입력 : 2
//	용 사냥 완료 +15exp
//	입력 : 99
//	사냥을 마쳤습니다.
//	사냥한 몹의 수는 2마리, 획득한 경험치는 16exp입니다.	
	}
	
}
