package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class MapEx02 {
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private int sum = 0;
	
	Scanner scan = new Scanner(System.in);
	
	//입력메서드
	public void make(int size) {
		while(map.size()<size) {
			System.out.println("상품명 입력 : ");
			String name = scan.next();
			System.out.println("상품 가격 입력 : ");
			int price = scan.nextInt();
			
			map.put(name, price);
		}
	}
	
	//출력메서드
	public void print() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			int price = map.get(key);
			System.out.println(key+" : "+price);
		}
		
	}
	
	//총합계메서드
	public void total() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			int price = map.get(it.next());
			sum += price;
		}
		System.out.println("총합계 : "+sum);
	}
	
	
	

	public static void main(String[] args) {
		// map에 상품명과 가격을 입력받고, 출력 
		// 총 지불가격 출력
		// 입력-> 메서드로, 출력 -> 메서드로 구현
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		MapEx02 ex = new MapEx02();
		
		ex.make(1);
		ex.print();
		ex.total();

	}
	
	

}
