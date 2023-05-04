package day02;

public class For문2 {

	public static void main(String[] args) {
		/*2단 출력 2*1 = 2, 2*2 = 4, 2*3 = 6 ... 2*9=18
		 */
		int num = 2;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

		/*1~10까지의 홀수의 합, 짝수의 합을 출력
		 */
		int sum = 0;
		int sum1 = 0;
		// int sum = 0; sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // 짝수의 조건
				// 짝수의 합계
				sum = sum + i;
			} else {
				// 홀수의 합계
				sum1 = sum1 + i;
			}
		}
		System.out.println("짝수 합계 : " + sum);
		System.out.println("홀수 합계 : " + sum1);

		/* 2중 for문
		 * 2단, 3단, 4단, 5단, ... 9단
		 * 2*1, 2*2, 2*3 ... *9
		 * 2단 1~9, 3단 1~9 ...
		 */
		for (int i = 2; i <= 9; i++) { // i=2 p=1,2,3,4,5,... 9
			// System.out.println(i + "단");
			for (int p = 1; p <= 9; p++) { // i =3 p = 1,2,3,4,5, ... 9
				System.out.println(i + "*" + p + "=" + (i * p));
			}
		}

		/* 2 * 1 = 2 3 * 1 = 2 ~ 9 * 1 = 9 ... 2 * 9 = 18 3 * 9 = 18 ~ 9 * 9 = 81
		 */
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int k = 2; k <= 9; k++) {
				System.out.printf("%d * %d = %d\t", i, k, (i * k));
			}
		}
		System.out.println();

	}

}
