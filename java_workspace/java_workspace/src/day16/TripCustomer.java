package day16;

public class TripCustomer implements Comparable<TripCustomer> {
	private String nameCustomer;
	private int ageCustomer;
	private int priceCustomer;
	
	public TripCustomer() {}

	public TripCustomer(String nameCustomer, int ageCustomer) {
		this.nameCustomer = nameCustomer;
		this.ageCustomer = ageCustomer;
		this.priceCustomer = (ageCustomer>=15)? 100 : 50;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}
	
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public int getAgeCustomer() {
		return ageCustomer;
	}

	public void setAgeCustomer(int ageCustomer) {
		this.ageCustomer = ageCustomer;
	}

	public int getPriceCustomer() {
		return priceCustomer;
	}

	public void setPriceCustomer(int priceCustomer) {
		this.priceCustomer = priceCustomer;
	}

	@Override
	public String toString() {
		return "이름 : " + nameCustomer + " 나이 : " + ageCustomer + " 비용 : "
				+ priceCustomer;
	}

	@Override
	public int compareTo(TripCustomer o) {
		return this.nameCustomer.compareTo(o.nameCustomer);
	}
	
}
