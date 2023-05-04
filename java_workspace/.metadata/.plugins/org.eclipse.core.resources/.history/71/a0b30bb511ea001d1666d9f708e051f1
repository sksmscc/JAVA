package Prouduct;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		/* 4. Main 메뉴를 이용하여 출력
		 *   1.제품추가(메뉴추가) void add
		 *   2.제품리스트보기(메뉴판출력) void printProduct()
		 *   3.제품주문(제품명,수량) => void orderPick(String name, int count)
		 *   4.주문내역(제품리스트 출력) =>void printOrder()
		 *   5.프로그램종료
		 */
		
		ProductManager productManager = new ProductManager();
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println(">>>>>Product Menu<<<<<<");
			System.out.println("1. 메뉴추가");
			System.out.println("2. 메뉴판출력");
			System.out.println("3. 메뉴주문");
			System.out.println("4. 메뉴주문내역");
			System.out.println("5. 프로그램종료");
			System.out.println("Product Menu 입력 : ");
			
			menu = scan.nextInt();
			
		switch (menu) {
		case 1 :
			productManager.insertMenu(scan);
			break;
		case 2 :
			productManager.printMenuList();
			break;	
		case 3 :
			productManager.orderpick(scan);
			break;
		case 4 :
			productManager.printOrderList();
			break;
		case 5 :
			break;
		default:
			System.out.println("1-5의 메뉴를 선택해 주세요.");
		}	
		
		}while(menu!=5);
		System.out.println("프로그램을 종료합니다.");
		 
		scan.close();
	}

}
