package SelfLearning_Que07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static Scanner sc = new Scanner(System.in);

	static HashMap<Integer, Product> products = new HashMap<>();

	static HashMap<Integer, Integer> cart = new HashMap<>();

	static ArrayList<Order> orderHistory = new ArrayList<>();

	static int orderId = 1;

	public static void addProduct() {

		System.out.print("Enter Product ID: ");
		int id = sc.nextInt();

		System.out.print("Enter Product Name: ");
		String name = sc.next();

		System.out.print("Enter Price: ");
		double price = sc.nextDouble();

		products.put(id, new Product(id, name, price));

		System.out.println("Product added.");
	}

	static void displayProducts() {

		if (products.isEmpty()) {
			System.out.println("No products available.");
			return;
		}

		for (Product p : products.values()) {
			System.out.println(p);
		}
	}

	static void addToCart() {

		System.out.print("Enter Product ID: ");
		int id = sc.nextInt();

		if (!products.containsKey(id)) {
			System.out.println("Product not found.");
			return;
		}

		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();

		cart.put(id, cart.getOrDefault(id, 0) + quantity);

		System.out.println("Product added to cart.");
	}

	static void viewCart() {

		if (cart.isEmpty()) {
			System.out.println("Cart is empty.");
			return;
		}

		double total = 0;

		for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {

			Product p = products.get(entry.getKey());
			int quantity = entry.getValue();

			double amount = p.getPrice() * quantity;
			total += amount;

			System.out.println(
					p.getName() + " x " + quantity + " = " + amount);
		}

		System.out.println("Total Amount: " + total);
	}

	static void removeFromCart() {

		System.out.print("Enter Product ID: ");
		int id = sc.nextInt();

		if (cart.remove(id) != null)
			System.out.println("Product removed.");
		else
			System.out.println("Product not found in cart.");
	}

	static void placeOrder() {

		if (cart.isEmpty()) {
			System.out.println("Cart is empty.");
			return;
		}

		double total = 0;

		for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {

			Product p = products.get(entry.getKey());
			int quantity = entry.getValue();

			total += p.getPrice() * quantity;
		}

		Order order = new Order(orderId++, total);
		orderHistory.add(order);

		cart.clear();

		System.out.println("Order placed successfully.");
		System.out.println("Total Amount: " + total);
	}

	static void viewOrderHistory() {

		if (orderHistory.isEmpty()) {
			System.out.println("No orders yet.");
			return;
		}

		for (Order order : orderHistory) {
			System.out.println(order);
		}
	}

	public static void main(String[] args) {

		int choice;

		do {
			System.out.println("\n--- SHOPPING CART ---");
			System.out.println("1. Add Product");
			System.out.println("2. Display Products");
			System.out.println("3. Add To Cart");
			System.out.println("4. View Cart");
			System.out.println("5. Remove From Cart");
			System.out.println("6. Place Order");
			System.out.println("7. View Order History");
			System.out.println("0. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				addProduct();
				break;

			case 2:
				displayProducts();
				break;

			case 3:
				addToCart();
				break;

			case 4:
				viewCart();
				break;

			case 5:
				removeFromCart();
				break;

			case 6:
				placeOrder();
				break;

			case 7:
				viewOrderHistory();
				break;

			case 0:
				System.out.println("Thank you!");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 0);
	}
}

