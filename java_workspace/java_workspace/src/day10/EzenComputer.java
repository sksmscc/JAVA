package day10;

public class EzenComputer {
/* - 학생기본정보 : 이름, 생년월일, 나이, 전화번호
 * - 학원정보 : 학원이름 = "EZEN"  (final로 지정), 지점
 * - 수강정보 : 수강과목, 기간
 * - 한명의 학생은 여러과목을 수강할 수 있음.
 * 과목, 기간 => 배열로 처리 길이 = 5
 * 
 * 홍길동, 990101, 20, 010-1111-1111
 * EZEN, 인천
 * 자바(6개월), DB(1개월), html(2개월)
 * 
 * 기능
 * - 학생의 기본정보 출력
 * - 학생의 학원정보 출력
 * - 학생의 수강정보 출력
 * - 학생의 수강정보를 추가하는 기능
 */
	
	
	
	
	//멤버변수
	private String name;
	private String birth;
	private int age;
	private String phone;
	private final static String company = "EZEN";
	private String branch;
	private String month;
	private String course[] = new String[5]; //수강과목
	private String period[] = new String[5]; //수강기간
	private int cnt; //수강과목, 수강기간의 index를 처리 //받을 때마다 하나씩 추가 되기 때문에.
	
	
	//생성자
	public EzenComputer() {	
	}
	public EzenComputer(String name, String birth, int age, String phone, String branch) {	
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;
		this.branch = branch;
	}
	public EzenComputer(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}

	//method
	public void printInfo() {
		System.out.print("학생기본정보>");
		System.out.print("이름 : "+name);
		System.out.print("tel : "+phone);
		System.out.print("age : "+age+"세");
		System.out.print("생년월일 : "+birth);
	}
	public void printCompany() {
		System.out.println("학원명 : "+company);
		System.out.print("지점 : "+branch);
	}
	
	//수강정보 출력
	public void printCourse() {
		if(course.length == 0 || cnt ==0) {
			System.out.println("수강이력이 없습니다.");
			return;  //메서드 종료     //아무것도 없는 것을 return을 하면 없는 상태를 return함.
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("과정 : "+course[i]+"("+period[i]+") ");
		}
	}
	
	//수강정보 등록
	public void insertCourse(String course, String period) {
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;  //index 중가
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public static String getCompany() {
		return company;
	}
	
	
	
}
