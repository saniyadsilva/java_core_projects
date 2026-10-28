package core;

class Product {
	private String productId;
	private String name;
	private int quantity;
	private double price;

	Product(String productId, String name) {
		this.productId = productId;
		this.name = name;
	}

	public String getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int q) {
		if (q >= 0) {
			this.quantity = q;
		}
	}

	void displayProductDetails() {
		System.out.println("name is: " + name + "\nProduct id is: " + productId + "\nprice is set for: " + price
				+ "\n with a quantity of: " + quantity);
	}

}

public class InventoryManagementSystem {

	public static void main(String[] args) {
		Product p = new Product("201", "Rice");
		Product p1 = new Product("202", "Jaggery");
		p.setPrice(456.098);
		p.getPrice();
		p.setQuantity(45);
		p.getQuantity();
		p.displayProductDetails();

		p1.setPrice(-45);
		p1.getPrice();
		p1.setQuantity(-78);
		p1.getQuantity();
		p1.displayProductDetails();
	}

}
