package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Word> wordList =new ArrayList<Word>();
		System.out.println("입력할 단어 개수 : ");
		int size = scan.nextInt();
		
		WordManager wordManager = new WordManager();
		
		int menu = -1;
		
		wordManager.WordOld();
		
		do {
			wordManager.printMenu();
			
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: wordManager.addWord(scan); break;
			case 2: wordManager.printWord(); break;
			case 3: wordManager.wordSearch(scan);; break;
			case 4: wordManager.update(scan);; break;
			case 5: wordManager.delect(scan); break; 
			case 6: break;
			default:
				System.out.println("메뉴를 다시 선택해 주세요 (1-6 선택)");
			}
			
			
		}while(menu!=7);
		
		scan.close();
		
		

		
		
		
	}

}
