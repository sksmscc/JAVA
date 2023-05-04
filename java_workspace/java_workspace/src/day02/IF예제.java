package day02;

import java.util.Scanner;

public class IF예제 {

	public static void main(String[] args) {
		/* 정수를 입력받아서 정수가 짝수인지 홀수 인지 판단하여 출력.
		 */
		Scanner scan = new Scanner(System.in); // 단축키 : ctrl+shift+o

		System.out.println("값을 입력해 주세요.");

		int num1 = scan.nextInt();

		if (num1 % 2 == 0) {
			System.out.println(num1 + "짝수입니다.");
		} else {
			System.out.println(num1 + "홀수입니다.");
		}

		scan.close();

	}

}
