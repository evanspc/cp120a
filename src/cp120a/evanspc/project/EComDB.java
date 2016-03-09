package cp120a.evanspc.project;

import java.util.HashMap;
import java.util.Hashtable;

public class EComDB {

	// TODO choose a collection data structure to store Customer and Product
	// Products in a hashtable with sku as key
	// Hashtable product = new Hashtable();

	public Customer searchById(String id) {
		return null;
	}

	public void addCustomer(Customer c) {
		Customer cust = new Customer(null, null, null, null, null);
		int id = cust.getId();
		HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();
		//this doesn't work customers.put(new Customer(customers.getId(), c));
		customers.put(id, c);
	}

	public void removeCustomer(String id) {

	}

	public Product searchBySku(String sku) {
		return null;
	}

	public void addProduct(Product p) {

	}

	public void removeProduct(String sku) {

	}

}