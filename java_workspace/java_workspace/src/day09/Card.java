package day09;

public class Card {
	/* Card class
	 * - 모양 : 하트(♥), 클로버(♣), 스페이드(♠), 다이아(◆),별(★)
	 * - 숫자 :  1~10 , J(11) , Q(12) , K(13)       
	 * - 한장의 카드정보를 출력하는 기능
	 * 
	 * - 생성자 : 클래스의 멤버변수들을 초기화 하는 기능 메서드
	 * - 생성자가 하나도 없으면 기본생성자를 자도응로 생성.
	 * - 생성자가 하나라도 있다면 기본 생성자는 생성되지 않음.
	 * - 생성자의 이름은 클래스명과 동일, 리턴 자리는 없음. 매개변수는 가질 수 있음.
	 * 
	 * - 멤버변수는 private 선언, 메서드는 public 선언
	 * - 멤버변수에 접근하기 위해 getter/setter 메서드 사용
	 */
	
	
   //멤버변수 선언
   private char shape;
   private int num;
   
   //생성자
   public Card() {
	   shape = '♥';
	   num = 1;
	   }
   
   //print 메서드
   public void print() {
	   switch(num) {
	   case 11 :
		   System.out.print("J");
		   break;
	   case 12 :
		   System.out.print("Q");
		   break;
	   case 13 :
		   System.out.print("K");
		   break;
	   default :
		   System.out.print(num);
		   break;
	   }
	   System.out.print(shape+" ");
   }
   
  //getter/setter 
   public char getShape() {
	return shape;
   }

   public void setShape(char shape) {
	this.shape = shape;
	switch(shape) {
	case '♠' :
		this.shape = shape;
		break;
	case '♥' :
		this.shape = shape;
		break;
	case '♣' :
		this.shape = shape;
		break;
	case '◆' :
		this.shape = shape;
		break;
	default :
		this.shape = '♥';
		break;
	}
   }

   public int getNum() {
	return num;
   }

   public void setNum(int num) {
	if(num < 1 || num > 13) {
		this.num = 1;		
	}else {
		this.num = num;
	}
   }
	
	
	
}


