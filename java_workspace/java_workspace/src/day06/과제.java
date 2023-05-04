package day06;

import java.util.Scanner;

public class 과제 {
     static Scanner scan = new Scanner(System.in); // 모든 곳에 입력 가능.
	public static void main(String[] args) {
		/* 계산기 (+ - * % ) 각각 메서드 만들기
		 * 메서드에서 바로 출력
		 * 1. 숫자를 입력받는 메서드
		 *  - 숫자는 배열 입력받기 (숫자 2개)
		 * 2. 메뉴 메서드
		 * - 원하는 계산을 선택해 주세요. > 
		 * - 1 : 덧셈 , 2: 뺄셈 , 3 : 나눗셈 , 4 : 나눗셈, 5 : 나머지
		 * 3. 각 기능 메서드 => 메서드에서 바로 출력 (3 + 2 = 5)
		 * (메인에서 switch로)
		 * main에서 처리되어야 되는 부분
		 *   1) 1번 메서드 호출 => 숫자를 배열로 저장
		 *   2) 2번 메서드 호출 => 내가 선택한 번호 가져오기
		 *   3) switch(2번 return)
		 *   4) case에 따라 계산기 메서드 호출
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("2개의 숫자를 입력해 주세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		num(num1,num2);
		System.out.println("원하는 계산을 선택해 주세요.");
		System.out.println("1 : 덧셈 , 2: 뺄셈 , 3 : 나눗셈 , 4 : 나눗셈, 5 : 나머지");
		int cal = scan.nextInt();
	
		
		switch(cal) {
		 case 1 :
			 sum(num1,num2);
			 break;
		 case 2 :
			sub(num1,num2);
			 break;
		 case 3 :
			 mul(num1,num2);
			 break;
		 case 4 :
			 div(num1,num2);
			 break;
		 case 5 :
			 rem(num1,num2);
			 break;
			 default :
				 System.out.println("값을 잘못 입력하셨습니다.");
				 break;
		}
		
		

	}
	/* 각 기능에 대한 메서드
	 * 리턴 : void
	 * 매겨변수 : 배열
	 */
	
	public static int[] num(int num1, int num2) {
		int num[] = new int[2];
		num[0] = num1;
		num[1] = num2;
		
		return num;
	}
	
	public static void sum(int num1, int num2) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		
	}
	public static void sub(int num1, int num2) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		
	}
	public static void mul(int num1, int num2) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		
	}
	public static void div(int num1, int num2) {
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		
	}
	public static void rem(int num1, int num2) {
			System.out.println(num1+"%"+num2+"="+(num1%num2));
		
	
	}
		
	

}
