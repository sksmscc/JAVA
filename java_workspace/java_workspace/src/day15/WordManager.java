package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class WordManager implements WordInterface{

	private ArrayList<Word> word = new ArrayList<>();
	
	public void printMenu() {
		System.out.println("-----Word Book Menu------");
		System.out.println("1.단어추가");
		System.out.println("2.단어출력");
		System.out.println("3.단어검색");
		System.out.println("4.단어수정");
		System.out.println("5.단어삭제");
		System.out.println("6.파일로 출력");
		System.out.println("7.종료");
		System.out.println("-------------------------");
	}

	public void WordOld() {
		word.add(new Word("apple","사과"));
		word.add(new Word("car","차"));
		word.add(new Word("banana","바나나"));	
	}

	@Override
    public void addWord(Scanner scan) {
       while(true) {
            System.out.println("추가할 단어 : ");
            String word = scan.next();
            System.out.println("단어 의미 : ");
            String mean = scan.next();
            this.word.add(new Word(word, mean));
            System.out.println("단어가 추가되었습니다.");
            System.out.println("단어를 추가하시겠습니까? (Y : 네 | N : 아니요)");
            char choose = scan.next().charAt(0);
           
            //Y, N이 아닌 경우, 반복해서 입력 받음
            while(choose != 'Y' && choose != 'N') {
              System.out.println("메뉴를 잘못 선택하셨습니다. (Y | N : 선택)");
              choose = scan.next().charAt(0);
           }
            //Y가 입력된 경우
           if(choose == 'Y') {
        	   continue;  //같으면 종료하지 않고 반복 수행
           }
           //N이 입력된 경우
            else if(choose == 'N') {
               System.out.println("단어 추가를 종료합니다.");
               return; 
            }
       }
    }

	@Override
	public void printWord() {
		System.out.println("<<Word Book>>");
		for(int i=0; i<word.size(); i++) {
			System.out.println(word.get(i));
		}
		System.out.println("-----------------");
	}

	@Override
	public void wordSearch(Scanner scan) {
		System.out.println("검색할 단어 입력 : ");
		String searchWord = scan.next();
		int index = -1;
		for(int i=0; i<word.size(); i++) {
			if(searchWord.equals(word.get(i).getWord())) {
				index = i;
				System.out.println(searchWord+word.get(i).getMean());
			}
		}
		if(index == -1) {
			System.out.println(searchWord+"없는 단어입니다.");
		}
		
	}

	@Override
	public void update(Scanner scan) {
		System.out.println("수정할 단어 입력 : ");
		String updateWord = scan.next();
		System.out.println("수정할 단어 의미 입력 : ");
		String updateMean = scan.next();
		int index = -1;
		for(int i=0; i<word.size(); i++) {
			if(updateWord.equals(word.get(i).getWord())) {
				index = i;
				word.get(i).setMean(updateMean);
				System.out.println(updateWord+"의 단어의 의미를 "+updateMean+"로 수정하였습니다.");
				return;
			}
		}
		if(index == -1) {
			System.out.println(updateWord+"단어가 없습니다.");
		}
	}

	@Override
	public void delect(Scanner scan) {
		System.out.println("삭제할 단어 입력 : ");
		String delectword = scan.next();
		int index = -1;
		for(int i=0; i<word.size(); i++) {
			if(delectword.equals(word.get(i).getWord())) {
				index = i;
				word.remove(i);
				System.out.println(delectword+" 단어가 삭제 되었습니다.");
				return;
			}
		}
		if(index == -1) {
			System.out.println(delectword+" 단어가 없습니다.");
		}	
	}

	
}
