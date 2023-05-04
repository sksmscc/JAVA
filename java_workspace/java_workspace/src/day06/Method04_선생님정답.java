package day06;

public class Method04_선생님정답 {

	public static void main(String[] args) {
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균:double을 리턴)
		 * 3. 정수 5개와 평균을 출력하는 메서드
		 * 
		 * main에서는 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 */
		average();
		//int arr[] = random();
		//double avg = average(arr);
		//System.out.println("평균 : "+avg);
		//print(arr,avg(arr));
		
		//매개변수는 실제 이름과 달라도 괜찮다.
		//이름과 상관없이 값만 들어간다.
		//변수명에 크게 의미두지 않아도 됌.
		//하나의 메서드에서만 이름 정해주면 됌.
		
		System.out.println("------------------");
//    	print(random(), average(random())); //메서드를 생성할 때 랜덤값을 따로 추출하여서 결과 값이 다름.
//		print(arr, average(arr));  //위에 값과 같게 나타냄.
		
		
	}
	/* 랜덤(1~100) 정수 5개를 배열에 담는 메서드
	 * 리턴타입 : 정수배열 => int[]
	 * 매개변수 : X
	 * 메서드명 :random
	 */
	public static int[] random() {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	/* 배열을 전달 받아서 평균을 연산하는 메서드
	 * 리턴타입 : 평균 => double
	 * 매개변수 : 배열 => int arr[]
	 * 매서드명 : average
	 */
	public static void average() {
		int arr[] = random(); //위에서 만든 random 메서드 호출
		int sum = 0;
		for(int i=0;  i<arr.length; i++) {
			sum = sum+arr[i];
		}
		double avg = (double)sum / arr.length;
		//return avg;
		print(arr, avg); //프린트 호출해서 출력
	}
	/* 정수 5개와 평균을 출력하는 메서드
	 * 리턴타입 : 출력은 리턴이 없음. => void
	 * 매개변수 : 배열, 평균 => int arr[],double avg
	 * 메서드명 : print
	 */
	public static void print(int arr[], double avg) {
		System.out.println("5개의 랜덤 정수 값");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("평균 : "+avg);
	}

}
