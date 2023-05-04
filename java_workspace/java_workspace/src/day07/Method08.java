package day07;

import java.util.Scanner;

public class Method08 {
     static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 배열이 주어졌을 때 배열을 출력하는 메서드 생성
		 * 
		 */
		int arr[] = new int[] {1,2,3,4,5,6,7,8,2,11,16,15,6,10,13,14};
		printArray(arr);
		System.out.println();
		for(int tmp : sortArray(arr)) {
			System.out.println(tmp+" ");
		}
		

	}
	/* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : printArray
	 * 옆으로 출력 / 5개씩 한줄에 나열
	 */
	public static void printArray(int arr[]) {
		int cnt = 0 ; 
		for(int i=0; i<arr.length;i++) {
		System.out.println(arr[i]+" ");
			   cnt++;
			   if(cnt % 5 ==0 ) {
				   System.out.println();
		   }
		}
		System.out.println("----랜덤----");
		int nums = scan.nextInt();
		printArray(randomArray(nums));
		
		
	}
		
	/* 기능 : 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : sortArray
	 */
	public static int[] sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					}
			}
			System.out.println(arr[i]+" ");
		}
		return arr;
	}
	
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위(1~100까지)
	 * 매개변수 : 사이즈를 매개변수로 받아서 => int size
	 * 리턴타입 : 배열 => int[]
	 * 메스드명 : randomArray
	 */
	public static int[] randomArray(int nums) {
		int ran[] = new int[nums];
		for(int i=0; i<ran.length; i++) {
			ran[i] = (int)(Math.random()*100)+1;	
		}
		return ran;
	}
	

}
