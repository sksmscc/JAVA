package Prouduct;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ProductManager {

	/*
	 * 3. ProductManager => 메뉴 등록리스트, 주문리스트 - 메뉴추가기능 - 메뉴리스트 출력 - 제품 주문 - 주문내역 출력
	 */

	private HashMap<String, Integer> insertMenu = new HashMap<String, Integer>();
	private HashMap<String, Integer> orderMenu = new HashMap<String, Integer>();
	private HashMap<String, Integer> orderBuy = new HashMap<String, Integer>();
//	private ArrayList<Product> menu =  new ArrayList<>();
	

	// 메뉴추가기능
	public void insertMenu(Scanner scan) {
//		menu.add(new Product("가방",2000));
//		menu.get(0).getMenuName();
		System.out.println("메뉴명과 가격을 입력해 주세요.");
//		while(insertMenu.size()<size) {
		System.out.println("메뉴명 입력 : ");
		String menuName = scan.next();
		System.out.println("가격 입력 : ");
		int price = scan.nextInt();

		insertMenu.put(menuName, price);
//		}
	}

	// 메뉴리스트 출력
	public void printMenuList() {
		if (insertMenu.size() == 0) {
			System.out.println("-------------------------------------");
			System.out.println("메뉴 리스트가 없습니다.");
			System.out.println("메뉴를 추가해 주세요.");
			System.out.println("-------------------------------------");
		} else {
			Iterator<String> it = insertMenu.keySet().iterator();
			System.out.println("--------------Menu List--------------");
			while (it.hasNext()) {
				String menuKey = it.next();
				int price = insertMenu.get(menuKey);
				System.out.println("메뉴명 : " + menuKey + "(" + price + "원)");
			}
			System.out.println("-------------------------------------");
		}
	}

	// 제품 주문
	public void orderpick(Scanner scan) {
		System.out.println("주문할 메뉴 입력 : ");
		String orderMenuName = scan.next();
		System.out.println("메뉴 수량 입력 : ");
		String orderMenuCount = scan.next();
		int index = -1;
		for (int i = 0; i < insertMenu.size(); i++) {
			Iterator<String> it = insertMenu.keySet().iterator();
			while (it.hasNext()) {
				String menuKey = it.next();
				int price = insertMenu.get(menuKey);
				orderMenu.put(menuKey, price);
				//orderBuy.put(orderMenuCount, Integer.parseInt(orderMenuCount)*orderMenu.get(orderMenu));
				if (orderMenuName.equals(menuKey)) {
					index++;
				} 
			}
//			Iterator<String> it2 = orderBuy.keySet().iterator();
//			while (it.hasNext()) {
//				String total = it.next();
//				orderBuy.put(orderMenuCount,Integer.parseInt(orderMenuCount)*orderMenu.get(orderMenu));
//			}
			}
		if (index != -1) {
			System.out.println("-------------------------------------");
			System.out.println(orderMenuName + " " + orderMenuCount + "개를 주문 리스트에 넣었습니다.");
			System.out.println("-------------------------------------");
		} else {
			System.out.println("메뉴리스트에 주문할 제품이 없습니다.");
			System.out.println("메뉴리스트에 있는 제품을 선택해 주세요.");
		}
	}

	// 제품 주문 리스트 출력
	public void printOrderList() {
		int index = -1;
		if (orderMenu.size() == 0) {
			System.out.println("-------------------------------------");
			System.out.println("주문메뉴가 없습니다.");
			System.out.println("메뉴를 주문해 주세요");
			System.out.println("-------------------------------------");
		} else {
			Iterator<String> it = orderMenu.keySet().iterator();
			System.out.println("------------Order Menu List-----------");
			while (it.hasNext()) {
				String menuKey = it.next();
				int price = orderMenu.get(menuKey);
				System.out.println("메뉴명 : " + menuKey + "(" + price + "원)");
				for(int i=0; i<orderBuy.size(); i++) {
					if(orderMenu[i]==orderBuy[i]) {
						System.out.println(orderMenu+"개 "+"합계 : "+orderMenu.get(orderBuy));
					}
				}
//				Iterator<String> it2 = orderBuy.keySet().iterator();
//				while(it.hasNext()) {
//					int i = orderMenu.get(it2.next());
//				System.out.println(orderMenu+"개 "+"합계 : "+orderMenu.get(orderBuy));
				}
			}
			System.out.println("--------------------------------------");
		}
	
//	public void Order(int price, int count) {
//		Iterator<String> it = orderMenu.keySet().iterator();
//		while(it.hasNext()) {
//			int i = orderMenu.get(it.next());
//			total=total*count;
//		}
//		System.out.println(count+"개 "+"합계 : "+total);
//	}

}
