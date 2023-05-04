package day16;

import java.util.Scanner;

public class EnglishDictionaryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Word word = new Word();
		int menu = -1;
		
		do {
			word.printMenu();
			
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: word.makeWord(scan); break;
			case 2: word.printWord(); break;
			case 3: break;
			default: 
				System.out.println("메뉴를 잘못 입력하셨습니다. [1-3 입력]");
			}
			
			
			
		}while(menu != 3);
		System.out.println("프로그램을 종료합니다.");
		

	}

}
