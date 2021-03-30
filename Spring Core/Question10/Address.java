
public class Address {
	private String street;
	private String city;
	private String state;
	private int zip;
	private String Country;
	
	public Address(String street, String city, String state, int zip, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		Country = country;
	}
	public String getStreet() {
		return street;
	}

	/*
	 * public void setStreet(String street) { this.street = street; }
	 */
	public String getCity() {
		return city;
	}

	/*
	 * public void setCity(String city) { this.city = city; }
	 */
	public String getState() {
		return state;
	}

	/*
	 * public void setState(String state) { this.state = state; }
	 */
	public int getZip() {
		return zip;
	}

	/*
	 * public void setZip(int zip) { this.zip = zip; }
	 */
	public String getCountry() {
		return Country;
	}

	/*
	 * public void setCountry(String Country) { this.Country = Country; }
	 */
	public void draw() {
		System.out.println(street+city+state+zip+Country);
	}

}
