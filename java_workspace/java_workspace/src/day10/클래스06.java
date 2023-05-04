package day10;

public class 클래스06 {

	public static void main(String[] args) {
		/* final은 클래스, 변수, 메서드에 붙일 수 있음. 
		 * final : 수정할 수 없다.
		 * final 멤버 면수 : 상수 (수정할 수 없는 값.)
		 * final 멤버 메서드 :  오버라이딩을 할 수 없다.
		 * final 클래스 : 상속할 수 없다. 부모 클래스가 될 수 없다.
		 */
		//setter을 이용한 방법
		EzenStudent ez = new EzenStudent();
		System.out.println(ez);
		ez.setName("홍길동");	
		ez.setAddress("인천");
		ez.setGroup("자바");
		ez.setPhone("010-1234-5678");
		System.out.println(ez);
		
		//생성자를 이용한 객체 생성
		EzenStudent ez2 = new EzenStudent("인천","홍길순","자바","010-9874-5623");
		System.out.println(ez2);
	}

}
/* 초기화 방법 : 기본값,
 * 1. 명시적 초기화 : 멤버변수 선언과 동시에 초기값 지정
 * 2. 초기화 블럭 : {} 멤버변수 초기화
 * 3. 생성자 : 객체를 생성할 때 초기화 해서 생성
 * 초기값 우선 순위
 * 기본값 -> 명시적초기값 -> 초기화블럭 -> 생성자
 */




//멤버변수 : 지점, 이름, 반, 전화번호
//메서드 : 출력(print 메서드, toString가능)

class EzenStudent{
	//멤버변수
	//private final static String address="인천"; //인천으로 지정했다는 뜻
	private String address;
	private String name;
	private String group;
	private String phone;  //연산에 사용될 값만을 int로 받음. (전화번호를 int로 하면 8진수로 표현되기 때문에 X)	
	{
	  //초기화 블럭 : 멤버변수들을 초기화;
		address = "incheon";
		group = "미정";
	}
	
	
	//생성자
	public EzenStudent() {
	}
	public EzenStudent(String address, String name, String group, String phone) {
		super();
		this.address = address;
		this.name = name;
		this.group = group;
		this.phone = phone;
	}
	
	//getter/setter
@Override
	public String toString() {
		return "EzenStudent [address=" + address + ", name=" + name + ", group=" + group + ", phone=" + phone + "]";
	}
    public String getAddress() {
	    return address;
    }
    public void setAddress(String address) {
	    this.address = address;
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
	    this.name = name;
    }
    public String getGroup() {
	    return group;
    }
    public void setGroup(String group) {
	   this.group = group;
    }
    public String getPhone() {
	   return phone;
    }
   public void setPhone(String phone) {
	   this.phone = phone;
    }
	

}