package day06;

public class Method05 {

	public static void main(String[] args) {
		/* 2~100까지의 소수를 출력
		 */ 
		/* 2~!00까지 for문을 돌려서 isPrime 호출 후 true라면 출력 
		 */
		int num = 0;
		int cnt = 0;
		int sum = 0;
		for(num = 2; num<=100; num++) { 
			if(isPrime(num)){  //true   //false
				System.out.print(num+ " ");
				sum = sum + num;
			}
		}
		        System.out.println();
				System.out.println("---소수의 합계---");
				System.out.println(sum+" ");
			
				/*이것도 가능!
			 * if(isPrime(num)== true){  
				System.out.println(num+" ");
			}
			*/			
	
	}	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판멸(true / false)
	 * 소수 : 1과 자기자신만을 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : 숫자 => int num
	 * 메서드명: isPrime      //메서드명에 is가 들어가면 판별하는 것을 물어보는 걸로 사용함. 
	 */
	
	public static boolean isPrime(int num) {  //조건이 없으면 (returm false;) 써준다. 조건이 없기 떄문에.
		 int cnt = 0;  //개수
			 for(int i=1; i<=num; i++) {
				 if(num % i == 0) {
					 cnt++;  //약수의 개수
				 }
			 }
			 if(cnt == 2) {      //cnt가 2개여야 함.
				 return true;
			 } else {         // 쓰지 않아도 false라고 나옴.
				 return false;

		 }
	}
	
	

}
