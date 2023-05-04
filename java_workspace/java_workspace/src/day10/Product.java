package day10;

import java.util.Arrays;

public class Product {
		/* Product 클래스 : 상품을 등록하는 클래스
		 * 상품명, 가격
		 * 상품등록 메서드 = onsertProduct
		 * 출력메서드  (toString 사용)
		 */

	//멤버변수
			private String name;
			private int price;

			//생성자
			public Product() {}
			
			/* public product(String name, int price) { 
			 *  this.name = name;
			 *  this.price = price;
			 */
			
			//상품 등록 메서드
			public void insertProduct(String name, int price) {
				this.name = name;
				this.price = price;
			}
			
			/*@Override
			public String toString() {
				return "Product [상품명 : " + name + ", 가격 : " + price + "]";
			}
			*/
			
			//상품 출력 메서드
			public void print() {
					System.out.println("상품이름: " + name + " / 싱품가격: " + price);
			}

			//getter,setter
			public String getname() {
				return name;
			}
			
			public void setName(String name) {
				this.name = name;
			}
			
			public int getprice() {
				return price;
			}
			
			public void setProductPrice(int price) {
				this.price = price;
			}
				

			

	}