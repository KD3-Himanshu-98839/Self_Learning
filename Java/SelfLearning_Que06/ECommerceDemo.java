package SelfLearning_Que06;

class ECommerceException extends Exception {

	public ECommerceException(String message) {
		super(message);
	}
}

class PaymentException extends ECommerceException {

	public PaymentException(String message) {
		super(message);
	}
}

class InventoryException extends ECommerceException {

	public InventoryException(String message) {
		super(message);
	}
}

class ShippingException extends ECommerceException {

	public ShippingException(String message) {
		super(message);
	}
}

public class ECommerceDemo {

	static void makePayment(double amount)
			throws PaymentException {

		if (amount <= 0) {
			throw new PaymentException("Invalid payment amount");
		}

		System.out.println("Payment successful");
	}

	static void checkInventory(int quantity)
			throws InventoryException {

		int stock = 5;

		if (quantity > stock) {
			throw new InventoryException("Insufficient inventory");
		}

		System.out.println("Inventory available");
	}

	static void shipProduct(String address)
			throws ShippingException {

		if (address == null || address.isEmpty()) {
			throw new ShippingException("Invalid shipping address");
		}

		System.out.println("Product shipped");
	}

	public static void main(String[] args) {

		try {

			checkInventory(3);
			makePayment(1000);
			shipProduct("Pune");

			System.out.println("Order completed");

		} catch (PaymentException e) {
			System.out.println("Payment Error: " + e.getMessage());

		} catch (InventoryException e) {
			System.out.println("Inventory Error: " + e.getMessage());

		} catch (ShippingException e) {
			System.out.println("Shipping Error: " + e.getMessage());

		}
	}
}