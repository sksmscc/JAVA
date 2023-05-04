package day08;

public class 클래스03 {

	public static void main(String[] args) {
		/* Card 클래스 생성
		 * 
		 */
		
		Card myCard = new Card();         //new가 들어가야지 초기화가 됨.
		myCard.print();         //아무것도 입력하지 않았기 때문에 초기값이 출력 됌. 
		myCard.setShape('♥');
		myCard.setNum(3);
//		myCard.setNum(11);     [숫자 11을 입력하면 J만 출력 됌.]
		myCard.print();
		// 카드에 있지 않는 모양/숫자가 들어오면 무조건  => 1♥
		myCard.setShape('※');
		myCard.setNum(-1);
		myCard.print();
		
				
	}

}

/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트(♥), 클로버(♣), 스페이드(♠), 다이아(◆)
 * 숫자 :  1~10 , J(11) , Q(12) , K(13)       
 * 
 * 클래스의 구성
 * - 멤버변수 : char shape, int num 
 * - 메서드 : print (1♥)
 * - getter/setter
 * - 생성자 : 초기값 하트1 (1♥)
 * 
 * 생성자 선언 방법
 * public 클래스명() {     //매개변수는(필요하면 생성) 없을수도 있음.
 * 초기값;
  */

class Card{
	
	//멤버변수 선언
	private char shape;  //모양
	private int num;    //숫자
	
	//생성자 : 객체의 초기값을 결정
	public Card() {
		shape = '♥';
		num = 1;
	}
	
    //print 메서드
	//shape, num를 출력하는 메서드
	public void print() {		
		switch(num) {
		case 11: 
			System.out.println("J");
			break;
		case 12: 
			System.out.println("Q");
			break;
		case 13: 
			System.out.println("K");			
			break;
		default:
			System.out.print(num);
		}
		System.out.println(shape);  //11♥  => J♥	
	}

	
	
	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {  
		this.shape = shape;
		switch(shape) {
		case '♥' :
			this .shape = shape;
			break;
		case '♣' :
			this .shape = shape;
			break;
		case '♠' :
			this .shape = shape;
			break;
		default :
			this. shape = shape;
			break;
		}
		
/*		switch(shape) {
		case '★' : case '♥' : case '♣' : case '♠' :
		this shape = shape;
		break;
		default :
			this shape = '♥'
			break;
		}
*/	
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<1 || num>13) {
			this.num = 1;
		}else {
			this.num = num;			
		}
	}

	
	
	
}

