package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	private ArrayList<Sale<String,Integer>> product = new ArrayList<>();
	private ArrayList<Sale<String,Integer>> order = new ArrayList<Sale<String,Integer>>();
	
	public void add(Scanner scan) {
		System.out.println("제품명 : ");
		String menu = scan.next();
		System.out.println("가격 : ");
		int price = scan.nextInt();
		Sale s = new Sale(menu, price);
		product.add(s);
	}
	
	public void printProduct() {
		System.out.println("----Menu-----");
		int index = 1;
		for(int i=0; i<product.size();i++){
			System.out.println(index+". "+product.get(i));
			index++;
		}
		System.out.println("-------------------");
	}
	
	public void orderPick(Scanner scan) {
		int index = -1;
		System.out.println("주문 메뉴 : ");
		String orderMenu = scan.next();
		System.out.println("주문 수량 : ");
		int orderCount = scan.nextInt();
		for(int i=0; i<product.size(); i++) {
			if(product.get(i).getMenu().equals(orderMenu)) {
				index = i;
				int price = (Integer)product.get(i).getPrice();  //int  Integer은 자동 변환이 가능하지만 형변환할 때 써주면 좋음
				Sale s  = new Sale(orderMenu,orderCount*price);
				order.add(s);
			}
		}
		if(index == -1) {
			System.out.println("찾는 메뉴가 없습니다.");
		}
	}
	
	public void printOrder() {
		int sum = 0;
		//	System.out.println(order);
		for(Sale s : order) {
			sum = sum+(Integer)s.getPrice();
		}
		System.out.println("지불하실 총금액 : "+sum);
	}
		
	public void printMenu() {
		System.out.println(">>>>>Sale Menu<<<<<<");
		System.out.println("1. 메뉴추가");
		System.out.println("2. 메뉴판출력");
		System.out.println("3. 메뉴주문");
		System.out.println("4. 메뉴주문내역");
		System.out.println("5. 프로그램종료");
		System.out.println("Sale Menu 입력 : ");		
	}

	
}
