package day12;

public class 과제 {

	public static void main(String[] args) {
		/* TV의 채널은 0~10까지 있음.
		 * vol 0~20까지 있음. 0이 되면 음소거라고 출력.
		 * vol 0이하로 내려가지 않음. 20이상 올라가지 않음.
		 * 
		 * 
		 */
		
		TV t = new TV();
		t.turnOn();
		t.channlUp();
		t.channlUp();
		t.channlUp();
		//t.channl = 11;
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.channlDown();
		t.channlDown();
		t.channlDown();
		t.channlDown();
		t.turnOff();
		t.channlDown();
		t.volDown();

		
		
		
		
	}
	
}
	interface Remocon{
		void turnOn();
		void turnOff();
		void channlUp();
		void channlDown();
		void volUp();
		void volDown();
		
	}
	interface power {
		abstract void turnOn();
		abstract void turnOff();
	}
	
	interface channl {
		 void channlUp();
		 void channlDown();
	}
	
	interface volum {
		 void volUp();
		 void volDown();
	}
	
	class TV implements power, channl, volum {
		boolean power;
		int channl;
		int volum;
		
		@Override
		public void volUp() {
			if(power) {
				volum++;
				if(volum>20) {
					volum = 20;				
			}
				System.out.println("Vol: "+volum);
			}else {
				System.out.println("TV를 켜주세요.");
			}
		}
		@Override
		public void volDown() {
			if(power) {
				volum--;
				if(volum<=0) {
					volum = 0;
					System.out.println("음소거입니다.");
				
			}else {
				System.out.println("VOl : "+volum);
			}
			}else {
				System.out.println("TV를 켜주세요");
			}
		}
		@Override
		public void channlUp() {
			if(power) {
				channl++;
				if(channl>=10) {
					channl = 0;
				}
				System.out.println(channl+"채널");				
			}else {
				System.out.println("TV을 켜주세요.");
			}	
		}
		@Override
		public void channlDown() {
			if(power) {
				channl--;
			if(channl<0) {
				channl=10;
			}
			System.out.println(channl+"채널");
		}else {
			System.out.println("TV를 켜주세요.");
		}
		}
		@Override
		public void turnOn() {
			System.out.println("TV가 켜졌습니다.");
			power = true;
			
		}
		@Override
		public void turnOff() {
			System.out.println("TV가 꺼졌습니다.");
			power = false;
		}
		
		
	}
	
