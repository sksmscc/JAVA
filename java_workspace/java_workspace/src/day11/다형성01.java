package day11;

public class 다형성01 {

	public static void main(String[] args) {
		/* 모든 클래스의 최고 조상은 Object 클래스
		 * 모든 클래스는 Object가 제공하는 클래스를 사용할 수 있고,
		 * 오버라이딩 할 수 있다.
		 * 
		 * 상속은 단일상속이 원칙!
		 * 부모는 1명. 부모가 2개가 될 수는 없다.
		 * 
		 */
		
		A a = new A();
		a.num = 10;
		System.out.println(a);
		B b = new B(10);
		b.num = 20;
		b.toString();
		System.out.println(b);
		
	}

}
class A {
	int num;

	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}
	
	
	
}
class B extends A{
	public B(int num) {
		super.num = num;
	}
}
 class C{
	 int num1;
 }


