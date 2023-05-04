package day11;

public class Customer_Main {

	public static void main(String[] args) {
		Customer[] customerList = new Customer[10];
		
		//업캐스팅 => 묵시적인 형변환이 가능
		Customer c = new Customer(100,"홍길동");
		Customer gHong = new GoldCustomer(10002,"홍길순");
		Customer t = new VIP(10002,"초록이");
        
		//다운캐스팅 => 반드시 명시적으로 형변환 해야함.
		//instanceof : 원래 인스턴스의 형이 맞는 여부를 체크 맞으면 true/false
		if(t instanceof VIP) {
			Customer vCustomer = (VIP)t;
//			System.out.println(vCustomer.getCounselor());
		}else if(t instanceof GoldCustomer) {
			GoldCustomer vCustomer = (GoldCustomer)t;
		}else {
			System.out.println("error");
		}
		
		int cnt = 0;
	    customerList[cnt] = c;
	    cnt++;
	    customerList[cnt] = gHong;
	    cnt++;
	    customerList[cnt] = t;
	    cnt++;
	    
	    System.out.println("---고객 정보 출력---");
	    //for문을 활용해서 고객정보 출력
	    for(int i=0; i<cnt; i++) {
	    	customerList[i].customerInfo();
	    }
	    System.out.println("---할인율과 포인트 계산---");
		int price = 1000000;
		//for문을 활용하여 할인율과 포인트 계산 내역 출력
		for(int i=0; i<price; i++ ) {
			System.out.println(customerList[i].getCustomerName()+"님이 지불하실 금액은 "+customerList[i].calcPrice(price)+"원입니다");
			System.out.println(customerList[i].getCustomerName()+"님의 현재 보너스 포인트는 "+customerList[i].bonusPoint+"점 입니다.");
		}
	   
	    
//		c.calcPrice(100000);
//		c.customerInfo();
//		c.calcPrice(100000000);
//		c.customerInfo();
//		
		//다운캐스팅을 통해 접근할 수 있다.
//		System.out.println(vCustomer.saleRatio());
		
//		System.out.println("------할인율과 포인트 계산------");
//        int price = 10000;
//        int cost = c.calcPrice(price);
//	    System.out.println(c.getCustomerName()+"님이 지불하실 금액은"+ cost+"원입니다.");
//	    System.out.println(c.getCustomerName()+"님의 현재 포인트는 "+c.bonusPoint+"점 입니다.");
//	    int cost1 = gHong.calcPrice(price);
//	    System.out.println(gHong.getCustomerName()+"님이 지불하실 금액은"+ cost1+"원입니다.");
//	    System.out.println(gHong.getCustomerName()+"님의 현재 포인트는 "+gHong.bonusPoint+"점 입니다.");
//	    int cost2 = t.calcPrice(price);
//	    System.out.println(t.getCustomerName()+"님이 지불하실 금액은"+ cost2+"원입니다.");
//	    System.out.println(t.getCustomerName()+"님의 현재 포인트는 "+t.bonusPoint+"점 입니다.");
//	    t.customerInfo();
	}

}
