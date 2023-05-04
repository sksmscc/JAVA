package day10;

import java.util.Scanner;

public class Product_main {

	public static void main(String[] args) {
		/* ProductMain
		 * product 배열 생성 [10]
		 * 
		 * 상품등록 후 리스트 출력
		 * 
		 * 스케너를 통해서 상품 등록.
		 * 상품을 등록하시겠습니까? (y/n) 
		 * y => 상품등록 반복 /  n=> 그만
		 * 상품이름과 가격을 등록받아 상품 배열에 등록.
		 * 
		 * n => 등록된 제품 리스트 출력 
		 */
		
		 Product[] p = new Product[10];
		 Scanner scan = new Scanner(System.in);

		char ch;
		String name;
		int price;
		int cnt = 0; //p객체의 index 핸들링하기 위한 변수
		int sum = 0;
		
		while (true) {
			System.out.println("상품을 등록하시겠습니까? (y/n): ");
			ch = scan.next().charAt(0);
			if(ch == 'Y' || ch == 'y') {
				Product pro = new Product();
				System.out.print("상품명을 입력해 주세요. : ");
				name = scan.next();
				System.out.print("상품가격을 입력해 주세요. : ");
				price = scan.nextInt();
				pro.insertProduct(name, price);
				p[cnt]=pro;
				cnt++;
				} else if (ch == 'n' || ch == 'N') {
					System.out.println("상품등록을 종료하였습니다.");
					break;			
				}
		}
		for(int i=0; i<cnt; i++) {
			p[i].print();
			sum = sum + p[i].getprice();
		}
		System.out.println("총합계 : "+sum);
		
		scan.close();
		
		
		/* [선생님 정답]
		 * while(menu != 'n') {
		 *   system.cou.println("상품을 등록하시겠습니까?  (y/n)");
		 *   ch = scan.next().charAt(0);
		 *   
		 *   if(ch == 'y') {
		 *    system.out.println(상품명 >);
		 *    String name = scan.next();
		 *    
		 *    system.out.println(가격 >);
		 *    int price = scan.nextInt();
		 *    //생성자를 이용하여 객체 생성 후 배열에 객체 담기
		 *    product tmp = new Product(name, price);
		 *    p[cnt] = new Product();
		 * //insertProduct 메서드를 활용하여 객체 생성 후 등록
		 * p[cnt] = new Product();
		 * p[cnt].insert(name,price);
		 * cnt++;  //index 증가
		 * sum = sum + price;
		 * }else {
		 * if(ch =='n') {
		 * system.out.println("상품등록 종료");
		 *    }else {
		 *    system.out.println("y/n만 가능합니다. ");
		 * }
		 * }
		 * system.out.println("--상품등록 리스트--")
		 * for(int i=0; i<cnt;i++){
		 * //toString 사용한 경우
		 *   system.out.println((i+1)+"번째 상품 : "+p[i]);
		 *   
		 *  //메서드 사용한 경우
		 *  //p[i].출력 메서드명
		 *  }
		 *  system.out.println(cnt+"개의 상품 총 합계 :"+sum+"원");
		 */
		
	

	}

}
