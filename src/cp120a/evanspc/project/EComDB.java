package cp120a.evanspc.project;

import java.util.HashMap;
import java.util.Hashtable;

public class EComDB {

	// TODO choose a collection data structure to store Customer and Product

	// Customers in a HashMap with ID as key, and Customer object as value
	HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();

	// Products in a hashtable with sku as key
	Hashtable<String, Product> products = new Hashtable<String, Product>();
	
	public static void main(String[] args) {
		
		
	}
	
	public Customer searchById(String id) {
		return customers.get(id);
		// alternatively, could use boolean containsKey but would have to cast
		// return value
	}

	public void addCustomer(Customer c) {
		// generation of id needs to go in constructor of Customer, but how?
		Customer cust = new Customer(null, null, null, null, null);
		int id = cust.getId();

		customers.put(id, c);
	}

	public void removeCustomer(String id) {
		customers.remove(id);

	}

	public Product searchBySku(String sku) {
		return null;
	}

	public void addProduct(Product p) {
		Product prod = new Product(null, null, null, 0, 0);
		String sku = prod.getSku();
		products.put(sku, p);
	}

	public void removeProduct(String sku) {
		products.remove(sku);
	}

}