package cp120a.evanspc.project;

public class Product {
	private String sku;
	private String name;
	private String desc;
	private double price;
	private long quantityOnHand;
	public Product (String sku, String name, String desc, double price, long quantityOnHand) {
		this.sku = sku;
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		
	}
}
