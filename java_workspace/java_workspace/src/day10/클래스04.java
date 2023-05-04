package day10;

public class 클래스04 {

	public static void main(String[] args) {
		//생성자를 이용하여 객체 생성
		Car mycar = new Car("파랑");
		mycar.setColor("파랑이");
		mycar.setDoor(4);
		mycar.setAirBack(true);
		mycar.print();
		System.out.println(mycar);
	
		Car mycar2 = new Car("연두", 2, false);
	    mycar2.print();
	    mycar2.powerOn();
	    mycar2.speedUp();
	    mycar2.speedUp();
	    mycar2.speedUp();
		System.out.println(mycar2.toString());
		System.out.println(mycar2);  //위에 방법이나 옆의 방법을 가능. 알아서 찾아줌.

	}

}


class Car {
	//멤버변수 : color, door, airback, power, speed
	private String color;
	private int door;
	private boolean airBack;
	private boolean power;
	private int speed;
	
	//생성자 : 빈생성자, color, (color, door), (color, door, airback), 전체 생성자
	public Car() {   //기본 생성자
	}
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	public Car(String color, int door, boolean airBack) {
		//생정자 호출
		//this(color,door); //위에 있는 생성자 불러옴.
		this.color = color;
		this.door = door;
		this.airBack = airBack;
	}
	
	//생성자 자동생성 [방법 : (오른쪽 마우스 클릭->Source->Generate constructor using fields..   )]
    public Car(String color, int door, boolean airBack, boolean power, int speed) {
	    super();  //부모의 생성자를 호출
	    this.color = color;
     	this.door = door;
	    this.airBack = airBack;
	    this.power = power;
	    this.speed = speed;
   }
    
    //toString : 멤버변수들을 출력해주는 메서드    [방법 : (오른쪽 마우스 클릭->Source->Generate constructor toString  )]
    @Override
    public String toString() { //color, door, airback 을 String으로 변환
    	return "Car [color=" + color + ", door=" + door + ", airBack=" + airBack + "]";
    }
	
	//method : print, powerOn, powerOff
    public void print() {        	//정리되게 표현하고 싶으면 밑의 방법으로 표현이 가능. 정보만 확인하고 싶으면 위에 print로 찍어주면 됌 
    	//멤버변수는 내 클래스에서 모든 메서드에서 공유되는 변수
    	//멤버변수를 매개변수로 받을 필요가 없음.
    	System.out.println("----my Car----");
    	System.out.println(color);
    	System.out.println("door : "+door);
    	System.out.println("airBack유뮤 : "+airBack);
    	System.out.println("--------------");
    }
 
	public void powerOn() {
		System.out.println(color+"색의 차에 시동이 켜졌습니다.");
		power = true;
	}
	public void powerOff() {
		System.out.println(color+"색의 차의 시동이 꺼졌습니다.");
		power = false;
	}
	
	public void speedUp() {
		if(power == true) {
			speed = speed+10;
			System.out.println(color+"속도 : "+speed);
		} else {
			System.out.println(color+"시동이 켜지지 않았습니다.");
			System.out.println(color+"시동을 켜주세요.");
		}
	}
	public void speedDown() {
		if(speed <= 0) {
			System.out.println(color+"속도가 0입니다.");
		}else {
			speed = speed-10;
			System.out.println(color+"속도 : "+speed);
		}
	}
	
	//getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public boolean isAirBack() {
		return airBack;
	}
	public void setAirBack(boolean airBack) {
		this.airBack = airBack;
	}
	public boolean isPower() {
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


	
	
}