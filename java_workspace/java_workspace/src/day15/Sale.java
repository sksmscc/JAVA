package day15;

/* 제네릭 : 결정되지 않은 파라미터를 처리할 때
 * 실제 객체를 사용할 때 파라미터 타입을 결정 대체
 * <T><K><V> 
 * menu, price
 */

public class Sale<K,V> {
	
	//멤버변수 선언 menu, price
	private K menu;
	private V price;
	
	public Sale() {}
	public Sale(K menu, V price) {
		this.menu = menu;
		this.price  = price;
	}
	
	@Override
	public String toString() {
		return menu + " : " + price;
	}
	
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	
	
}
