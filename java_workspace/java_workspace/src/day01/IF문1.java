package day01;

public class IF문1 {

	public static void main(String[] args) {
		/* 조건문 : 주어진 조건에 맞을 경우 실행문을 처리하는 구문 
		 * if / switch문 
		 * if문 : if, if~else, if~else if
		 * 
		 * [조건식에는 세미콜론이 붙지 않음!]
		 * if(조건식){ 
		 * 실행문; 
		 * } 
		 * 실행문이 하나일 경우 {} 생략가능.(왠만하면 생략하지 않기!)
		 */
		/* num1의 값을 주고, num1이 0이면 "num1은 0입니다."라고 출력
		 */
		int num1 = -9;
		if (num1 == 0) {
			System.out.println("num1은 0입니다.");
		}

		/* num1의 값을 주고, num1이 0이 아니면 "num1은 0이 아닙니다."라고 출력 
		 * != 같지 않다. == 같다
		 */
		if (num1 != 0) {
			System.out.println("num1은 0이 아닙니다.");
		}

		/* num1이 0이면 0입니다.라고 출력, 0이 아니면 0이 아닙니다라고 출력
		 */
		if (num1 == 0) {
			System.out.println("num1은 0입니다.");
		} else if (num1 != 0) {
			System.out.println("num1은 0이 아닙니다.");
		} else {
		}

		/* num1이 양수이면 양수라고 출력 (0을 포함하지 않는 경우 > ) 
		 * num1이 0이면 0이라고 출력 아니면 음수라고 출력
		 */

		if (num1 > 0) {
			System.out.println("양수");
		} else if (num1 == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}

		/* num2가 짝수인지 홀수인지 판별 나머지 (num2%2) 
		 * num2가 짝수이면 "짝수", 아니면 "홀수" 출력
		 */

		int num2 = 4;
		if (num2 % 2 == 0) { // (조건식)은 반드시 true / false 로 표현되어야 함. 
			// else에 있는 중가로는 띄어쓰기해도 상관없음.
			System.out.println(num2 + " : 짝수~!!");
		} else {
			System.out.println(num2 + " : 홀수~!!");
		}

	}

}
