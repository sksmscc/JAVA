package day17;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		int menu = -1;
		wm.WordOld();
		do {
			wm.printMenu();
			
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: wm.insertWord(scan); break;
			case 2: wm.searchWord(scan); break;
			case 3: wm.modifyWord(scan); break;
			case 4: wm.delectWord(scan); break;
			case 5: wm.printWord(); break; 
			case 6: wm.fileWord(); break;
			case 7: break;
			default:
				System.out.println("메뉴를 다시 선택해 주세요 (1-7 선택)");
			}
		}while(menu!=7);
		System.out.println("포로그램을 종료합니다.");
		scan.close();
	}

}
