package com.bs.practice.dimension;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	
	public static int dimensionPracticeNumber = 0;

	public void parctice1() {
//		3행3열짜리문자열배열을선언및할당하고
//		인덱스0행0열부터2행2열까지차례대로접근하여“(0, 0)”과같은형식으로저장후출력하세요.
//		 ex.
//		 (0, 0)(0, 1)(0, 2)
//		 (1, 0)(1, 1)(1, 2)
//		 (2, 0)(2, 1)(2, 2)
		String[][] threeDiArr = new String[3][3];
		for(int i = 0; i<3; i++) {
			for(int j = 0 ; j<3 ; j++) {
				threeDiArr[i][j]="("+i+", "+j+")";
				System.out.print(threeDiArr[i][j]);
			}
			System.out.println();
		}
		
	}
	public void parctice2() {
//		4행4열짜리정수형배열을선언및할당하고
//		1) 1 ~ 16까지값을차례대로저장하세요.
//		 2) 저장된값들을차례대로출력하세요.
//		 ex.
//		 1  2  3  4 
//		5  6  7  8 
//		9 10 11 12 
//		13 14 15 16
		int[][] intArr = new int[4][4];
		int num=1;
		for(int i=0; i<4; i++	) {
			for(int j=0; j<4 ; j++) {
				intArr[i][j]=num++;
				System.out.print(intArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void parctice3() {
//		 4행4열짜리정수형배열을선언및할당하고
//		 1) 16 ~ 1과같이값을거꾸로저장하세요.
//		  2) 저장된값들을차례대로출력하세요.
//		  ex.
//		  16 15 14 13 
//		 12 11 10  9 
//		 8  7  6  5 
//		 4  3  2  1
		int[][] intArr = new int[4][4];
		int num=0;
		for(int i=0; i<4; i++	) {
			for(int j=0; j<4 ; j++) {
				intArr[i][j]=16-num++;
				System.out.print(intArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void parctice4() {
//		 4행4열2차원배열을생성하여0행0열부터2행2열까지는1~10까지의임의의정수값저장후
//		 아래의내용처럼처리하세요.
//		  ex.
//		  6  6  1 13 
//		 4 10  8 22 
//		 8  6  5 19 
//		 18 22 14 108
		Random rand = new Random();
		int rowsum =0;
		int[] colsum =new int[4];
		int[][] intArr = new int[4][4];
		for(int i=0; i<4; i++	) {
			for(int j=0; j<4 ; j++) {
				if(i==3) {
					intArr[i][j]=colsum[j];
				}
				else if(j==3) {
					intArr[i][j]=rowsum;
					colsum[j]+=rowsum;
					rowsum=0;
				} else {
					intArr[i][j]=rand.nextInt(10)+1;
					rowsum+=intArr[i][j];
					colsum[j]+=intArr[i][j];
				}
				System.out.print(intArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void parctice5() {
//		 2차원배열의행과열의크기를사용자에게직접입력받되,1~10사이숫자가아니면
//		 “반드시1~10 사이의정수를입력해야합니다.” 출력후다시정수를받게하세요.
//		 크기가정해진이차원배열안에는영어대문자가랜덤으로들어가게한뒤출력하세요.
//		  (char형은숫자를더해서문자를표현할수있고65는A를나타냄)
//		  ex.
//		 행크기: 5
//		 열크기: 4
//		  T P M B 
//		 U I H S 
//		 Q M B H 
//		 H B I X 
//		 G F X I
		int row = 0, col = 0, num =0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.print("행 크기: ");
		row = sc.nextInt();
		System.out.print("열 크기: ");
		col = sc.nextInt();
		char[][] charArr = new char[row][col];
		
		for(int i = 0 ; i < row ; i++) {
			for(int j =0; j < col ; j++) {
				num=random.nextInt(26)+65;
				charArr[i][j]=(char)num;
				System.out.print(charArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public void parctice6() {
//		 String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
//			 "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
//			 위의초기화되어있는배열을가지고아래의‘[그림]실습문제4 흐름’과같은방식으로출력하세요.
//			 단, print()를사용하고값사이에띄어쓰기(“ “)가존재하도록출력하세요
		String[][] strArr = new String[][] {
			{"이", "까", "왔", "앞", "힘"}, 
			{"차", "지", "습", "으", "냅"}, 
			{"원", "열", "니", "로", "시"}, 
			{"배", "심", "다", "좀", "다"}, 
			{"열", "히", "! ", "더", "!! "}
		};
		for(int i=0 ; i<5 ; i++) {
			for(int j=i+1; j<5 ; j++) {
				String temp = strArr[i][j];
				strArr[i][j]= strArr[j][i];
				strArr[j][i]= temp;
			}
		}
		for(int i=0; i<5 ; i++) {
			for(int j=0; j<5; j++){
				System.out.print(strArr[i][j]);
			}
		}
			 
	}
	public void parctice7() {
//		사용자에게행의크기를입력받고그수만큼의반복을통해열의크기도받아
//		문자형가변배열을선언및할당하세요.
//		그리고각인덱스에‘a’부터총인덱스의개수만큼하나씩늘려저장하고출력하세요.
//		 ex.
//		행의크기: 4
//		 0행의열크기: 2
//		 1행의열크기: 6
//		 2행의열크기: 3
//		 3행의열크기: 5
//		 a b 
//		c d e f g h 
//		ij k 
//		l m n o p
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기: ");
		int row = sc.nextInt();
		int[] rowSize = new int[row];
		char[][] charDynamicArr = new char[row][];
		int count = 97;
		
		for(int i=0; i<row; i++) {
			System.out.print((i+1)+"행의 열 크기: ");
			rowSize[i]=sc.nextInt();
			charDynamicArr[i] = new char[rowSize[i]];
			for(int j=0; j<rowSize[i]; j++) {
				charDynamicArr[i][j]=(char)count++;
			}
		}
		for(int i=0;i<row; i++) {
			for(int j=0; j<rowSize[i];j++) {
				System.out.print(charDynamicArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public void parctice8() {
//		 1차원배열에12명의학생들을출석부순으로초기화하고
//		 2열3행으로2차원배열2개를이용하여분단을나눠
//		 1분단왼쪽부터오른쪽, 1행에서아래행순으로자리를배치하세요.
//		  <출석부>
//		  1. 강건강2. 남나나3. 도대담4. 류라라5. 문미미6. 박보배
//		 7. 송성실8. 윤예의9. 진재주10. 차천축11. 피풍표12. 홍하하
//		 ex.
//		 == 1분단==
//		강건강남나나
//		도대담류라라
//		문미미박보배
//		== 2분단==
//		송성실윤예의
//		진재주차천축
//		피풍표홍하하
		String[] student = new String[] {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] studentDegreeArr = new String[6][2];
		for(int i =0; i<12; i++) {
			if(i%6==0)
				System.out.printf("== %d분단 ==\n",i/6+1);
			System.out.print(student[i]);
			if(i%2==0) {
				studentDegreeArr[i/2][0]=student[i];
				System.out.print(" ");
			}
			else {
				studentDegreeArr[i/2][1]=student[i];
				System.out.println();
				
			}
		}
	}
	public void parctice9() {
//		위문제에서자리배리배치한것을가지고학생이름을검색하여
//		해당학생이어느자리에앉았는지출력하세요.
//		 ex.
//		 == 1분단==
//		강건강남나나
//		도대담류라라
//		문미미박보배
//		== 2분단==
//		송성실윤예의
//		진재주차천축
//		피풍표홍하하
//		============================
//		검색할학생이름을입력하세요: 차천축
//		검색하신차천축학생은2분단두번째줄오른쪽에있습니다
		String[] student = new String[] {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] studentDegreeArr = new String[6][2];
		for(int i =0; i<12; i++) {
			if(i%6==0)
				System.out.printf("== %d분단 ==\n",i/6+1);
			System.out.print(student[i]);
			if(i%2==0) {
				studentDegreeArr[i/2][0]=student[i];
				System.out.print(" ");
			}
			else {
				studentDegreeArr[i/2][1]=student[i];
				System.out.println();
				
			}
		}
		System.out.println(studentDegreeArr[5][1]);
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String search = sc.next();
		searchFor:
		for(int i=0; i<6; i++) {
			for(int j=0; j<2 ; j++) {
				if(studentDegreeArr[i][j].equals(search)) {
					String str1 ="", str2="";
					if(i/3<1) str1="1"; else str1="2";
					switch(i%3) {
					case 0: str2="첫번째줄"; break;
					case 1: str2="두번째줄"; break;
					case 2: str2="세번째줄"; break;
					}
					System.out.print("검색하신 "+search+" 학생은 "+str1+"분단 "+str2+((j==0)?" 왼쪽":" 오른쪽")+"에 있습니다.");
					break searchFor;
					}
			}
		}
	}
}
