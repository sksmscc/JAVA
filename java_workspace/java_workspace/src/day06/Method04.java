package day06;

public class Method04 {

	public static void main(String[] args) {
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균:double을 리턴)
		 * 3. 정수 5개와 평균을 출력하는 메서드
		 * 
		 * main에서는 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 */
		print(random(),avg(random()));

	}
	public static int[] random() {
		int ran[] = new int[5];
		for(int i = 0; i<ran.length; i++) {
			ran[i] = (int)(Math.random()*100)+1;
		}
		return ran;
		
	}
	public static double avg(int arr[]) {
		int sum = 0;
		double avg =0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		return avg;
		
	}
	public static void print(int arr[], double avg) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("평균 : "+avg);
		
		
		
	}

}
