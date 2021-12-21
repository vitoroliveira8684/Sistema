package entities;

public class OrderItem extends Product {
	
	private Integer quantity;
	
	public OrderItem() {
		super();
	}

	

	public OrderItem(String name, Double price, Integer quantity) {
		super(name, price);
		this.quantity = quantity;
	}



	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return getName()
				+ ", "
				+ getPrice()
				+ ", Quantity: "
				+ getQuantity()
				+ ", Subtotal: "
				+ subTotal();
	}
	
}
