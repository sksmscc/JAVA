package day13;

import java.util.HashMap;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 출력, 합계, 평균 출력
		 * 종료 키워드가 나올때까지 반복(0)
		 * 과목과 점수를 입력해 주세요.
		 * 국어 : 89
		 * 수학 : 97
		 * 0 종료
		 * 입력받은 map 출력 후  합계 : 평균 : 
		 */
		
		HashMap<String, Integer> calc = new HashMap<String, Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		
		System.out.println("과목과 점수를 넣어주세요.");
		while(true) {
			System.out.println("0 선택 -> 프로그램 종료");
			System.out.println("과목 입력 : ");
			String subject = scan.next();
			if(subject.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("점수 입력 : ");
			Integer score = scan.nextInt();
			
			if(score==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			calc.put(subject, score);
			cnt++;
		}
		
		for(String tmp : calc.keySet()) {
			System.out.println(tmp+" : "+calc.get(tmp));
		}
		System.out.println();
		
	
		int sum=0;
		for(String tmp : calc.keySet()) {
			sum += calc.get(tmp);
		}System.out.println("과목의 합계 :"+sum);
		
		
		double avg =0;
		avg=(double)sum/cnt;
		System.out.println("과목의 평균 : "+ avg);
		
		
		
	}

}