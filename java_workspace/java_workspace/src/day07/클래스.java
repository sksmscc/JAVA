package day07;

public class 클래스 {

	public static void main(String[] args) {
		/* 클래스 - 설계도
		 * 객체를 생성하기 위한 설계도
		 * 메서드 - 기능
		 * 
		 * 클래스의 구성정보
		 * - 속성 : 멤버변수 // 모든 메서드에서 공통적으로 쓸 때 사용 ex)Scanner을 public class 밑에 써준 것
		 * - 기능 : 메서드
		 * 
		 * 프린터 클래스
		 * - 속성(정보) : 크기, 색, 제조사, 이름, 구동방식
		 * - 기능 : 인쇄, 스캔, 팩스, 복사
		 * 
		 * 멤버변수는 클래스 안, 메서드 밖에 작성 (현재 4번라인에서 작성)
		 * 멤버변수는 클래스 안에서 사용할 수 있다.(모든 메서드를 포함)
		 * 
		 * 접근제한자  class 클래스명 {
		 * // 클래스명은 반드시 대문자로 시작! (규칙)
		 * }
		 * 
		 * - 객체 선언 
		 * 클래스명 객체명;
		 * - 객체 선언 & 초기화(생성)
		 * 클래스명 객체명 = new 클래스명();
		 * 
		 * - 멤버 메서드 사용하는 법
		 * 객체명.메서드명();
		 * 
		 * 같은 클래스 안에서 메서드 호출할 때는 메서드명으로 호출가능. => 메서드명();
		 * 다른 클래스에서는 메서드를 호출할 때 객체를 이용하여 사용 =>객체명.메서드명();
		 */
		/* 접근제한자(접근제어자)
		 * - public : 모두 사용 가능.
		 * - protected : 나 + 패키지 + 자식클래스
		 * - (default) : 나 + 패키지 
		 * - private : 나
		 * 
		 * 클래스에서 public을 붙일 수 있는 건 파일명과 클래스명이 같을 때만 가능. 
		 * // ex) class 클래스2 => O    /  public class 클래스2 => X  
		 * 멤버변수나, 메서드는 public을 붙이는 것에 제한이 없음.		 
		 * 
		 * private : 멤버변수/메서드를 다른 클래스에서 사용할 수 없게 함.
		 * // (다른 곳에서 나를 함부로 접근할 수 없게 함)
		 * 
		 * - 일반적으로 멤버변수는 private으로 하고, 메서드는 public으로 선언
		 * - 일반적으로 private으로 선언된 멤버변수는 getter/setter를 통해 변수에 접근할 수 있음.
		 * */
		
		Point p = new Point();
		p.print();
		p.move(5,3);
		p.print();
		
//		p.x = 7;     //public에서만 가능
//		p.y = 10;    //public에서만 가능
//		p.print();   //public에서만 가능
		
		// 밑의 방법으로도 가능하고 위의 방법으로도 가능!
		System.out.println(p.getX());
		System.out.println(p.getY());
//		System.out.println(p.x);       //public에서만 가능
//		System.out.println(p.y);       //public에서만 가능
		
		p.setX(100);
		System.out.println(p.getX());
		p.setY(10);
		System.out.println(p.getY());
		p.print();      //합쳐서 같이 나옴 [ ex) (100,10)이 나옴   ]
		
		
		Point1 p1 = new Point1();
		p1.print();
		p1.move(100,200,300);
		p1.print();
		p1.setX(50);
		p1.print();
		System.out.println(p1.getX());

		

	}

}
/* 다른 클래스 밖에서 생성
 * 접근제한자 class 클래스명{
 * 클래스명은 대문자로 시작
 * }
 */
class Point{  //멤버변수에 있으면 메서드에 안찍어도 됌.
	//멤버변수는 초기화하지 안아도 기본 0 또는 null로 초기화 됨.
//	public int x;
//	public int y;
	private int x;  //직접 접근이 불가하여 위에 p.x /p.y가 출력이 되지 않음.
	private int y;
	
	//x,y 좌표를 프린트 하는 메서드
	public void print() {
		// (0,0)
		System.out.println("("+x+","+y+")");
	}
	
	//x,y 좌표를변경하는 메서드
	//매개변수 :x,y의 값을 주고 멤버변수의 x,y를 변경
/*	public void move(int x, int y) {
		this.x = x;
		this.y = y;
*/
		public void move(int x1, int y1) {
		x=x1;
		y=y1;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;   //멤버변수 : 파란색 /   매개변수: 갈색
	}
	public void setY(int y) {
		this.y = y;   //멤버변수 : 파란색 /   매개변수: 갈색
	}
		
}



class Point1{
	//x,y,z를 멤버변수로 선언
	public int x;
	public int y;
	public int z;
	
	//(x,y,z)를 찍는 print 메서드 생성
	public void print() {
		System.out.println("("+x+","+y+","+z+")");
	}
	
	//x,y,z의 값을 변경하는 move 메서드 생성
	public void move(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	//각각의 값을 getter/setter 생성   (getter은 -> 필수로 사용!. setter -> 필요하면 사용!)

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	
}
