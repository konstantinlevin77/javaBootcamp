package examples.example1.managers;

import examples.example1.abstracts.BaseCustomer;

public class CustomerManager{

	// Protected olduğu zaman aynı package'deki subclass bu metoda erişebiliyor ama 
	// class'ın dışından erişilemiyor.
	protected void add(BaseCustomer customer) {
		System.out.println("Özellikler kaydedildi:\n"+customer.getEmail()+"\n"+customer.getId()+"\n"+customer.getPassword());
		
	}

	protected void delete(BaseCustomer customer) {
		System.out.println("Özellikler silindi:\n"+customer.getEmail()+"\n"+customer.getId()+"\n"+customer.getPassword());

		
	}
	protected void update(BaseCustomer customer) {
		System.out.println("Özellikler güncellendi:\n"+customer.getEmail()+"\n"+customer.getId()+"\n"+customer.getPassword());
		
	}

}
