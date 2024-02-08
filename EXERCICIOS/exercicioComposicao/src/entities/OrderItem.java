package entities;

public class OrderItem {

	private Integer quantity;
	private double price;
	
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName());
		sb.append(", $");
		sb.append(String.format("%.2f", price));
		sb.append(", Quantity: ");
		sb.append(quantity + ", ");
		sb.append("Subtotal: $");
		sb.append(String.format("%.2f", subTotal())+"\n");
		return sb.toString();
	}
	
	
}
