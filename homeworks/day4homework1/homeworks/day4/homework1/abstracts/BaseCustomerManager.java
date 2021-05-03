package homeworks.day4.homework1.abstracts;
import homeworks.day4.homework1.entities.*;

public class BaseCustomerManager implements CustomerManager{

	@Override 
	public void save(Customer customer) {
		System.out.println("Saved to the database: "+customer.getFirstName());
		
	}
}
