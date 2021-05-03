package examples.example1.entities;

import examples.example1.abstracts.*;

public class CorporateCustomer extends BaseCustomer{
	
	private String companyIdentityNumber;
	
	public CorporateCustomer() {
		
	}
	
	public CorporateCustomer(int id,String email,String password,String companyIdentityNumber) {
		super(id,email,password);
		this.companyIdentityNumber = companyIdentityNumber;
	}
	
	public String getCompanyIdentityNumber() {
		return companyIdentityNumber;
	}
	
	public void setCompanyIdentityNumber(String companyIdentityNumber) {
		this.companyIdentityNumber = companyIdentityNumber;
	}

}
