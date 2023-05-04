package day14;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Random;

public class Set02 {

	public static void main(String[] args) {
		//로또번호 출력 : Set
		//random으로 생성 1~45까지 중 6개

		//Math 클래스에서 제공하는 random메서드 사용
		int a = (int)(Math.random()*45)+1;
		
		//Random 클래스 사용하는 방법
		int b = new Random().nextInt(45)+1;
		
		TreeSet<Integer> set = new TreeSet<Integer>();
	
		int size = 0;
		
		for(int i=0; i>=0; i++) {
			set.add(b);
			if(set.size()==6) {
				break;
			}
		} 
		 System.out.println(set);
		System.out.println(set.first());  //맨앞에 있는 거 빼기
		System.out.println(set.pollFirst());  //첫 번째꺼 꺼내고 값을 지움
		System.out.println(set.last());   //맨 뒤에 있는 거 빼기
		
		
		
		
	}

}
