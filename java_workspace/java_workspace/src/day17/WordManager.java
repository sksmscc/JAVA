package day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import day15.Word;

public class WordManager {

	/* package day15 에서 생성한 Word 클래스 객체화해서 사용
	 * 단어장 프로그램 작성
	 * 1.단어등록
	 * 2.단어검색
	 * 3.단어수정
	 * 4.단어출력
	 * 5.단어삭제
	 * 6.파일로 출력
	 * 7.종료
	 */
	private ArrayList<Word> list = new ArrayList<>();
		
	public void printMenu() {
		System.out.println("-----Word Book Menu------");
		System.out.println("1.단어추가");
		System.out.println("2.단어검색");
		System.out.println("3.단어수정");
		System.out.println("4.단어삭제");
		System.out.println("5.단어출력");
		System.out.println("6.파일로 출력");
		System.out.println("7.종료");
		System.out.println("-------------------------");
	}
	
	//기본등록단어
	public void WordOld() {
		list.add(new Word("apple","사과"));
		list.add(new Word("car","차"));
		list.add(new Word("banana","바나나"));	
	}
	
	
	//단어등록
	public void insertWord(Scanner scan) {
		System.out.println("단어 입력 : ");
		String word = scan.next();
		System.out.println("의미 입력 : ");
		String mean = scan.next();
		list.add(new Word(word, mean));
		
		//생성자가 없을 때 사용
//		Word w = new Word();
//		w.setWord(scan.next());
//		w.setMean(scan.next());
//		list.add(w);
	}
	
	//단어검색
	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어 입력 : ");
		String word = scan.next();
		for(Word w : list) {
			if(w.getWord().equals(word)) {
				System.out.println("검색 결과>>");
				System.out.println(w);
				return;
			}
		}
			System.out.println(word+"없는 단어입니다.");
	}
	
	//단어수정
	public void modifyWord(Scanner scan) {
		System.out.println("검색단어 입력 : ");
		String word = scan.next();
		System.out.println("수정단어 입력 : ");
		String newWord = scan.next();
		System.out.println("수정의미 입력 : ");
		String mean = scan.next();
		Word w = new Word(word, mean);
		int index = -1;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				index = i;
				list.set(index, w); //수정
			}
		}		
		System.out.println("검색단어가 없습니다.");
	}
	//단어삭제
	public void delectWord(Scanner scan) {
		System.out.println("삭제할 단어 입력 : ");
		String word = scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				list.remove(i);
				return;
			}
		}
		System.out.println("단어가 없습니다.");
	}
	
	//단어출력
	public void printWord() {
		System.out.println("--단어장--");
		 list.sort(new Comparator<Word>() {
			   @Override
			   public int compare(Word o1, Word o2) {
			    return o1.getWord().compareTo(o2.getWord());
			   }
			  });
		for(Word w : list){
			System.out.println(w);
		}
		System.out.println("---------");
	}
	
	//단어 파일로 출력
	public void fileWord() throws IOException {
		FileWriter fs = new FileWriter("Word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		//단어장의 list의 값을 String화 하기 위해 StringBufferer 객체 생성
		StringBuffer sb = new StringBuffer();
		String data = null;
		sb.append("단어장");
		sb.append("\r\n");
		int cnt = 0;
		 list.sort(new Comparator<Word>() {
			   @Override
			   public int compare(Word o1, Word o2) {
			    return o1.getWord().compareTo(o2.getWord());
			   }
			  });
		while(cnt < list.size()) {
			sb.append(list.get(cnt).toString());
			sb.append("\r\n"); //즐바꿈
			cnt++;
		}
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		
		bw.close();
		fs.close();
	}
	
}
