package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 1.단어 추가
 * 2.단어 출력
 * 
 */

import day03.Continue문;

public class EnglishDictionary {
	/* 
	 * 
	 */
}

class Word {
	// hello : 안녕, 아침인사, 반가움, 비슷한 말 hi
	private Map<String, ArrayList<String>> word = new HashMap<String, ArrayList<String>>();
	/*
	 * y를 입력하면 단어를 입력, n을 입력하면 종료 단어가 이미 있다면 '등록되어 있는 단어입니다.' 등록 금지 메서드명 : makeWord
	 */

	public void printMenu() {
		System.out.println(">>Word Menu<<");
		System.out.println("1. 단어추가");
		System.out.println("2. 단어출력");
		System.out.println("3. 프로그램 종료");
		System.out.println("--------------");
	}

	public void makeWord(Scanner scan) {
		while (true) {
			System.out.println("단어 입력 : ");
			String addWord = scan.next();
			if (word.containsKey(addWord)) {
				System.out.println("등록 되어 있는 단어입니다.");
				break;
			} else {
				ArrayList<String> meanList = new ArrayList<String>();
				while (true) {
					System.out.println("단어의 의미를 더 추가하시겠습니까? (Y : 네 | N : 아니요)");
					String add = scan.next();
					if ("Y".equals(add)) {
						System.out.println("단어 의미 : ");
						String mean1 = scan.next();
						meanList.add(mean1);
					} else if (add.equals("N")) {
						System.out.println("단어가 추가 되었습니다.");
						break;
					} else {
						System.out.println("잘못 선택하셨습니다. (Y | N : 선택)");
					}
				}
				word.put(addWord, meanList);
			}
			System.out.println("단어를 추가 하시겠습니까? (Y : 네 | N : 아니요)");
			char choose = scan.next().charAt(0);
			while (choose != 'Y' && choose != 'N') {
				System.out.println("잘못 선택하셨습니다. (Y | N : 선택)");
				choose = scan.next().charAt(0);
			}
			if (choose == 'Y') {
				continue;
			} else if (choose == 'N') {
				System.out.println("단어 추가를 종료합니다.");
				return;
			}
		}
	}

	public void printWord() {
		System.out.println("<<Word Dictionary>>");
		for (String tmp : word.keySet()) {
			System.out.print(tmp + " : ");
			for (int i = 0; i < word.get(tmp).size(); i++) {
				System.out.print(word.get(tmp).get(i) + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------");
	}

}