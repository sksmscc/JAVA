package day06;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력(void)
		 * 숫자와 기호는 스캐너로 입력받기.
		 * ex) 3, * => ***
		 * ex) 5,o => oooooo
		 * ex) 7,♥ =>♥♥♥♥♥♥♥ 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int num = scan.nextInt();
		System.out.println("문자를 입력해 주세요.");
		String str = scan.next();
		
		nunja(num,str);
		
		scan.close();

	}
	public static void nunja(int num, String str) {
		for(int i=0; i<num; i++) {
				System.out.print(str);
			}
		}
		
	

}
