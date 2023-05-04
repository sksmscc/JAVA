package day12;

public class 익명클래스 { //자주 사용함.

	public static void main(String[] args) {
		/* 익명클래스 : 이름이 없는 클래스
		 * 인터페이스를 이용하여 객체를 만들 때 클래스 없이 바로 구현
		 * 익명클래스 사용하는 이유
		 * 인터페이스의 기능이 적고, 해당 객체가 하나만 필요한 경우
		 * 메서드의 매개변수로 주로 사용
		 */
		
//		TV t = new TV();
//		product(t);

		//익명클래스로 작업한 경우
		product(new Power1(){   //클래스 구현

			@Override
			public void turnOn() {
				System.out.println("전원이 켜집니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("전원이 꺼집니다.");
				
			}
			
		});
		
	}
	
	public static void product(Power1 p) {
	p.turnOn();	
	System.out.println("TV가 작동중입니다.");
	p.turnOff();
	}
		
	

}

interface Power1{
	void turnOn();
	void turnOff();
}


//class TV implements Power {
//
//	@Override
//	public void turnOn() {
//		System.out.println("전원이 켜집니다.");
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("전원이 꺼집니다.");
//	}
//	
//}
