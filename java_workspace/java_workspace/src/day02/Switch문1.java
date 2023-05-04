package day02;

public class Switch문1 {

	public static void main(String[] args) {
		// Switch : 값을 케이스마다 분리해서 실행시켜주는 조건문
		/* Switch(변수/식) { 
		 * case 값1: 
		 * 실행문; 
		 * break; 
		 * case 값2: 
		 * 실행문; 
		 * break; 
		 * ... 
		 * default : 
		 * 실행문;
		 * break; 
		 * }
		 * */

		int num = 0;

		switch (num) {
		case 1:
			System.out.println("num는 1입니다.");
			break; // break가 없으면 다 처리되어 콘솔에 나옴.
		case 2:
			System.out.println("num는 2입니다.");
			break;
		case 3:
			System.out.println("num는 3입니다.");
			break;
		default:
			System.out.println("num는 1,2,3이 아닙니다.");
		}

	}

}
