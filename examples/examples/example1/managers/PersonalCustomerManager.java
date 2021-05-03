package examples.example1.managers;

import examples.example1.abstracts.*;
import examples.example1.entities.*;

public class PersonalCustomerManager extends BaseCustomerManager {
	
	
	public void add(PersonalCustomer customer) {
		super.add(customer);
		System.out.println("\n"+customer.getFirstName()+
				"\n"+customer.getLastName()+
				"\n"+customer.getNationalIdentity()
				+"\n"+customer.getAge());
	}
	
	public void delete(PersonalCustomer customer) {
		super.delete(customer);
		System.out.println("\n"+customer.getFirstName()+
				"\n"+customer.getLastName()+
				"\n"+customer.getNationalIdentity()
				+"\n"+customer.getAge());
	}
	
	public void update(PersonalCustomer customer) {
		super.update(customer);
		System.out.println("\n"+customer.getFirstName()+
				"\n"+customer.getLastName()+
				"\n"+customer.getNationalIdentity()
				+"\n"+customer.getAge());
	}

}
