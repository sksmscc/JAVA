package StudentManager;

import java.util.Scanner;

public class StudentManager implements Program {

	 /* class - studentManager - interface 구현(Program interface)
		 * 1.학생 리스트 출력
		 * 2.학생 등록
		 * 3.학생 검색
		 * 4.수강 신청
		 * 5.수강 철회
		 */
	
	//멤버변수 student class , stdCount변수
	private Student[] std = new Student[5];
	private int stdCount;  //등록한 학생 카운트
	
	@Override
	public void printStudent() {
		System.out.println("-----전체 학생 정보-----");
		for(int i=0; i<stdCount; i++) {
			//std[i].stdInfo(); //학생정보만 출력
			printStudentOne(std[i]); //학생정보+수강정보
			System.out.println("---------------------------");
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		//1명의 학생정보 값을 입력받아 객체를 생성한 후 std 배열에 등록
		//학번, 이름, 주민번호, 학부, 학과
		System.out.println("--학생정보 입력--");
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("학번 : ");
		String sNum = scan.next();
		System.out.println("주민번호 : ");
		String rNum = scan.next();
		System.out.println("학부 : ");
		String faculy = scan.next();
		System.out.println("학과 : ");
		String major = scan.next();
		System.out.println("--------------");
		
		//입력받은 값으로 객체를 생성자
		Student s = new Student(sNum, name, rNum, faculy, major);
		
		//배열이 다 찼다면 더 큰 배열을 생성 후 배열복사
		if(stdCount == std.length) {
			Student[] tmp = new Student[stdCount+5]; //새 배열      //std.length or stdCount 넣어도 됌.
			System.arraycopy(std, 0, tmp, 0, stdCount);
			std = tmp;
		}
		//std 배열에 등록
		std[stdCount] = s;
		stdCount++; //인원 증가(배열 번지 증가)
	}

	@Override
	public void searchStudent(Scanner scan) {
		//검색할 학생이름을 입력받아 배열에서 탐색 후 있다면 
		//학생정보 + 수강정보 출력 => printStudentOne() 호출
		System.out.println("검색할 학생 이름 입력 : ");
		String searchName = scan.next();
		int index = -1;  //찾은 학생의 배열주소 입력
		//전체 탐색
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdName().equals(searchName)) {
				printStudentOne(std[i]);
				index = i;
			}
			}
		if(index == -1) {
			System.out.println("검색한 학생이 없습니다.");
		}
	}
	
	@Override
	public void registerSubject(Scanner scan) {
		// 수강신청을 하고자하는 학생의 이름/학번을 입력받기
		int index = -1;
		System.out.println("수강신청 학생명>");
		String name = scan.next();
		// 그 학생의 배열에 위치 체크
		for(int i=0; i<stdCount; i++) {
			if(name.equals(std[i].getStdName())) {
				index = i;
				break;
			}
		}
		// 학번이 없다면...
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			// 신청할 과목의 객체 생성(과목정보 입력받기)
			System.out.println("수강신청 과목명>");
			String sName = scan.next();
			//객체 생성
			Subject sb = new Subject(sName);
			// 신청메서드 호출 insertSubject(객체)
			std[index].insertSubject(sb);	
		}
		
		
	}

//	@Override
//	public void registerSubject(Scanner scan) {
//		//수강 신청자 체크 학생의 이름/학번을 입력 받기
//		//체크 그 학생의 배열에 위치 체크 
//		//학번이 없다면...
//		//신청할 과목의 객체 생성(과목정보 입력받기)
//		//신청메스드 호출 insertSubject(객체)
//		System.out.println("수강신청을 하기 위해 학생의 학번 또는 이름을 입력 : ");
//		String searchStd = scan.next();
//		for(int i=0; i<stdCount; i++) {
//			if(std[i].getStdName().equals(searchStd)||std[i].getStdNum().equals(searchStd)) {
//				System.out.println("신청할 과목명 : ");
//				String subName = scan.next();
//				Subject j = new Subject(subName);
//				std[i].insertSubject(j);
//			}else if(!(std[i].getStdName().equals(searchStd))||!(std[i].getStdNum().equals(searchStd))) {
//				System.out.println("학생 정보가 없습니다.");
//			}
//		}
//	}
	
	@Override
	public void delectSubject(Scanner scan) {
		int index=-1;
		System.out.println("수강철회 학생명>");
		String name = scan.next();
		// 그 학생의 배열에 위치 체크
		for(int i=0; i<stdCount; i++) {
			if(name.equals(std[i].getStdName())) {
				index = i;
				break;
			}
		}
		// 학번이 없다면...
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			// 신청할 과목의 (과목명 입력받기)
			System.out.println("수강철회 과목>");
			String sName = scan.next();
			// 신청메서드 호출 deleteSubject(과목명)
			std[index].deleteSubject(sName);	
		}
	}
		
//	@Override
//	public void delectSubject(Scanner scan) {
//		System.out.println("수강 철회할 학생의 학번 또는 이름 입력 : ");
//		String searchStd = scan.next();
//		
//		//Student 객체는 subjectList를 가지고 있기 때문에 getSubjectList()로 가져옴
//        //해당 student가 수강하고 있는 과목들 중에 철회할 과목이 있는지 확인하기 위해
//        //반복 횟수 입력을 위한 subCount 변수 가져옴
//		for(int i=0; i<stdCount; i++) {
//			if(std[i].getStdName().equals(searchStd)||std[i].getStdNum().equals(searchStd)) {
//				System.out.println("철회할 과목명 : ");
//				String subName = scan.next();
//				Subject[] subjectList = std[i].getSubjectList();
//				int subCount = std[i].getSubCount();
//				//subjectList는 원래 요소가 5개 이므로 subjectList.length 처리를 하면 5개가 나옴.
//				//과목명을 3개 입력하는 경우, j<subjectList.length만큼 돌면 index 3,4의 경우 null값인데
//				//null.getSubName()을 수행하므로 error 발생
//				//따라서 subCount 만큼 반복수행
//				for(int j=0; j<subCount; j++) {
//					if(subjectList[j].getSubName().equals(subName)) {//지우기
//						//뒤에 있는 값 앞으로 옮기기
//						for(int k=j+1; k<subCount; k++) {
//							subjectList[k-1] = subjectList[k];
//						}
//						//마지막 요소 null 처리
//						subjectList[subCount-1] = null;     
//					    std[i].setSubCount(subCount-1);
//						System.out.println(subName+"수강이 철회되었습니다.");
//						return; //같으면 종료하지 않고 반복 수행
//	                    }
//				}
//				System.out.println("철회할 정도가 없습니다.");
//				
//			}else if(!(std[i].getStdName().equals(searchStd))||!(std[i].getStdNum().equals(searchStd))) {
//				System.out.println("학생 정보가 없습니다.");
//			}
//		}	
//	}
//	}
	
	//1명의 학생정보+수강정보를 같이 출력하고 싶을 때
	public void printStudentOne(Student s) {
		System.out.println("-----학생정보-----");
		s.stdInfo();
		System.out.println("-----수강정보-----");
		s.subPrint();
	}
	
	
	
	
	
	
}
