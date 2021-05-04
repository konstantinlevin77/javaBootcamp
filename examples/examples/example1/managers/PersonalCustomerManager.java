package examples.example1.managers;
import examples.example1.entities.*;


public class PersonalCustomerManager extends CustomerManager {
	
	
	public void addUser(PersonalCustomer customer) {
		super.add(customer);
		System.out.println("\n"+customer.getFirstName()+
				"\n"+customer.getLastName()+
				"\n"+customer.getNationalIdentity()
				+"\n"+customer.getAge());
	}
	
	public void deleteUser(PersonalCustomer customer) {
		super.delete(customer);
		System.out.println("\n"+customer.getFirstName()+
				"\n"+customer.getLastName()+
				"\n"+customer.getNationalIdentity()
				+"\n"+customer.getAge());
	}
	
	public void updateUser (PersonalCustomer customer) {
		super.update(customer);
		System.out.println("\n"+customer.getFirstName()+
				"\n"+customer.getLastName()+
				"\n"+customer.getNationalIdentity()
				+"\n"+customer.getAge());
	}

}
