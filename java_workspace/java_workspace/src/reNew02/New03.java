package reNew02;

public class New03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car("빨강");
		c.color();
		c.setDoor(4);
		System.out.println(c);
		c.powerOff();
		c.speedUp();
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOff();
		
	}

}

//car 클래스 생성

class Car{
	
	private String color; 
	private int door; 
	private boolean power;
	private int speed; 

	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color , int door) {
		this.color = color;
		this.door = door;
	}
	
	public void color() {
		System.out.println("내 차의 색 : "+color);
	}
	
	public void powerOn() {
		System.out.println("시동이 켜졌습니다.");
		this.power = true;
	}
	
	public void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
		this.power = false;
	}
	
	public void speedUp() {
		if(power == false) {
			System.out.println("시동을 걸어주세요");
			this.speed= speed;
		}else {
			this.speed = speed+10;
			System.out.println("속도 : "+speed);
			
		}
	}
	
	public void speedDown() {
		this.speed = speed-10;
		System.out.println("속도 : "+speed);
		if(speed <= 0) {
			speed = 0;
			System.out.println("정지 상태입니다.");
		}
	}

	
	//get set 	
	
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

	@Override
	public String toString() {
		return "Car [color=" + color + ", door=" + door + ", power=" + power + ", speed=" + speed + "]";
	}
	
	
	
}

