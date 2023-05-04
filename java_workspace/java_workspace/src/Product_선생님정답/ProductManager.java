package Product_선생님정답;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductInterface {
	private ArrayList<Product> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();
	
	public void addMenu() {
		menu.add(new Product("햄버거",15000));
		menu.add(new Product("피자",20000));
		menu.add(new Product("음료",2000));
		menu.add(new Product("과자",1000));
		menu.add(new Product("사탕",500));
	}
	
	@Override
	public void add(Scanner scan) {
		System.out.println("추가할 메뉴를 입력하세요.");
		String menu = scan.next();
		System.out.println("메뉴의 가격을 입력하세요.");
		int price = scan.nextInt();
		this.menu.add(new Product(menu, price));
	}
	@Override
	public void printProduct() {
		System.out.println("----menu----");
		for(Product p : menu) {
			System.out.println(p);  //Product 클래스의 toString호출
			//method로 print를 만들어 놓은 경우
			//p.메서드명();
		}
		System.out.println("------------");
		
	}
	@Override
	public void orderPick(String name, int count) {  //메뉴명, 개수
		//매개변수로 입력받을 경우 scan으로 입력받으면 됨.
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				int price= menu.get(i).getPrice();
				Order order = new Order();
				order.setMenu(name);
				order.setPrice(price);
				order.setCount(count);
				order.setTotal(price*count);
				this.order.add(order);
			}
		}
		
	}
	@Override
	public void printOrder() {
		int sum = 0;
		System.out.println("----주문내역----");
		for(int i=0; i<order.size(); i++) {
			order.get(i).print();
			sum += order.get(i).getTotal();
		}
		System.out.println("--------------");
		System.out.println("지불하실 총 금액 :"+sum);
		
		
	}

	@Override
	public void delect(Scanner scan) {
		System.out.println("삭제할 메뉴 입력 : ");
		String delectMenu = scan.next();
		//menu List에서 menu를 찾아서 remove
		//remove(index), remove(Object)
		int index = -1;
		for(int i=0; i<menu.size(); i++) {
			if(delectMenu.equals(menu.get(i).getMenu())) {
				index = i; //메뉴의 위치 추출 
				menu.remove(i); //index로 삭제
				//menu.remove(menu.get(i));  //Object로 삭제
				System.out.println(delectMenu+"메뉴가 삭제 되었습니다.");
				return;
			}
		}
		if(index == -1) {
			System.out.println(delectMenu+"는 없는 메뉴입니다.");	
		}
	}	
		

	@Override
	public void update(Scanner scan) {
		System.out.println("수정할 메뉴 입력 : ");
		String modifyMenu = scan.next();
		System.out.println("수정할 메뉴의 가격 입력 : ");
		int modifyPrice = scan.nextInt();
		int index = -1;
		for(int i=0; i<menu.size(); i++) {
			if(modifyMenu.equals(menu.get(i).getMenu())) {
			    index = i;  //index가 바뀌었는지 확인.
				menu.get(i).setPrice(modifyPrice);
				System.out.println(modifyMenu+"메뉴의 가격을 "+modifyPrice+"로 수정하였습니다.");
				return;
			}	
		}
		if(index == -1) {
			System.out.println(modifyMenu+" 메뉴가 없습니다.");
		}
		
	}
	
	
}

