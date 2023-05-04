package day11;

public class Customer {
	/* 일반고객 / Gold 고객 / VIP고객
	 * 
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio
	 * 
	 * - Customer 객체생성시
	 * 기본 customer = Silver (일반등급)
	 * 기본 BonusRatio = 0.01
	 *
	 * - 메서드
	 * - 보너스 적립 계산 메서드 (메서드명 : calcPrice)
	 * - 구매금액을 주고, 적립보너스를 계산 bonusPoint에 누적
	 * - 출력 메서드 (메서드명 : customerInfo()) 
	 * - 홍길동 님의 등급은 VIP이며, 보너스포인트는 1000 입니다.
	 * 
	 * - Gold 등급
	 * - 제품을 살 때 10% 할인 / 보너스 포인트 2% 적립 
	 * 
	 * - VIP 등급
	 * - 제품을 살 때 10% 할인 / 보너스 포인트 5% 적립
	 * - 전담상담사를 갖는다.
	 * 
	 */
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {}  //상속을 하지 않아도 기본 생성자를 써주면 좋다.
	public Customer(int id, String name) {
		customerID = id;
		customerName = name;
		initCustomer();
	}
	private void initCustomer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		//가격을 매개변수로 받아 포인트를 적립
		bonusPoint = bonusPoint+(int)(price*bonusRatio); //소수점 버리고 int(정수)로 반환
		return price;
	}
	
	/*public String custimerInfo() {
	 *    return customerName+"님의 등급은"+customerGrade+"이며, 보너스 포인트는 "+ bonusPoint+"입니다.")
	 * 
	 */
	public void customerInfo() {
		System.out.println(customerName+" 님의 등급은 "+customerGrade+"이며, 보너스포인트는 "+bonusPoint+" 입니다.");
	}

    public int getCustomerID() {
	    return customerID;
    }   
    public void setCustomerID(int customerID) {
	    this.customerID = customerID;
    }
    public String getCustomerName() {
	    return customerName;
    }
    public void setCustomerName(String customerName) {
	   this.customerName = customerName;
    }
    public String getCustomerGrade() {
	   return customerGrade;
    }
    public void setCustomerGrade(String customerGrade) {
	   this.customerGrade = customerGrade;
    }
    /* (접근 할 필요가 없어서 안써도 됌.)
     * public int getBonusPoint() {
	   return bonusPoint;
    }
    public void setBonusPoint(int bonusPoint) {
	   this.bonusPoint = bonusPoint;
    }
    public double getBonusRatio() {
	  return bonusRatio;
    }
    public void setBonusRatio(double bonusRatio) {
	  this.bonusRatio = bonusRatio;
    }
*/
 
}


