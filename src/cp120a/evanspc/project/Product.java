package cp120a.evanspc.project;

public class Product {

	private String sku;
	private String name;
	private String desc;
	private double price;
	private long quantityOnHand;

	public Product(String sku, String name, String desc, double price, long quantityOnHand) {
		this.sku = sku;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.quantityOnHand = quantityOnHand;

	}

	public static void main(String[] args) {
		
		
	}
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(long quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
}
