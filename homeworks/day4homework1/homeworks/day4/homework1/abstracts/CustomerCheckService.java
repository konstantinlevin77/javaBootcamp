package homeworks.day4.homework1.abstracts;

import homeworks.day4.homework1.entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);
	
}
