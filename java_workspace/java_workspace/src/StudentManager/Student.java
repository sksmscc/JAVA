package StudentManager;

public class Student {
	
	/* class - student(별도 생성)
	 * 학생클래스 : 한 학생의 정보를 나타내는 클래스
	 * - 학번, 이름, 주민번호, 학부, 학과, 수강과목s(과목클래스를 배열생성)
	 * - 수강과목의 번지를 대신할 count 
	 * - 메서드
	 *   - 수강과목 추가(배열이 다 찼다면 늘려주기)
	 *   - 수강과목 삭제
	 * - 생성자, getter/setter, 출력메서드(print) - 2가지 형태로
	 */
	
	//멤버변수
	private String stdNum;
	private String stdName;
	private String registerNum;
	private String faculty;
	private String major;
	private Subject[] subjectList = new Subject[5]; //subject 클래스를 배열로 선언.
	private int subCount;
	
	//생성자
	public Student() {}

	//전체요소를 받는 생성자
	public Student(String stdNum, String stdName, String registerNum, String faculty, String major) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.registerNum = registerNum;
		this.faculty = faculty;
		this.major = major;

	}

	//method
	//print method : 학생정보
	public void stdInfo() {
		System.out.println("학번 : "+stdNum);
		System.out.println("이름 : "+stdName);
		System.out.println("주민번호 : "+registerNum);
		System.out.println("학부(학과) : "+faculty+"("+major+")");

	}
	
	//수강과목을 출력하는 메서드
	public void subPrint() {
		//수강과목이 없을 때
		if(subCount == 0) {
			System.out.println("수강중인 과목이 없습니다.");
		}else {	
		//수강과목이 있을 때 : 수강과목은 여러 개 있을 수 있음.
			for(int i=0; i<subCount; i++) {
			//	System.out.println(subjectList[i]);  //과목 전체 출력      //toString을 이용한 출력
				//print method로 직접 sysout을 했을 경우
				//subjectList[i].print();  //subject 클래스에 print메서드가 있을 경우
				System.out.println("과목명 : "+subjectList[i].getSubName()); //각각 출력할 경우 
			}
		}
	}
	
	//수강과목 추가
	/* 매개변수 : Subject subName
	 * 리턴타입 : 
	 */
	public void insertSubject(Subject subName) {
		//배열 다 찼다면 늘려주기
		if(subCount == subjectList.length) {
			//new를 이용 배열 생성(신 배열을 생성) + 5
			Subject[] tmp = new Subject[subjectList.length+5];
		    //arrayCopy를 이용한 배열 복사
			//system.arraycopy(구배열, 시작번지, 신배열, 시작번지, 총개수)
			System.arraycopy(subjectList, 0, tmp, 0, subjectList.length);  //subjectList.length   or subCount를 사용 가능!
			//새로만든 배열로 연결
			subjectList = tmp;
		}
		//subName 추가
		subjectList[subCount] = subName;
		subCount++;  //값을 추가했기 때문에 subCount 증가
	}	
	//수강과목 삭제
	/* 매개변수 : String sunName
	 * 리턴타입 : void
	 */
	public void deleteSubject(String subName) {
		int index = -1; //찾는 과목의 위치를 나타내는 변수 //아무것도 선택하지 않는 기본값
		//만약 매개변수의 값이 null이라면 return(메서드를 빠져나감.)
		if(subName == null) {
			return;
		}
		//subName이 subjectList에 있는지 검색
		for(int i=0; i<subCount; i++) {
			if(subjectList[i].getSubName().equals(subName)) {
				//있다면 번지를 index에 저장
				index = i;
				break;
			}
		}
		//찾는 과목이 없다면 ... return
		if(index == 1) {
			return;
		}
		
		//찾았을 경우 삭제
		//찾은 위치부터 뒷번지의 과목을 앞번지로 옮기는 작업
		//subCount = 1 1과목이 있다는 것을 의미 subjectList = 0번지
		for(int i=index; i<subCount-1; i++){  //마지막 끝 값을 비교하게 되면 뒤에 있는 번지를 앞으로 넘겨주어야되기 때문에 마지막 값은 null값으로 줌.
			subjectList[i] = subjectList[i+1];
		}
		//마지막 번지는 null
		//ex) 과목이 3개 있다면 0 1 2
		subjectList[subCount-1] = null;
		subCount--;
	}
	
	//Getter/Setter
	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Subject[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}

	
}
