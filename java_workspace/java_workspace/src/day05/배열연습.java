package day05;

import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아 배열에 저장하고,
		 * 점수의 합계, 평균, 최대, 최소값을 출력
		 */
		
		//1. 스캐너 열기
		Scanner scan = new Scanner(System.in);
		//2. 배열 선언, 변수들 선언
		int size = 5;
		int arr[] = new int[size];
		int sum =0;
		double avg =0;
		int max = 0;
		int min = 100;
		//3. for문을 사용하여 배열안을 탐색 index 번지에 값을 저장
		System.out.println("5명의 점수를 입력해 주세요. (1~100)");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			//4. 합계, 평균, 최대, 최소의 값을 구하기.
			sum = arr[i]+sum;
			//max = Math.max(max.arr[i]);
			//min = Math.min(min.arr[i]);
			//(이렇게 써도 됌 ↑ 밑에거 생략하고!)
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		
		}
		avg = (double)sum/arr.length;	
		
		//5. 출력
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		scan.close();

	}

}
