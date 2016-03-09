package cp120a.evanspc.project;

public class Customer {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private Address billingAddress;
	private Address shippingAddress;
	private int id;

	public Customer(String first, String last, String email, Address billing, Address shipping) {
		setFirstName(first);
		setLastName(last);
		setEmailAddress(email);
		setBillingAddress(billing);
		setShippingAddress(shipping);
		// get current id to add to record
		id = getId();
	}

	public static void main(String[] args) {
		//
		
	}
	// counter var
	public static int idCounter = 1;

	public void incId() {
		idCounter++;
	}

	// better not to be public, should be done in constructor
	public int getId() {
		return idCounter;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}