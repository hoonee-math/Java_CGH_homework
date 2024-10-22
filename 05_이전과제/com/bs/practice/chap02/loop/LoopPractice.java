package com.bs.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc= new Scanner(System.in);
	
	public void practice1() {		
//		사용자로부터한개의값을입력받아1부터그숫자까지의숫자들을모두출력하세요.
//		단, 입력한수는1보다크거나같아야합니다.
//		만일1 미만의숫자가입력됐다면“1 이상의숫자를입력해주세요“를출력하세요.
//		 ex.
//		 1이상의숫자를입력하세요: 4 		1이상의숫자를입력하세요: 0
//		 1 2 3 4 					1 이상의숫자를입력해주세요.
		System.out.print("1이상의 숫자를 입력하세요: ");
		int num1=sc.nextInt();
		for(int i=0;i<num1;i++) {
			System.out.print((i+1)+" ");
			if((i+1)%20==0) System.out.println();
		}
	}

	public void practice2() {		
//		위문제와모든것이동일하나, 1 미만의숫자가입력됐다면
//		“1 이상의숫자를입력해주세요”가출력되면서다시사용자가값을입력하도록하세요.
//		 ex.
//		 1이상의숫자를입력하세요: 4 		1이상의숫자를입력하세요: 0
//		 1 2 3 4 					1 이상의숫자를입력해주세요.
//		 							1이상의숫자를입력하세요: 8
//		 							1 2 3 4 5 6 7 8 
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num1=sc.nextInt();
		
		if(num1<1) {
			System.out.println("1 이상의 숫자를 입력하세요.");
			practice2();
		} else {
			for(int i=0;i<num1;i++) {
				System.out.print((i+1)+" ");
				if((i+1)%20==0) System.out.println();
			}
		}
	}

	public void practice3() {		
//		사용자로부터한개의값을입력받아1부터그숫자까지의모든숫자를거꾸로출력하세요.
//		단, 입력한수는1보다크거나같아야합니다.
//		 ex.
//		 1이상의숫자를입력하세요: 4 		1이상의숫자를입력하세요: 0
//		 4 3 2 1 					1 이상의숫자를입력해주세요.
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num1=sc.nextInt();
		for(int i=0;i<num1;i++) {
			System.out.print((num1-i)+" ");
			if((i+1)%20==0) System.out.println();
		}
	}

	public void practice4() {		
//		위문제와모든것이동일하나, 1 미만의숫자가입력됐다면
//		“1 이상의숫자를입력해주세요”가출력되면서다시사용자가값을입력하도록하세요.
//		 ex.
//		 1이상의숫자를입력하세요: 4 		1이상의숫자를입력하세요: 0
//		 4 3 2 1 					1 이상의숫자를입력해주세요.
//		 							1이상의숫자를입력하세요: 8
//		 							8 7 6 5 4 3 2 1
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num1=sc.nextInt();
		
		if(num1<1) {
			System.out.println("1 이상의 숫자를 입력하세요.");
			practice4();
		} else {
			for(int i=0;i<num1;i++) {
				System.out.print((num1-i)+" ");
				if((i+1)%20==0) System.out.println();
			}
		}
	}

	public void practice5() {		
//		 1부터사용자에게입력받은수까지의정수들의합을출력하세요.
//		 ex.
//		 정수를하나입력하세요: 8
//		 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		System.out.print("정수를 하나 입력하세요: ");
		int num1=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<num1;i++) {
			if(i<(num1-1)) {
				System.out.print((i+1)+" + ");
				if((i+1)%20==0) System.out.println();}
			else {
				System.out.print((i+1)+" = ");}
			sum+=(i+1);			
		}
		System.out.println(sum);
		
	}

	public void practice6() {		
//		사용자로부터두개의값을입력받아그사이의숫자를모두출력하세요.
//		만일1 미만의숫자가입력됐다면“1 이상의숫자를입력해주세요“를출력하세요.
//		 ex.
//		첫번째숫자: 8		첫번째숫자: 4			첫번째숫자: 9
//		두번째숫자: 4 		두번째숫자: 8 			두번째숫자: 0
//		4 5 6 7 8 		4 5 6 7 8 			1 이상의숫자를입력해주세요.

		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1=sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2=sc.nextInt();
		if(num1==0||num2==0) {
			System.err.println("1이상의 숫자를 입력해주세요.");
			
		} else {
			int min=0, max=0;
			if(num1>=num2) {
				max=num1;
				min=num2;
			} else {
				max=num2;
				min=num1;
			}
			for(int i=0;i<max-min+1;i++) {
				System.out.print(min+i);
			}
		}
	}

	public void practice7() {		
//		위문제와모든것이동일하나, 1 미만의숫자가입력됐다면
//		“1 이상의숫자를입력해주세요”가출력되면서다시사용자가값을입력하도록하세요.
//		 ex.
//		첫번째숫자: 8		첫번째숫자: 4		첫번째숫자: 9
//		두번째숫자: 4 		두번째숫자: 8 		두번째숫자: 0
//		4 5 6 7 8 		4 5 6 7 8 		1 이상의숫자를입력해주세요.
//										첫번째숫자: 6
//										두번째숫자: 2
//										2 3 4 5 6
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1=sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2=sc.nextInt();
		if(num1==0||num2==0) {
			System.err.println("1이상의 숫자를 입력해주세요.");
			practice7();
			
		} else {
			int min=0, max=0;
			if(num1>=num2) {
				max=num1;
				min=num2;
			} else {
				max=num2;
				min=num1;
			}
			for(int i=0;i<max-min+1;i++) {
				System.out.print(min+i);
			}
		}
	}

	public void practice8() {		
//		사용자로부터입력받은숫자의단을출력하세요.
//		 ex.
//		숫자: 4
//		 ===== 4단=====
//		 4 * 1 = 4
//		 4 * 2 = 8
//		 4 * 3 = 12
//		 4 * 4 = 16
//		 4 * 5 = 20
//		 4 * 6 = 24
//		 4 * 7 = 28
//		 4 * 8 = 32
//		 4 * 9 = 36
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자: ");
		int num=sc.nextInt();
		System.out.printf("===== %d단 =====\n",num);
		for( int j =1; j<10; j++) {
			System.out.printf("%d x %d = %d\n", num, j, num*j);
		}

	}

	public void practice9() {		
//		사용자로부터입력받은숫자의단부터9단까지출력하세요.
//		단, 9를초과하는숫자가들어오면“9 이하의숫자만입력해주세요”를출력하세요.
//		 숫자: 4						숫자: 10
//		 ===== 4단===== 				9 이하의숫자만입력해주세요.
//		 ===== 5단=====
//		 ===== 6단=====
//		 ===== 7단=====
//		 ===== 8단=====
//		 ===== 9단=====
//		 (해당단의내용들은길이상생략)
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자: ");
		int num=sc.nextInt();
		for(int i=num;i<10;i++) {
			if(num>=10) {
				System.out.println("9이하의 숫자만 입력해주세요.");
			}
			System.out.printf("===== %d단 =====\n",i);
			for( int j =1; j<10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}

	}

	public void practice10() {		
//		위문제와모든것이동일하나, 9를초과하는숫자가입력됐다면
//		“9 이하의숫자를입력해주세요”가출력되면서다시사용자가값을입력하도록하세요.
//		숫자: 4						숫자: 10
//		 ===== 4단===== 				9 이하의숫자만입력해주세요.
//		 ===== 5단===== 				숫자: 8
//		 ===== 6단===== 				===== 8단=====
//		 ===== 7단===== 				===== 9단=====
//		 ===== 8단=====
//		 ===== 9단=====
//		 (해당단의내용들은길이상생략)
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자: ");
		int num=sc.nextInt();
		for(int i=num;i<10;i++) {
			if(num>=10) {
				System.out.println("9이하의 숫자만 입력해주세요.");
				practice10();
			}
			System.out.printf("===== %d단 =====\n",i);
			for( int j =1; j<10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
		
	}

	public void practice11() {		
//		사용자로부터시작숫자와공차를입력받아
//		일정한값으로숫자가커지거나작아지는프로그램을구현하세요.
//		단, 출력되는숫자는총10개입니다.
//		 * ‘공차’는숫자들사이에서일정한숫자의차가존재하는것을말한다.
//		 ex) 2, 7, 12, 17, 22 …
//		 		5  5  5  5  => 여기서공차는5
//		 ex.
//		시작숫자: 4
//		공차: 3
//		 4 7 10 13 16 19 22 25 28 31
		Scanner sc=new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int num = sc.nextInt();
		System.out.print("공차: ");
		int tolerance = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.print(num+i*tolerance+" ");
		}
		
	}

	public void practice12() {		
//		정수두개와연산자를입력받고입력된연산자에따라알맞은결과를출력하세요.
//		단, 해당프로그램은연산자입력에“exit”라는값이들어올때까지무한반복하며
//		exit가들어오면“프로그램을종료합니다.”를출력하고종료합니다.
//		또한연산자가나누기이면서두번째정수가0으로들어오면
//		“0으로나눌수없습니다. 다시입력해주세요.”를출력하며,
//		없는연산자가들어올시“없는연산자입니다. 다시입력해주세요.”라고출력하고
//		두경우모두처음으로돌아가사용자가다시연산자부터입력하도록하세요.
//		 [다음장출력예시참고]
//				 
//				 연산자(+, -, *, /, %) : +
//				 정수1 : 10
//				 정수2 : 4
//				  10 + 4 = 14
//				  
//				  
//				 연산자(+, -, *, /, %) : /			연산자(+, -, *, /, %) : /
//				 정수1 : 10 							정수1 : 10
//				 정수2 : 4 							정수2 : 0
//				  10 / 4 = 2 						0으로나눌수없습니다. 다시입력해주세요.
//				  
//				  
//				 연산자(+, -, *, /, %) : ^ 			연산자(+, -, *, /, %) : exit
//				 정수1 : 10 							프로그램을종료합니다.
//				 정수2 : 4
//				 없는연산자입니다. 다시입력해주세요.

		String operators="";
		
		calFor:
		for(;!operators.equals("exit");){
			System.out.print("연산자(+,-,*,/,%) : ");
			Scanner sc=new Scanner(System.in);
			operators=sc.next();
			
			if(operators.equals("exti")) {
				System.out.println("프로그램을 종료합니다.");
				continue;
			}
			char operator=operators.charAt(0);
			int num1 =0, num2=0, result=0;
			
			System.out.print("정수1 : ");
			num1=sc.nextInt();
			System.out.print("정수2 : ");
			num2=sc.nextInt();
			
			switch(operator){
				case '+': result = num1 + num2; break;
				case '-': result = num1 - num2; break;
				case '*': result = num1 * num2; break;
				case '/': if(num2==0) {System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요\n"); continue calFor;}else { result = num1 / num2; }; break;
				case '%': result = num1 % num2; break;
				default : System.out.println("없는 연산자 입니다. 다시 입력해 주세요.\n"); continue calFor; 
			}
			
			System.out.printf("%d %s %d = %d \n\n", num1, operator, num2, result);
		}
	}

	public void practice13() {		
//		다음과같은실행예제를구현하세요.
//		 ex.
//		정수입력: 4
//		 *
//		 **
//		 ***
//		 ****
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void practice14() {		
//		다음과같은실행예제를구현하세요.
//		 ex.
//		정수입력: 4
//		 ****
//		 ***
//		 **
//		 *
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice15() {
//		사용자로부터입력받은하나의값이소수인지판별하는프로그램을구현하세요.
//		단, 입력한수가2보다작은경우“잘못입력하셨습니다.”를출력하세요.
//		 * ‘소수’는n을1부터n까지로나누었을때나누어떨어지는수가1과n뿐인수를말한다.
//		 ex) 2, 3, 5, 7, 11 …
//		 ex. 
//		숫자: 5		숫자: 9		숫자: 0
//		소수입니다. 	소수가아닙니다.	잘못입력하셨습니다.
		System.out.print("숫자: ");
		int num=sc.nextInt();
		if(num>0) { 
			boolean isPrime=true;
			
			for(int i=2;i<(int)Math.sqrt(num)+1;i++) {
				if(num%i==0) isPrime=false;
			}
			if(!isPrime) System.out.println("소수가 아닙니다.");
			else System.out.println("소수입니다.");
		} else {
			System.out.println("잘못입력하였습니다.");
		}
		
	}
	
	public void practice16() {
//		위문제와모든것이동일하나, 입력한수가2보다작은경우
//		“잘못입력하셨습니다.”를출력하면서다시사용자가값을입력하도록하세요.
//		 * ‘소수’는n을1부터n까지로나누었을때나누어떨어지는수가1과n뿐인수를말한다.
//		 ex) 2, 3, 5, 7, 11 …
//		ex. 
		
//		숫자: 5		숫자: 9		숫자: 0
//		소수입니다. 	소수가아닙니다.	잘못입력하셨습니다.
//								숫자: 13
//								소수입니다.
		System.out.print("숫자: ");
		int num=sc.nextInt();
		if(num>0) { 
			boolean isPrime=true;
			
			for(int i=2;i<(int)Math.sqrt(num)+1;i++) {
				if(num%i==0) isPrime=false;
			}
			if(!isPrime) System.out.println("소수가 아닙니다.");
			else System.out.println("소수입니다.");
		} else {
			System.out.println("잘못입력하였습니다.");
			practice15();
		}
		

	}
	
	public void practice17() {
//		2부터사용자가입력한수까지의소수를모두출력하고소수의개수를출력하세요.
//		단, 입력한수가2보다작은경우“잘못입력하셨습니다.”를출력하세요.
//		 ex.
//		숫자: 11
//		 2 3 5 7 11 
//		2부터11까지소수의개수는5개입니다
		System.out.print("숫자: ");
		int iNum=sc.nextInt();
		int count=0;
		
		for(int i=2; i<=iNum;i++) {
			for(int j=1; j<=(int)Math.sqrt(i); j++) {
				if(i%j==0&&j>1) break;
				if(j==((int)Math.sqrt(i))) {
					count++;
					System.out.print(i+" ");
				}
			}
		}
	}
	public void practice18() {
//		1부터사용자에게입력받은수까지중에서
//		1) 2와3의배수를모두출력하고
//		2) 2와3의공배수의개수를출력하세요.
//		 * ‘공배수’는둘이상의수의공통인배수라는뜻으로어떤수를해당수들로나눴을때
//		모두나머지가0이나오는수
//		ex.
//		자연수하나를입력하세요: 15
//		 2 3 4 6 8 9 10 12 14 15 
//		count : 2
		
	}
	
	public void practice19() {
//		다음과같은실행예제를구현하세요.
//		 ex.
//		정수입력: 4
//		    *
//		   **
//		  ***
//		 ****
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int k=0;k<num-i-1;k++)
				System.out.print(" ");
			for(int j=0;j<=i;j++) 
				System.out.print("*");
			
			System.out.println();
		}

	}
	
	public void practice20() {
//		다음과같은실행예제를구현하세요.
//		 ex.
//		정수입력: 3
//		 *
//		 **
//		 ***
//		 **
//		 *
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<num-1;i++) {
			for(int j=0;j<num-i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
	
	public void practice21() {
//		다음과같은실행예제를구현하세요.
//		 ex.
//		정수입력: 4
//		 *
//		 ***
//		 *****
//		 *******
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void practice22() {
//		다음과같은실행예제를구현하세요.
//		 ex.
//		정수입력: 5
//		 *****
//		 *   *
//		 *   *
//		 *   *
//		 *****
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i%(num-1)==0||j%(num-1)==0) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
}
