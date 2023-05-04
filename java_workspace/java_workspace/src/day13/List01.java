package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 */
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("기상");
		list.add("씻기");
		list.add("아침식사");
		list.add("학원가기");
		list.add("저녁식사");
		list.add("자유시간");
		list.add("취침");
		
		//방법 3가지
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------");
		for(String tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("----------");
		Iterator<String> it =list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp+" ");
		}
		
		Collections.sort(list);
		System.out.println(list);

		list.sort(new Test());
		System.out.println(list);
		
		
	}

}

 class Test implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) { //내림차순
		//compareTo 메서드 사용
		return o2.compareTo(o1);  //o2,o1 순서만 바꿔주면 오름차순, 내림차순이 나온다.
	}
	 
	 
	 
	 
 }