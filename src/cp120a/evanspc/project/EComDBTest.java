package cp120a.evanspc.project;

import static org.junit.Assert.*;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.javafx.collections.MappingChange.Map;

public class EComDBTest {

	public static void main(String[] args) {
		// main for error checking
//		System.out.println("Original customer id " + Customer.idCounter);
//		Customer cust = new Customer(null, null, null, null, null);
//		cust.incId();
//		System.out.println("Customer id after calling incId " + Customer.idCounter);
//		int id = cust.getId();
//		System.out.println("Customer id after calling getId" + id);
//
//		Enumeration<String> names;
//		String str;
//		Hashtable<String, String> product = new Hashtable();
//		product.put("SKU1111", "iphone7");
//		product.put("SKU2222", "galaxyS7");
//
//		names = product.keys();
//		while (names.hasMoreElements()) {
//			str = (String) names.nextElement();
//			System.out.println(str + ": " + product.get(str));
//		}
//		
//		//how to create and search for customers?  Hash map with ID as key
//		HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();
//		Customer jack = new Customer("Jack", null, null, null, null);
//		customers.put(id, jack);
//		
//		String e = customers.get(id).getFirstName();
//		System.out.println("retrieved customer " + e);
	}

	// TODO create these static object
	private static final Customer Jack = null;
	private static final Customer Jill = null;
	private static final Product iphoneS7 = null;
	private static final Product samsungS7 = null;
	private static EComDB edb;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		edb = new EComDB();
		edb.addCustomer(Jack);
		edb.addCustomer(Jill);
		//UNDO
//		edb.addProduct(samsungS7);
//		edb.addProduct(iphoneS7);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearchById() {

		fail("Not yet implemented");
	}

	@Test
	public void testAddCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchBySku() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveProduct() {
		fail("Not yet implemented");
	}

}
