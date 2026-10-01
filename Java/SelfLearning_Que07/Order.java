package SelfLearning_Que07;

class Order {
	private int orderId;
	private double totalAmount;

	public Order(int orderId, double totalAmount) {
		this.orderId = orderId;
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Order ID: " + orderId + ", Total: " + totalAmount;
	}
}

