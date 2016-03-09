package cp120a.evanspc.project;

public class Address {
	private String stNo;
	private String stName;
	private String state;
	private String city;
	private String zip;
	
	public Address(String streetNo, String streetName, String stateName, String cityName, String zipCode) {
		stNo = streetNo;
		stName = streetName;
		state = stateName;
		city = cityName;
		zip = zipCode;
	}
}