package homeworks.day4.homework1.abstracts;

import homeworks.day4.homework1.entities.Customer;

public class BaseCustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}
