package day16;

import java.util.ArrayList;

public class StreamEx {

	public static void main(String[] args) {
	/* 문자열(이름)을 담는 리스트 생성후, 스트림으로 생성
	 * 정렬하여 출력
	 */
	
	ArrayList<String> name = new ArrayList<String>();
	name.add("홍길동");
	name.add("홍길순");
	name.add("김지환");
	name.add("tomas");
	name.add("edward");
	
	name.stream().sorted().forEach(System.out::println);;
	System.out.println("-------------");
	
	//글자수가 5글자 이상인 이름만 출력
	name.stream().sorted().filter(n->n.length()>=5).forEach(System.out::println);  // ☆많이 사용하는 방법☆
	System.out.println("-------------");
	
	//각자 이름의 글자수를 출력
	System.out.println("<<name의 이름 글자수>>");
	name.stream().mapToInt(n->n.length()).forEach(System.out::println);
	System.out.println("-------------");
	
	
	
	
	}
}
