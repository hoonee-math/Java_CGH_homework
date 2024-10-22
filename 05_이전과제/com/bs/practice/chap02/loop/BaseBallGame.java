package com.bs.practice.chap02.loop;

import java.util.Random;
import java.util.Scanner;

//야구게임만들기.txt
public class BaseBallGame {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	
	
	public void inputCheck() {
		
		System.out.println("=== 야구게임 시작 ===");
		
		int leng=3, hun=100;
		int correctNo = 0; // 10진수로 값을 저장하기위한 변수
		int[] correct = new int[leng];

		// 세자리 숫자 출력
		for(int i=0; i<correct.length; i++) {
			correct[i]=random.nextInt(9)+1;
			if(i!=0)
			for(int j=0; j<i ; j++) {
				if(correct[i]==correct[j]) {
					correct[i]=random.nextInt(9)+1;
					j=0;
				}
			}
			// 10진수로 값을 저장하기 위한 로직
			correctNo += correct[i]*hun;
			hun /= 10;
		}
		
		
		int inputNum= 0; // 입력받은 값을 저장할 변수 선언
		// 입력받은값과 10진수로 저장된 값이 같을때까지 실행되는 로직.
		while(inputNum!=correctNo) {
			hun = 100;
			System.out.print("입력 : ");
			inputNum = sc.nextInt();
			int temp = inputNum; // 입력받은 값의 각 자리수를 계산하기 위한 저장공간
			
			// 백의자리 숫자가 아니면 다시 입력하도록 안내
			if((inputNum!=0 &&inputNum<100) || inputNum>999) {
				System.out.println("다시 입력하세요.");
				continue;
			} else if( inputNum==0) {
				// 0을 누르면 정답 미리 출력 로직
				System.out.print("답: ");
				for(int c : correct) {
					System.out.print(c);
				}
				System.out.println();
			}
			
			// 입력받은 수를 각 자리수별로 배열로 저장
			int[] checkNum = new int[leng];
			for(int i=0; i<checkNum.length; i++) {
				checkNum[i]=temp/hun;
				temp = temp%hun;
				hun /=10;
				//System.out.println(checkNum[i]);
			}
			
			// 입력받은 값을 정답과 비교하여 볼과 스트라이크 계산
			int[] checkList = new int[leng]; // 1:스타리이크, 2:볼
			
			for(int i=0; i<checkNum.length; i++) {
				// 스트라이크 체크
				if(correct[i]==checkNum[i]) {
					checkList[i]=1;
					continue;
				}
				for(int j=0; j<checkNum.length;j++) {
					// 볼체크
					if(i!=j && correct[i]==checkNum[j]) {
						checkList[i]=2;
						break;
					}
				}
			}
			
//			// (확인용 로직)볼, 스트라이크 여부 체크			
//			for(int i : checkList) {
//				System.out.print(i);
//			}
//			System.out.println();
			
			int countStrike =0, countBall =0;
			for(int i : checkList) {
				if(i==1)
					countStrike++;
				else if(i==2)
					countBall++;
			}
			System.out.print(countStrike+"S "+countBall+"B");
			if(countStrike==0 && countBall ==0)
				System.out.println(" 파울");
			else
			if(checkList[0]==1 &&
					checkList[1]==1 &&
					checkList[2]==1) {
				System.out.println(" 정답");
				System.out.println("게임한판 더? (y/n) ");
				char re = sc.next().charAt(0);
				if(re == 'y')
					inputCheck();
			}
		}
	}
}
