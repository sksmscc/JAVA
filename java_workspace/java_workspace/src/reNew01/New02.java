package reNew01;

public class New02 {

	public static void main(String[] args) {
		// for문을 이용하여 1부터 10까지출력
		
		for (int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		//1~10까지 합계 출력
		int sum = 0 ;
		
		for (int i=1; i<=10; i++) {
			sum = sum+i;
		}
		System.out.println("합계 : " + sum);
		
		
		//1~10까지 짝수합 , 홀수합 출력
		
		int sum2 = 0;
		for (int i=1; i<=10; i++) {
		if(i%2==0) {
			sum2 += i;
			}
		}
		System.out.println("짝수의 합 :"+sum2);
		
		int sum3 = 0;
		for (int i=1; i<=10; i++) {
			if(i%2==1) {
				sum3 += i;
				}
			}
			System.out.println("홀수의 합 :"+sum3);
			
		
	}

}