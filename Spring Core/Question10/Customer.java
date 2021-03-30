import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Customer implements ApplicationContextAware{
	private int customerId;
	private String customerName;
	private int customerContact;
	private Address customerAddress;
	private ApplicationContext context =null;
	
	
	public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public Address getcustomerAddress() {
		return customerAddress;
	}

	/*
	 * public void setcustomerAddress(Address customerAddress) {
	 * this.customerAddress = customerAddress; }
	 */
	public int getcustomerId() {
		return customerId;
	}

	/*
	 * public void setcustomerId(int customerId) { this.customerId = customerId; }
	 */
	public String getcustomerName() {
		return customerName;
	}

	/*
	 * public void setcustomerName(String customerName) { this.customerName =
	 * customerName; }
	 */
	public int getcustomerContact() {
		return customerContact;
	}

	/*
	 * public void setcustomerContact(int customerContact) { this.customerContact =
	 * customerContact; }
	 */
	public void draw() {
		System.out.println("Customer ID is: "+customerId+"\nName of the Customer is: "+customerName+"\nContact of the Customer is: "+customerContact);
		System.out.println("The Address of the Customer : "+"\n\t\t\t Street: "+customerAddress.getStreet()+"\n\t\t\t City: "+customerAddress.getCity()+"\n\t\t\t State: "+customerAddress.getState()+"\n\t\t\t Zip: "+customerAddress.getZip()+"\n\t\t\t Country: "+customerAddress.getCountry());
	}
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("Yeah! I got context");
		
	}
}
