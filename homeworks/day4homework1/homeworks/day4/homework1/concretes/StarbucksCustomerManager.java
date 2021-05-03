package homeworks.day4.homework1.concretes;

import homeworks.day4.homework1.abstracts.BaseCustomerManager;
import homeworks.day4.homework1.abstracts.CustomerCheckService;
import homeworks.day4.homework1.entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public CustomerCheckService getCustomerCheckService() {
		return this.customerCheckService;
	}
	
	public void setCustomerCheckService(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void save(Customer customer) {
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			throw new IllegalArgumentException("Person is not valid.");
		}
		
	}
	


}
