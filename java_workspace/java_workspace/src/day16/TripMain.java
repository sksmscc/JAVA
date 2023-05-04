package day16;

import java.util.ArrayList;

public class TripMain {

	public static void main(String[] args) {
		ArrayList<TripCustomer> trip = new ArrayList<TripCustomer>();
		trip.add(new TripCustomer("이순신",40));
		trip.add(new TripCustomer("신사임당",35));
		trip.add(new TripCustomer("이아들",10));
		
		System.out.println("<<고객명단>>");
//		trip.stream().forEach(System.out::println);
		trip.stream().forEach(n->{
			String name = n.getNameCustomer();
			int age = n.getAgeCustomer();
			int price = n.getPriceCustomer();
			System.out.println(name+" "+age+"세 비용:"+price);
		});
		System.out.println("-----------------");
		System.out.print("총비용:");
		int sum = trip.stream()
				.mapToInt(n-> n.getPriceCustomer())
				.sum();
		System.out.println(sum+"만원");
		
		
		//20세 이상 성인만 이름을 정렬하여 출력
				trip.stream()
					.filter(n->n.getAgeCustomer()>=20)
					.sorted()
					.forEach(n->{
						String name = n.getNameCustomer();
						int age = n.getAgeCustomer();
						int price = n.getPriceCustomer();
						System.out.println(name+" "+age+"세 비용:"+price);
					});
	}

}
