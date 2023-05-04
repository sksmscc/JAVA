package day06;

import java.util.Scanner;
public class 과제_선생님정답 {
	//멤버변수의 자리
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
		int nums[] = getNums();
		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		int select = getSelect();
		//System.out.println(select);
		
		switch(select) {
		case 1 : getSumResult(nums); break;
		case 2 : getSubResult(nums); break;
		case 3 : getmulResult(nums); break;
		case 4 : getDivResult(nums); break;
		case 5 : getmodResult(nums); break;
		default :
			System.out.println("연산을 잘못 선택했습니다.");		
		}
		System.out.println("프로그램 종료.");

	}
	/* 숫자를 배열로 입력받는 메서드
	 * 매개변수 : X
	 * 리턴타입 : 배열 => int[]
	 * 매서드명 : getNum()          //선택할 때 get을 많이 씀.
    */
	public static int[] getNums() {
		int [] nums = new int[2];
		for(int i=0; i<nums.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력해 주세요.");
			nums[i] = scan.nextInt();
		}
		return nums;
	}

	
	/* 메뉴를 나타내는 메서드
	 * 매겨변수 :X
	 * 리턴타입 : 메뉴에서 선택한 값 => int
	 * 매서드명 : getSelect() 
	 */
	public static int getSelect() {
		System.out.println("원하는 계산을 선택해 주세요.");
		System.out.println("1 : 덧셈 , 2: 뺄셈 , 3 : 나눗셈 , 4 : 나눗셈, 5 : 나머지");
		int select = scan.nextInt();
		return select;
	}
	
	/* 각 기능(+ - * / %)에 대한 메서드
	 * 리턴 : void
	 * 매겨변수 : 배열
	 */
	public static void getSumResult(int nums[]) {
		int result = 0;
		for(int i=0; i<nums.length; i++) {
			result = result + nums[i];
		}
		System.out.println(nums[0]+"+"+nums[1]+"="+result);
	}
	public static void getSubResult(int nums[]) {
		int result = nums[0] - nums[1];
		System.out.println(nums[0]+"-"+nums[1]+"="+result);
	}
	public static void getmulResult(int nums[]) {
		int result = nums[0] * nums[1];
		System.out.println(nums[0]+"*"+nums[1]+"="+(nums[0]*nums[1]));
	}
	public static void getDivResult(int nums[]) {
		int result = nums[0] / nums[1];
		System.out.println(nums[0]+"/"+nums[1]+"="+(nums[0]/nums[1]));
	}
	public static void getmodResult(int nums[]) {
		int result = nums[0] % nums[1];
		System.out.println(nums[0]+"%"+nums[1]+"="+(nums[0]%nums[1]));
	}
	
}
