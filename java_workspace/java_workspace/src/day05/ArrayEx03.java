package day05;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 5자리 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		 * 각 자리수 합계 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 * ex) 19874 => 47891 => 4+7+8+9+1
		 * %,/
		 * 11456 % 10 = 6 => 배열에 저장
		 * 11456 / 10 = 1145
		 */
		//1.스캐너 열기
		Scanner scan = new Scanner(System.in);
		//2.입력 받기
		System.out.println("5자리 정수를 입력해 주세요.");
		int num = scan.nextInt();  //11456
		//3. 배열 선언, 변수들 선언
		int arr[] = new int[5];
		int sum = 0, i=0;
 		//4. 반복문 이용하여 마지막 자리가 없어질 때까지 배열에 저장/ 합계
		// / % while문을 이용
		while(num>0) { //입력받은 num가 0이 되기 전까지 반복
			int b = num % 10; // 마지막 자리
			//system.out.println(b+" ");
			//system.out.println(;)
			arr[i] = b;
			sum = sum+b;
			num = num/10; //몫만 저장
			System.out.println(arr[i]+" ");
			i++;
		}
		System.out.println();
		System.out.println("sum : "+sum);
		
		
		scan.close();

/*		다른 방법
		Scanner scan = new Scanner(System.in);
		int arr1[] = new int[5];
		int a = 0;
		int sum = 0;
		
		System.out.println("5자리의 정수를 입력해 주세요. ");
		a = scan.nextInt();
		
		arr1[4]=a/10000;
		arr1[3]=(a%10000)/1000;
		arr1[2]=(a%1000)/100;
		arr1[1]=(a%100)/10;
		arr1[0]=a/10;
		
		for(int tmp : arr1) {
			sum += tmp;
			System.out.print(tmp);
		}
		
		System.out.println();
		System.out.print(sum);
		scan.close();
*/
		

		
	}

}
