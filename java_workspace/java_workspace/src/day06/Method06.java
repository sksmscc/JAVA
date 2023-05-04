package day06;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 구구단 1단을 출력하는 메서드
		 * 7단
		 */
		//입력해서 출력하는 방법
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		int num = scan.nextInt();
		gugudan(num);
		System.out.println("-----------");
		gugudan(7);		
		
		scan.close();
		
	}
	/* 구구단 출력
	 * 매개변수 : 단 => int num
	 * 리턴 : void
	 * 메서드명 : gugudan
	 */
	
	public static void gugudan(int num) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d\n",num,i,(num*i));	
		}
		
	
	}

}
