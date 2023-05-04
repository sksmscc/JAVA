package day08;

public class 클래스02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : color, power, speed
		 * 메서드 : powerOn(메서드에서 전원이 켜졌습니다.), powerOff(메서드에서 전원이 꺼졌습니다.), speedUp +10 , speedDown -10
		 * 멤버변수 : private
		 * 멤버변수를 확인/수정 => getter/setter 필요
		 */
		Car myCar = new Car("연두");
		System.out.println(myCar.getColor());
		myCar.color();  //get으로 받으면 색상만 나오지만 옆의 식으로 입력하면 내가 입력한 멤버 메서드와 함께 나옴.
		System.out.println(myCar.getDoor());
		System.out.println(myCar.isPower());
		System.out.println(myCar.getSpeed());
		myCar.setColor("보라");
		System.out.println(myCar.getColor());
		myCar.powerOn();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.powerOff();
		myCar.speedUp();
		myCar.speedDown();		
		myCar.speedDown();
		
		
		Car myCar2 = new Car("브라운");
		System.out.println("---다른 자동차---");	
		System.out.println(myCar2.getColor());	
		System.out.println(myCar2.getDoor());
		System.out.println(myCar2.isPower());	
		System.out.println(myCar2.getSpeed());	
		
		myCar2.setColor("분홍이");
		System.out.println(myCar2.isPower());	
		System.out.println(myCar2.getSpeed());
		myCar2.powerOn();
		myCar2.speedUp();
		myCar2.speedUp();
		myCar2.speedUp();
		myCar2.speedUp();
		myCar2.speedUp();
		myCar2.speedDown();
		myCar2.speedDown();
		myCar2.speedDown();
		myCar2.speedDown();
		myCar2.speedDown();
		myCar.powerOn();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedDown();
	}
	

}
class Car {
	//멤버변수 선언          
	private String color;  //null
	private int door; 
	private boolean power;  //false
	private int speed;  //0
	
	//생성자 : 없으면 기본생성자가 자동 추가된다.
	//생성자 위치
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, int door) {     //[같은 매개변수가 있으면 오류!]
		//this(color); //생성자 호출  [호출하는 생성자는 맨 앞에 있어야 함. 뒤에 있으면 실행 X]
		this.color = color;
		this.door = door;
	}
	
	public Car() {} //기본생성자 (아무것도 없는 )  //생성자 오버로딩
	
	//멤버메서드
	public void color() {
		System.out.println("내 차의 색 : "+color);
	}
	
	public void powerOn() {
		System.out.println(color+"시동이 켜졌습니다.");
		power = true;
	}
	
	public void powerOff() {
		System.out.println(color+"시동이 꺼졌습니다.");
		power = false;
	}
		
	public void speedUp() {
		if(power == true) {
			speed = speed + 10;	
			System.out.println(color+"속도 : "+speed);
		}else {
		System.out.println(color+"시동이 켜지지 않았습니다.");
		System.out.println(color+"시동을 켜주세요.");	
		}
	}
		
	public void speedDown() {
		if(speed <= 0) {
			System.out.println(color+"속도가 0입니다.");
		}else {
			speed = speed - 10;
			System.out.println(color+"속도 : "+speed);	
			}
	}
	
//  [다른 방법]
//	if(speed<=0) {
//		speed = 0;
//	}else {
//		speed = speed-10;
//	}
//	speed = speed - 10;
//	System.out.println(color+"속도 : "+((speed<=0)? 0 : speed));	
		
		
	//getter/setter	
	public String getColor() {
			return color;
	}
		
	public void setColor(String color) {
			this.color = color;
	}

	public boolean isPower() {  //boolean을 사용하면 isPower로 나옴.
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getDoor() {
		return door;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	

}