package day01;

import java.util.Scanner;

public class IF문3 {

	public static void main(String[] args) {
		// Scanner 클래스 사용.
		// 값을 입력받을 때 사용하는 클래스
		Scanner scan = new Scanner(System.in);

		//입력유도 안내문자
		System.out.println("국어점수를 입력해주세요. (0~100)"); //단위를 입력하여 정해주기!
	    int kor = scan.nextInt();
	    if (kor > 100 || kor < 0) {
	    	System.out.println("잘못된 값을 입력했습니다.");
	    }

	    System.out.println("영어점수를 입력해주세요. (0~100)");
	    int eng = scan.nextInt();
	    if (eng > 100 || eng < 0 ) {
	    	System.out.println("잘못된 값을 입력했습니다.");
	    }

	    System.out.println("수학점수를 입력해주세요. (0~100)");
	    int math = scan.nextInt();
	    if (math > 100 || math < 0) {
	    	System.out.println("잘못된 값을 입력했습니다.");
	    }

	    //test
	    System.out.println(kor);
	    System.out.println(eng);
	    System.out.println(math);

	    int sum = kor + eng + math;
	    double avg = sum / 3.0;

	    System.out.println("합계 : "+sum);
	    System.out.println("평균 : "+avg);
	    if (avg > 100 || avg < 0) {
	    	System.out.println("잘못된 값을 입력했습니다.");
	    }

	    if (avg >=90) {
	    	System.out.println("평가 : A");
	    } else if (avg >= 80) {
	    	System.out.println("평가 : B");
	    } else if (avg >= 70) {
	    	System.out.println("평가 : C");
	    } else if (avg >= 60) {
	    	System.out.println("평가 : D");
	    } else {
	    	System.out.println("평가 : F");
	    }


	    scan.close();
	    
	}

}
