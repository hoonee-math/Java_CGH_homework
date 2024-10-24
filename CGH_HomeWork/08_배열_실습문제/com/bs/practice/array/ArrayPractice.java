package com.bs.practice.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	
	public static int runPractice=16;
	
	
	public void practice1() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.
//		1 2 3 4 5 6 7 8 9 10 
		int[] intNum = new int[10];
		for(int i=0; i<10; i++) {
			intNum[i]=i+1;
			System.out.print(intNum[i]+" ");
		}
	}
	public void practice2() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.
//		10 9 8 7 6 5 4 3 2 1 
		int[] reverseNum = new int[10];
		for(int i=0; i<10; i++) {
			reverseNum[i]=10-i;
			System.out.print(reverseNum[i]+" ");
		}
	}
	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//		ex.
//		양의 정수 : 5
//		1 2 3 4 5 
		System.out.print("양의 정수: ");
		Scanner sc=new Scanner(System.in);
		int scanNum = sc.nextInt();
		int[] intNum = new int[scanNum];
		for(int i=0; i<scanNum; i++) {
			intNum[i]=i+1;
			System.out.print(intNum[i]+" ");
		}
	}
	public void practice4() {
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
//		ex.
//		귤
		String[] fruit=new String[] {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruit[1]);
	}
	public void practice5() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//		ex.
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8 
//		i 개수 : 2
		Scanner sc= new Scanner(System.in);
		System.out.print("문자열: ");
		String scanStr = sc.next();
		char[] arrayStr = new char[scanStr.length()];
		
		System.out.print("검색할 문자: ");
		char findChar = sc.next().charAt(0);
		
		for(int i=0; i<scanStr.length(); i++) {
			arrayStr[i]=scanStr.charAt(i);
		}
		
		System.out.print(scanStr+"에 "+findChar+"가 존재하는 위치(index) : ");
		int count = 0;
		for(int i=0; i<scanStr.length(); i++) {
			if(findChar==arrayStr[i]) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(findChar+ " 개수: "+count);
	}
	public void practice6() {
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//		ex.
//		0 ~ 6 사이 숫자 입력 : 4 		0 ~ 6 사이 숫자 입력 : 7
//		금요일 						잘못 입력하셨습니다.
		String[] dayOfWeek = new String[] {"월","화","수","목","금","토","일"};
		System.out.print("0 ~ 6 사이 숫자 입력(7종료): ");
		Scanner sc= new Scanner(System.in);
		int scanNum=sc.nextInt();
		System.out.println(dayOfWeek[scanNum]);
		
		if(scanNum==7) return;
		else practice6();
	}
	public void practice7() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2 
//		총 합 : 2
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: ");
		int scanNum=sc.nextInt();
		int[] arrayN= new int[scanNum];
		int sum=0;
		for(int i=0; i<scanNum; i++) {	
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arrayN[i]=sc.nextInt();
			sum+=arrayN[i];
		}
		for(int i=0; i<scanNum; i++) {
			System.out.print(arrayN[i]+" ");
		}
		System.out.println("\n"+Arrays.toString(arrayN));
		
		System.out.println("총 합 : "+sum);
	}
	public void practice8() {
//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요. 
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
//		ex.
//		정수 : 4
//		다시 입력하세요. 정수 : -6
//		다시 입력하세요. 정수 : 5
//		1, 2, 3, 2, 1
		Scanner sc= new Scanner(System.in);
		System.out.print("홀수 입력: ");
		int num=sc.nextInt();
		
		if(num%2==1) {
			int[] arrayN = new int[num];
			for(int i=0; i<num; i++) {
				if(i<num/2+1) arrayN[i]=i+1;
				else arrayN[i]=num/2+1-(i-num/2);
				System.out.print(arrayN[i]+" ");
			}
		} else {
			System.out.print("다시 입력하세요. ");
			practice8();
		}
		
			
		
		
	}
	public void practice9() {
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//		ex.
//		치킨 이름을 입력하세요 : 양념 치킨 이름을 입력하세요 : 불닭
//		양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다.
		Scanner sc=new Scanner(System.in);
		System.out.println("***** 치킨 메뉴 - 양념, 후라이드 *****");
		System.out.print("치킨 이름을 입력하세요: ");
		String inputMenu=sc.next();
		
		String[] menuChicken = {"양념", "후라이드"};
		boolean isContain = false;
		for(String menu	: menuChicken ) {
			if(inputMenu.equals(menu)) {
				System.out.print(inputMenu+"치킨 배달 가능");
				isContain = true;
				return;
			}
		}
		if(!isContain) System.out.println(inputMenu+"치킨은 없는 메뉴입니다.");
		practice9();
	}
	public void practice10() {
//		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
//		ex.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		Scanner sc=new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String id=sc.next();
		while(!(id.length()==14)) {
			System.out.print("잘못 입력하였습니다. 다시 입력해주세요: ");
			id=sc.next();
		}
		char[] idChar=new char[14];
		for(int i=0; i<14; i++) {
			idChar[i]=id.charAt(i);
		}
		
		char[] idCopy1 = new char[14];
		char[] idCopy2 = new char[14];
		char[] idCopy3 = new char[14];
		
		// System.arraycopy 를 이용한 복사
		System.arraycopy(idChar, 0, idCopy1, 0, idChar.length);
		// Arrays.copy 를 이용한 복사
		idCopy2 = Arrays.copyOf(idChar, idChar.length);
		// clone 을 이용한 복사
		idCopy3 = idChar.clone();
		
		for(int i=7; i<14; i++) {
			idCopy1[i]='*';
		}
		for(int i=7; i<14; i++) {
			idCopy2[i]='*';
		}
		for(int i=7; i<14; i++) {
			idCopy3[i]='*';
		}
		
		System.out.println("=== 저장된 주민등록번호 출력 ===");
		System.out.println("System.arraycopy 를 이용한 복사");
		for(int i=0; i<14; i++) {
			System.out.print(idCopy1[i]);
		}
		System.out.println("\nArrays.copy 를 이용한 복사");
		for(int i=0; i<14; i++) {
			System.out.print(idCopy2[i]);
		}
		System.out.println("\nclone 을 이용한 복사");
		for(int i=0; i<14; i++) {
			System.out.print(idCopy3[i]);
		}
		
	}
	public void practice11() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//		ex.
