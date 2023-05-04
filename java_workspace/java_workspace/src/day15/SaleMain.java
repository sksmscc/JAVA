package day15;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SaleManager sm = new SaleManager();
		int menu = -1;
		do {
			sm.printMenu();
			menu = scan.nextInt();
			
			switch (menu) {
			case 1 : sm.add(scan); break;
			case 2 : sm.printProduct(); break;
			case 3 : sm.orderPick(scan); break;
			case 4 : sm.printOrder(); break;
			case 5 : break;			
			default:
				System.out.println("찾으시는 메뉴가 없습니다. (1-5 입력)");
			}
					
			
		}while(menu!=5);
		
	}

}
