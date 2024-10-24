package com.bs.practice.chap01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ControlPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
//		아래예시와같이메뉴를출력하고메뉴번호를누르면“OO메뉴입니다“를,
//		종료번호를누르면“프로그램이종료됩니다.”를출력하세요.
//		ex.
//		1. 입력
//		2. 수정
//		3. 조회
//		4. 삭제
//		7. 종료
//		메뉴번호를입력하세요: 3
//		조회메뉴입니다.
		int selectNum=0;
		System.out.println("1. 입력 \n2. 수정\n3. 조회 \n4. 삭제 \n7. 종료");
		System.out.print("메뉴 번호를 입력하세요: ");
		selectNum=sc.nextInt();
		
		switch(selectNum) {
		case 1 : System.out.println("입력 메뉴 입니다."); break;
		case 2 : System.out.println("수정 메뉴 입니다."); break;
		case 3 : System.out.println("조회 메뉴 입니다."); break;
		case 4 : System.out.println("삭제 메뉴 입니다."); break;
		case 7 : System.out.println("프로그램이 종료됩니다."); break;
		default : System.out.println("위 메뉴 중에 번호를 선택해 주세요"); break;
		}

	}
	public void practice2() {
//		키보드로정수를입력받은정수가양수이면서짝수일때만“짝수다”를출력하고
//		짝수가아니면“홀수다“를출력하세요.
//		양수가아니면“양수만입력해주세요.”를출력하세요.
//		 ex.
//		숫자를한개입력하세요: -8
//		양수만입력해주세요
		System.out.print("숫자를 한개 입력하세요: ");
		int num=sc.nextInt();
		
		if(num>0) System.out.println(num%2==0?"짝수다":"홀수다");
		else System.out.println("양수만 입력해 주세요");
		
	}
	public void practice3() {
//		국어, 영어, 수학세과목의점수를키보드로입력받고합계와평균을계산하고
//		합계와평균을이용하여합격/ 불합격처리하는기능을구현하세요.
//		 (합격조건: 세과목의점수가각각40점이상이면서평균이60점이상일경우)
//		합격했을경우과목별점수와합계, 평균, “축하합니다, 합격입니다!”를출력하고
//		불합격인경우에는“불합격입니다.”를출력하세요
//		 ex 1. 			ex 2.
//		 국어점수: 88		국어점수: 88
//		 수학점수: 50		수학점수: 50
//		 영어점수: 40		영어점수: 45
//		 불합격입니다.		국어: 88
//		 수학: 50
//		 영어: 45
//		 합계: 183
//		 평균: 61.0
//		 축하합니다, 합격입니다!
		int kor=0, math=0, eng=0;
		double mean=0.0;
		System.out.print("국어점수: ");
		kor = sc.nextInt();
		System.out.print("수학점수: ");
		math = sc.nextInt();
		System.out.print("영어점수: ");
		eng = sc.nextInt();
		mean=(kor+math+eng)/3.0;
		if(kor>=40&&math>=40&&eng>=40&&mean>=60) {
			System.out.println("국어: "+kor);
			System.out.println("수학: "+math);
			System.out.println("영어: "+eng);
			System.out.println("합계: "+(kor+math+eng));
			System.out.println("평균: "+mean);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	public void practice4() {
//		수업자료(7page)에서if문으로되어있는봄, 여름, 가을, 겨울예제를switch문으로바꿔서출력하세요.
//		 ex 1.
//		 1~12 사이의정수입력: 8
//		 8월은여름입니다.
//		 ex 2.
//		 1~12 사이의정수입력: 99
//		 99월은잘못입력된달입니다
		System.out.print("1~12 사이의 정수 입력: ");
		int month=sc.nextInt();
		String season="";
		switch(month) {
		case 3: case 4: case 5: 		season="봄"; break;
		case 6: case 7: case 8: case 9: season="여름"; break;
		case 10: case 11:				season="가을"; break;
		case 12: case 1: case 2:		season="겨울"; break;
		}
		if(month>=1&&month<=12)
			System.out.println(month+"월은 "+season+"입니다.");
		else
			System.out.println(month+"월은 잘못 입력된 달입니다.");
	}
	public void practice5() {
//		아이디, 비밀번호를정해두고로그인기능을작성하세요.
//		로그인성공시“로그인성공”, 
//		아이디가틀렸을시“아이디가틀렸습니다.“,
//		비밀번호가틀렸을시“비밀번호가틀렸습니다.”를출력하세요.
//		 ex 1. 					ex 2. 					ex 3.
//		아이디: myId				아이디: myId				아이디: my
//		비밀번호: myPassword12		비밀번호: myPassword		비밀번호: myPassword12
//		로그인성공					비밀번호가틀렸습니다.			아이디가틀렸습니다.
		String id="myId", pw="1234";
		String inputId="", inputPw="";
		
		System.out.print("아이디: ");
		inputId=sc.next();
		System.out.print("비밀번호: ");
		inputPw=sc.next();
		
		if(inputId.equals(id)&&inputPw.equals(pw))
			System.out.println("로그인 성공");

		else if(!(inputId.equals(id))&&inputPw.equals(pw))
			System.out.println("아이디가 틀렸습니다");

		else if(inputId.equals(id)&&!(inputPw.equals(pw)))
			System.out.println("비밀번호가 틀렸습니다.");
	}
	public void practice6() {
//		사용자에게관리자, 회원, 비회원중하나를입력받아각등급이행할수있는권한을출력하세요.
//		단, 관리자는회원관리, 게시글관리, 게시글작성, 게시글조회, 댓글작성이가능하고
//		회원은게시글작성, 게시글조회, 댓글작성이가능하고
//		비회원은게시글조회만가능합니다.
//		 ex.
//		권한을확인하고자하는회원등급: 관리자
//		회원관리, 게시글관리게시글작성, 댓글작성게시글조회
		String rank="";
		String authority="";
		System.out.println("====== 관리 권한 조최 ======");
		System.out.println("사용자 종류: 관리자, 회원, 비회원");
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		rank=sc.nextLine();
		
		switch(rank) {
		case "관리자" : authority+="회원 관리, "+"게시글 관리, ";
		case "회원" : authority+="게시글 작성, "+"댓글 작성, ";
		case "비회원" : authority+="게시글 조회"; break;
		default : authority="사용자 종류를 정확히 입력하세요."; break;
		}
		System.out.println(authority);
		

	}
	public void practice7() {
//		키, 몸무게를double로입력받고BMI지수를계산하여계산결과에따라
//		저체중/정상체중/과체중/비만을출력하세요.
//		 BMI = 몸무게/ (키(m) * 키(m))
//		 BMI가18.5미만일경우저체중/  18.5이상23미만일경우정상체중
//		BMI가23이상25미만일경우과체중/  25이상30미만일경우비만
//		BMI가30이상일경우고도비만
//		ex.
//		키(m)를입력해주세요: 1.65
//		몸무게(kg)를입력해주세요: 58.4
//		 BMI 지수: 21.45087235996327
//		정상체중
		System.out.print("키(m)를 입력해주세요: ");
		double height=sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요:");
		double weight=sc.nextDouble();
		
		double bmi = weight/(height*height);
		System.out.println(" BMI 지수: "+bmi);
		
		String result="";
		if(bmi<18.5) result="저체중";
		else if(bmi<23) result="정상체중";
		else if(bmi<25) result="과체중";
		else if(bmi<30) result="비만";
		else result="비만";
		System.out.println(result);
	}
	
	public void practice8() {
//		키보드로두개의정수와연산기호를입력받아연산기호에맞춰연산결과를출력하세요.
//		 (단,두개의정수모두양수일때만작동하며없는연산기호를입력했을시
//		“잘못입력하셨습니다. 프로그램을종료합니다.” 출력)
//		 ex.
//		피연산자1 입력: 15
//		피연산자2 입력: 4
//		연산자를입력(+,-,*,/,%) : /
//		 15 / 4 = 3.750000
		System.out.print("피연산자1 입력: ");
		int num1=sc.nextInt();
		System.out.print("피연산자2 입력: ");
		int num2=sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char operator=sc.next().charAt(0);
		double result=0.0;
		
		switch(operator) {
		case '+': result = num1 + num2;	break;
		case '-': result = num1 - num2;	break;
		case '*': result = (double)num1 * num2;	break;
		case '/': result = (double)num1 / num2;	break;
		case '%': result = num1 % num2;	break;
		}
		System.out.printf("%d %s %d = %f",num1, operator, num2, result);
	}
	
	public void practice9() {
//		중간고사, 기말고사, 과제점수, 출석회수를입력하고Pass 또는Fail을출력하세요.
//		평가비율은중간고사20%, 기말고사30%, 과제30%, 출석20%로이루어져있고
//		이때, 출석비율은출석회수의총강의회수20회중에서출석한날만따진값으로계산하세요.
//		 70점이상일경우Pass,70점미만이거나전체강의에30% 이상결석시Fail을출력하세요.
//		 [출력예시는다음3장참고]
		
		System.out.print("중간고사 점수: ");
		double score1=sc.nextDouble();
		System.out.print("기말고사 점수: ");
		double score2=sc.nextDouble();
		System.out.print("과제 점수: ");
		double score3=sc.nextDouble();
		System.out.print("출석 회수: ");
		double score4=sc.nextDouble();
		
		double total=0.0;
		total=score1*0.2+score2*0.3+score3*0.3+score4;
		
		System.out.println("================= 결과 =================");
		if((total>=70)&&(score4>20*0.7)) {
			System.out.println("중간고사점수(20) : "+score1*0.2);
			System.out.println("기말고사점수(30) : "+score2*0.3);
			System.out.println("과제점수(30) : "+score3*0.3);
			System.out.println("출석점수(20) : "+score4);
			System.out.println("총점: "+total);
			System.out.println("Pass");
		}else if(score4<=20*0.7){
			System.out.printf("Fail [출석회수부족(%d/20)]",(int)score4);
		} else {
			System.out.println("중간고사점수(20) : "+score1*0.2);
			System.out.println("기말고사점수(30) : "+score2*0.3);
			System.out.println("과제점수(30) : "+score3*0.3);
			System.out.println("출석점수(20) : "+score4);
			System.out.println("총점: "+total);
			System.out.println("Fail [점수미달]");
		}
//		중간고사점수: 80
//		기말고사점수: 30
//		과제점수: 60
//		출석회수: 18
//		 ================= 결과=================
//		중간고사점수(20) : 16.0
//		기말고사점수(30) : 9.0
//		과제점수(30) : 18.0
//		출석점수(20) : 18.0
//		총점: 61.0
//		 Fail [점수미달]
//		 ex 3.
//		 중간고사점수: 100
//		 기말고사점수: 80
//		 과제점수: 40
//		 출석회수: 10
//		  ================= 결과=================
//		  Fail [출석회수부족(10/20)]

	}
	
	
	public void practice10() {
//		앞에구현한실습문제를선택하여실행할수있는메뉴화면을구현하세요.
//		 ex.
//		실행할기능을선택하세요.
//		 1. 메뉴출력
//		2. 짝수/홀수
//		3. 합격/불합격
//		4. 계절
//		5. 로그인
//		6. 권한확인
//		7. BMI
//		 8. 계산기
//		9. P/F
//		선택: 4 (실습문제4 실행)
		System.out.print("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택: ");
		int select=sc.nextInt();
		switch(select) {
			case 1: practice1(); break;
			case 2: practice2(); break;
			case 3: practice3(); break;
			case 4: practice4(); break;
			case 5: practice5(); break;
			case 6: practice6(); break;
			case 7: practice7(); break;
			case 8: practice8(); break;
			case 9: practice9(); break;
			default: System.out.println("번호를 정확히 입력하세요."); practice10();
		}
	}
	public void practice11() {
//		정수를이용해서4자리비밀번호를만들려고하는데
//		이때4자리정수를입력받아각자리수에중복되는값이없을경우‘생성성공’
//		중복값이있으면‘중복값있음‘
//		자리수가안맞으면‘자리수안맞음‘ 출력
//		단, 제일앞자리수의값은1~9 사이정수
//		
//		ex.
//		비밀번호입력(1000~9999) : 56555		비밀번호입력(1000~9999) : 1234
//		자리수안맞음						성공
//		
//		비밀번호입력(1000~9999) : 5685
//		실패
		Scanner sc=new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		String pw=sc.next();
		
		if((pw.length()!=4)||((int)(pw.charAt(0)-'0')==0)) {
			System.out.println("자리수 안맞음");
		}else {
			boolean flag=true;
			pwFor:
			for(int i=0;i<pw.length();i++) {
				for(int j=0; j<i; j++) {
					if(pw.charAt(i)==pw.charAt(j)) {
						System.out.println("실패 / 중복값 있음");
						flag=false;
						break pwFor;
					}
				}
			}
			if(flag) System.out.println("생성 성공");
		}
		if(pw.equals("exit")) {} else practice11(); 
	}

	public void practice110() {
		Scanner sc=new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw=sc.nextInt(); // ex 1223
		
		if(pw>9999||pw<1000) {
			System.out.println("자리수 안맞음");
		} else {
			boolean flag=true;
			
			pwFor:
			for(int i=1000 ; i>0 ; i/=10) {
				int checkNum1=pw/i; //1223 > 1		// 223/100 > 2
				int remainNum=pw%i; //1223 > 223	// 223%100 > 23
				
				for(int j=i/10 ; j>0 ; j/=10) {
					int checkNum2=remainNum/j; // checkNum2=223/100=2
					if(checkNum1==checkNum2) { // 1==2
						System.out.println("실패 / 중복값 있음");
						flag=false;
						break pwFor;
					}
	                remainNum %= j;	// 223%100=23
				}
				pw %= i;	// pw를 1223 에서 223으로 바꿔줌
			}
			if(flag) System.out.println("생성 성공");
		}
		if(pw==0) {} else practice110(); 
	}
	
	public void practice111() {
		Scanner sc=new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw=sc.nextInt(); // ex 1223
		
		int thou=pw/1000;
		int huns=(pw%1000)/100;
		int tens=(pw%100)/10;
		int unit=(pw%10);
		
		boolean isAllDifferent = 
				thou==huns|| thou==tens || thou==unit ||
				huns==tens|| huns==unit || tens==unit;
		
		if(pw>9999||pw<1000) {
			System.out.println("자리수 안맞음");
	    } else if (!isAllDifferent) {
	            System.out.println("생성 성공");
	    } else {
            System.out.println("실패/중복값 있음");
        }
	    
		if(pw==0) {} else practice111(); 
	}
	
	// 민현님 코드
	public void practice112() {
		boolean isRound = true;
		int jaritsu = 1;
		while (isRound) {
			boolean isSuccess = true;
			System.out.print("비밃번호 입력(1000~9999)");
			int input = sc.nextInt();				// 예를 들어 1223 을 넣어보자
			if (input < 1000 || input > 9999) {				// 이러면 1223
				System.out.println("자리수 안맞음");
				isRound = false;
			} else {
				qa: for (int j = 10; j < 1000; j = j * 10) { // j는 10일때
					int num = input % j;			// 1223 % 10 = 3이 나옴.
					// 1의 자리
					// 1의 자리일때는 10 100 100
					// 10의자리
					// 100의 자리
					for (int i =j; i <= 10000; i = i * 10) { // j는 10 > i는 10, 100, 1000, 10000까지 >> j는 100 일때 i는 100, 1000, 10000
						//100으로 나머지 하면 10의 자리
						//1000으로 나머지 하면 100의 자리
						//10000으로 나머지 하면 1000의자리가 나오고
						//(입력값 그대로 나옴)
						//이걸 다시 나누기로 10의 자리를 10으로 나누면 10의
						//자릿수의 값
						int a=((input % (i*10))/i);
						if (a == num) { // (1223 % (10*10) = 23 > 23 / 10)==2
							isSuccess = false;
							break qa;
						}
					}
				}
				System.out.println((isSuccess) ? "성공" : "실패:중복있음");
			}
		}
	}
}