//		9 7 6 2 5 10 7 2 9 6 
		int[] randInt = new int[10];
		Random rd=new Random();
		for(int i=0; i<10; i++){
			randInt[i]=rd.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(randInt));
	}
	public void practice12() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//		ex.
//		5 3 2 7 4 8 6 10 9 10 
//		최대값 : 10
//		최소값 : 2
		int[] randInt = new int[10];
		Random rd=new Random();
		for(int i=0; i<10; i++){
			randInt[i]=rd.nextInt(10)+1;
		}
		int min=10, max=0;
		for(int n : randInt) {
			if(n<=min)
				min=n;
			if(n>=max)
				max=n;
		}
		System.out.println(Arrays.toString(randInt));
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}
	public void practice13() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//		ex.
//		4 1 3 6 9 5 8 10 7 2 
		int[] randInt = new int[10];
		Random rd=new Random();
		for(int i=0; i<10; i++){
			randInt[i]=rd.nextInt(10)+1;
			if(i>1) {
				for(int j=0; j<i; j++) {
					if(randInt[i]==randInt[j]) {
						randInt[i]=rd.nextInt(10)+1;
						j=-1;	// for문을 처음부터 다시 실행시킴!
					}
				}
				
			}
		}
		System.out.println(Arrays.toString(randInt));
	}
	public void practice14() {
//		로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
//		ex.
//		3 4 15 17 28 40 
		int[] randInt = new int[5];
		Random rd=new Random();
		for(int i=0; i<5; i++){
			randInt[i]=rd.nextInt(45)+1;
			if(i>1) {
				for(int j=0; j<i; j++) {
					if(randInt[i]==randInt[j]) {
						randInt[i]=rd.nextInt(45)+1;
						j=-1;	// for문을 처음부터 다시 실행시킴!
					}
				}
			}
		}
//		5 3 2 1 7
		// 오름차순 정렬 코드
		for(int i=0; i<5; i++) {
			int temp = 0;
			for(int j=0; j<5 ; j++) {
				if(i==j) continue;
				if(randInt[i]<randInt[j]) {
					temp=randInt[i];
					randInt[i]=randInt[j];
					randInt[j]=temp;
				}
			}			
		}
		System.out.println(Arrays.toString(randInt));
	}
	public void practice15() {
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요.
//		ex.
//		문자열 : application
//		문자열에 있는 문자 : a, p, l, i, c, t, o, n
//		문자 개수 : 8
		System.out.print("문자열: ");
		Scanner sc= new Scanner(System.in);
		String input = sc.next();
		char[] arrayS = new char[input.length()];
		// 배열에 각 문자 저장
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<input.length();i++) {
			arrayS[i]=input.charAt(i);
			System.out.print(arrayS[i]);
			if(i!=input.length()-1) {
				System.out.print(", ");
			}
		}
		System.out.println("\n문자 개수 : "+arrayS.length);
	}
	public void practice16() {
//		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요. 
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지, 
//			늘린 곳에 어떤 데이터를 넣을 것인지 받으세요. 
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
//		[출력 예시 다음 장]
//
//		ex.
//		배열의 크기를 입력하세요 : 3
//		1번째 문자열 : 자바의 정석
//		2번째 문자열 : 알고리즘
//		3번째 문자열 : C프로그래밍
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 2
//		4번째 문자열 : 인간관계
//		5번째 문자열 : 자기계발
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 1
//		6번째 문자열 : 영단어600
//		더 값을 입력하시겠습니까?(Y/N) : n
//		[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		Scanner sc=new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int leng=sc.nextInt();
		String[] arrayS=new String[leng];
		
		int inputM=leng; // 처음에는 leng 개만큼 입력받고 나중에는 moreN 개만큼씩 추가로 더 입력받기.
		int moreN = 0;
		
		boolean more = true;
		while(more) {
			for(int i=0; i<inputM; i++) {
				if(moreN==0) { // 추가로 입력받은 적이 없는 경우
					System.out.print((i+1)+"번째 문자열 : ");
					arrayS[i]=sc.next();
				} else {
					System.out.print((leng-moreN+i+1)+"번째 문자열 : ");
					arrayS[leng-moreN+i] = sc.next();
				}
			}
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char moreS = sc.next().charAt(0);
			if(moreS=='y'||moreS=='Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				moreN = sc.nextInt();
				inputM=moreN; // 새로 입력받을 문자열 개수를 for문에서 돌릴 변수에 저장
				leng+=moreN;
				System.out.println("leng = "+leng);
				String[] arrayCopy = new String[leng];
				arrayCopy = arrayS.clone();
			
				arrayS=new String[leng];
				System.arraycopy(arrayCopy, 0, arrayS, 0, leng-moreN);
				
				// 로그 확인용 출력
//				System.out.println("arrayCopy.length 길이 : "+ arrayCopy.length);
//				System.out.println(Arrays.toString(arrayCopy));
//				System.out.println("arrayS.length 길이 : " + arrayS.length);
//				System.out.println(Arrays.toString(arrayS));
			}	else {
				more = false;
				System.out.println(Arrays.toString(arrayS));
			}
		}
	}
}








