package examples.example1.abstracts;

public class BaseCustomerManager implements CustomerManager{

	@Override
	public void add(BaseCustomer customer) {
		System.out.println("Özellikler kaydedildi:\n"+customer.getEmail()+"\n"+customer.getId()+"\n"+customer.getPassword());
		
	}

	@Override
	public void delete(BaseCustomer customer) {
		System.out.println("Özellikler silindi:\n"+customer.getEmail()+"\n"+customer.getId()+"\n"+customer.getPassword());

		
	}

	@Override
	public void update(BaseCustomer customer) {
		System.out.println("Özellikler güncellendi:\n"+customer.getEmail()+"\n"+customer.getId()+"\n"+customer.getPassword());
		
	}

}
