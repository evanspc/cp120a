package cp120a.evanspc.project;

public class Address {
	private String stNo;
	private String stName;
	private String state;
	private String city;
	private String zip;
	
	public Address(String streetNo, String streetName, String stateName, String cityName, String zipCode) {
		setStNo(streetNo);
		setStName(streetName);
		setState(stateName);
		setCity(cityName);
		setZip(zipCode);
	}

	public static void main(String[] args) {
		
		
	}
	
	
	public String getStNo() {
		return stNo;
	}

	public void setStNo(String stNo) {
		this.stNo = stNo;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}