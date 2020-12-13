package chapter_6;

public class Order {
	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [amount=" + amount + "]";
	}

	public Order(double amount) {
		super();
		this.amount = amount;
	}
	
}
