package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Subject {
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private int sum = 0;
	
	Scanner scan = new Scanner(System.in);

	//입력 메서드
	public void make(int size) {
		while(map.size()<size) {
			System.out.println("과목 입력 : ");
			String subject = scan.next();
			System.out.println("점수 입력 : "); 
			int score = scan.nextInt();
			if(score<0 || score>100) {
				System.out.println("잘못된 점수입니다.");
				return;
			}
			
			map.put(subject, score);
		}
	}
	
	//출력 메서드
	public void print() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			int score = map.get(key);
			System.out.println(key+" : "+score);
		}
	}
	
	//합계와 평균 
	public void totalscore() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			int score = map.get(it.next());
			sum += score;		
		}
		System.out.println("합계 : "+sum+" 평균 : "+sum/map.size());
	}
	
	//검색
	public void search(String subject,int score) {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println("찾으시는 과목을 입력해 주세요.");
			String subject1 = scan.next();
			if(subject.contains(subject1)) {
				System.out.println(subject+score);
			}else {
				System.out.println(subject1+"는 없는 과목입니다.");
			}
		}
	}
	
	//성적 수정
	public void modify() {
		System.out.println("수정할 과목을 입력해 주세요");
		 String subject = scan.next();
		 int score = scan.nextInt();
		 if(score<0 || score>100) {
				System.out.println("잘못된 점수입니다.");
				return;
			}
		 map.put(subject,score);  //map의 key는 중복불가 중복되면 덮어쓰기됨.
		 System.out.println(subject+"성적이 "+score+"로 변경되었습니다.");
	}
	
	//성적 삭제
	public void delete() {
		System.out.println("삭제할 과목을 입력해 주세ㅐ요");
		String subject = scan.next();
		if(map.get(subject)==null) {
			System.out.println(subject+"는 없는 과목입니다.");
		}else {
			map.remove(subject);
			System.out.println(subject+" 과목이 삭제 되었습니다.");
		}
	}
	
	

	public static void main(String[] args) {
		/* map을 이용 성적관리 프로그램 생성
		 * >>menu
		 * 1. 성적추가(국어 97) 
		 * 2. 성적 조회(전체출력) : 합계/평균 같이 출력
		 * 3. 성적 조회(과목) : 서치 후 일치하는 과목 출력
		 * 4. 성적 수정
		 * 5. 성적 삭제
		 * 6. 종료
		 * CRUD
		 * C(create) :  생성  R(read) 읽기
		 * U(update) :  수정  D(delete) 삭제 
		 */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Subject su = new Subject();
		
		su.make(3);
		su.print();
		su.totalscore();
		su.search(null, 0);
		
	}
}
