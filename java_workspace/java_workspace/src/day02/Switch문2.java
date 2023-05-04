package day02;

public class Switch문2 {

	public static void main(String[] args) {
		/* 주사위의 값을 출력하는 예제 주사위는 1~6까지의 랜덤수로 결정됨.
		 */

		int num = (int) (Math.random() * 13) - 6;  // -6~-1 0 1 ~6

		System.out.println(num);

		// Switch문을 이용하여 num수만큼 전진

		/*switch (num) { 
		 * case 1 : 
		 * System.out.println("1칸 전진합니다."); 
		 * break; 
		 * case 2 :
		 * System.out.println("2칸 전진합니다.");
		 *  break; 
		 *  case 3 :
		 * System.out.println("3칸 전진합니다."); 
		 * break; 
		 * case 4 :
		 * System.out.println("4칸 전진합니다.");
		 * break; 
		 * case 5 :
		 * System.out.println("5칸 전진합니다."); 
		 * break; 
		 * default :
		 * System.out.println("6칸 전진합니다."); 
		 * break; 
		 * }
		 */

		// if문을 이용하여 랜덤수 -6~6까지 값을 출력
		// -값은 후진으로 표시, +값은 전진으로 표시
		// -는 절대값으로 표현하시오.

		if (num == 0) {
			System.out.println(num + "제자리");
		} else if (num > 0) {
			System.out.println(num + " 만큼 전진하세요.");
		} else if (num < 0) {
			System.out.println(Math.abs(num) + " 만큼 후진하세요.");
		}

	}

}
