package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entitiesenum.OrderStatus;

public class Order {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> item = new ArrayList<>();
	
	public Order() {
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	public void addItem (OrderItem items) {
		item.add(items);
	}
	public void removeItem (OrderItem items) {
		item.remove(items);
	}
	
	public double total() {
		double sum = 0;
		for(OrderItem i : item) {
			sum += i.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(fmt.format(moment)+"\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append(client);
		sb.append("Order items: \n");
		for(OrderItem i : item) {
			sb.append(i);
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	
	}
	
}
