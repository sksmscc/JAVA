package day12;

public class Exception03 {

	public static void main(String[] args) {
		/* 자주 발생하는 예외 코드들
		 */
		
        //ArithmeticException  : 0으로 나누었을 때 발생
//		double a = 1/0;
//		System.out.println(a);
		
//		int arr[] = new int[5];
//		for(int i=0; i<=arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		P p = new P();
		//classCastException : 클래스의 다운 캐스팅이 잘못되었을 때 (형변환 오류)
		//C c = (C)p;
		//NullPointerException : 객체가 생성되지 않는 경우
		C c = null;
		//c.print();
	}

}

 class P{
	int num = 10; 
 }
 class C extends P{
	int num1 = 100; 
	void print() {
		System.out.println(num1);
	}
 }







