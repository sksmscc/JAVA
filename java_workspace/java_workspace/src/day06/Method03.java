package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는  + - *  /  %   를 작성하여 출력
		 * 두 수를 입력받아서 연산. 연산자를 입력받아 메서드를 활용하여 연산
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("두 개의 수를 입력해 주세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해 주세요");
		String str = scan.next();
		
		int a = sum(num1,num2);
		int b = sub(num1,num2);
		int c = mul(num1,num2);
		int d = div(num1,num2);
		int e = rem(num1,num2);
		
		switch(str) {
		case "+" : 
			System.out.println(a);
			break;
		case "-" :
			System.out.println(b);
			break;
		case "*" :
			System.out.println(c);
			break;
		case "/" :
			System.out.println(d);
			break;
		case "%" :
			System.out.println(e);
			break;
			default:
				break;
		}
		
		
		

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	public static int rem(int a, int b) {
		return a%b;
	}
	
	
	

}
