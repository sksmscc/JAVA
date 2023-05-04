package day11;

public class VIP extends Customer {

		double saleRatio;
	    String counselor;
		
		public VIP() {}
		public VIP(int id, String name) {
			super(id, name);
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
			counselor = "김지연";
			
		}
		@Override
		public int calcPrice(int price) {
			bonusPoint+=(int)(price*bonusRatio);
			return price-(int)(price*saleRatio);
		}
		
		
		@Override
		public void customerInfo() {
			super.customerInfo();
			System.out.println("전담 상담사는 "+counselor);
		}
		
		public String getCounselor() {
			return counselor;
		}
		public void setCounselor(String counselor) {
			this.counselor = counselor;
		}
		
		/* [강사님_정답]
		 * private int agentID;
		 * double saleRatio;
		 * 
		 * public VIP(int id, String name, int agentid) {
		 *  super(id, name);
		 * customerGrade = "VIP";
		 *	bonusRatio = 0.05;
		 *	saleRatio = 0.1;
		 *	this.agentID = agentid;
		 *	
		 *  @Override
		 *  public int calcPrice(int price) {
		 *	bonusPoint+=(int)(price*bonusRatio);
		 *	return price-(int)(price*saleRatio);
		 *  }
		 *
		 *  @Override
		 *   public void customerInfo() {
		 *	// TODO Auto-generated method stub
		 *	super.customerInfo();
		 *	System.out.println("전담 상담사는 "+counselor);
		 *  }
		 */
	
		

}
