package day01;

import java.util.Scanner;

public class IF문3_1 {

	public static void main(String[] args) {
		// Scanner 클래스 사용.
		// 값을 입력받을 때 사용하는 클래스
		Scanner scan = new Scanner(System.in);
		// scan - 임의로 입력 받은 값

		// 국어, 영어, 수학의 값을 입력받아 합계, 평균을 구하고 A,B,C,D,F 등급을 구하시오.

		// 입력유도 안내문자
		System.out.println("국어점수를 입력해주세요. (0~100) : 국어, 영어, 수학 순으로");

		// 지역변수는 무조건 초기화가 되어야 함.
		int a = 0, b = 0, c = 0;
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();

		if (kor < 0 || kor > 100) {
			System.out.println("국어점수 오류.");
		}

		if (eng < 0 || eng > 100) {
			System.out.println("영어점수 오류.");
		}

		if (math < 0 || math > 100) {
			System.out.println("수학점수 오류.");
		}

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

		char ch = 'F'; // F를 넣지 않으면 Error! (F를 설정한 이유는 초기값! - 기본값) 초기값을 설정하지 않으면 Error!
		if (avg > 100 || avg < 0) {
			System.out.println("평균 계산 오류.");
		} else if (avg >= 90) {
			ch = 'A';
		} else if (avg >= 80) {
			ch = 'B';
		} else if (avg >= 70) {
			ch = 'C';
		} else if (avg >= 60) {
			ch = 'D';
		} else {
			ch = 'F';
		}

		System.out.println("등급  :" + ch);

		// 합, 평균 미출력
		scan.close();

	}

}
