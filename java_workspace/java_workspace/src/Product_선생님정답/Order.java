package Product_선생님정답;

public class Order extends Product{
	
		private int count;
		private int total;
			
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		
		public void print() {
			System.out.println(super.getMenu()+":"+super.getPrice());
			System.out.println(count+"개 주문 => 금액:"+total);
		}
		
}
