package day13;

import java.util.HashMap;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 단어장 단어 : 의미 => hello : 안녕
		// 5개의 단어를 입력하고, 단어장을 출력

		Word w = new Word();
		w.print();	
		
	}

}
 class Word {
	 HashMap<String, String> map = new HashMap<String, String>();
	 
	 String str1;
	 String str2;
	 
	 public void print() {
		 Scanner scan = new Scanner(System.in);
		 for(int i = 0; i<5; i++) {
			 System.out.println("영어 단어를 입력 : ");
			 str1 = scan.next();
			 System.out.println("영어 단어 의미를 입력 : ");
			 str2 = scan.next();
			 map.put(str1, str2);
		 }
		 System.out.println("내가 입력한 단어장");
		for(String tmp : map.keySet()) {
			System.out.print(tmp+" : "+map.get(tmp)+" ");
			System.out.println();
		}
	 }
 
 
 }
 
