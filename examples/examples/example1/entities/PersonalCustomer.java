package examples.example1.entities;

import examples.example1.abstracts.*;

public class PersonalCustomer extends BaseCustomer {
	
	private String firstName;
	private String lastName;
	private int age;
	private String nationalIdentity;
	
	public PersonalCustomer() {
		
	}
	
	public PersonalCustomer(int id,String email,String password,String firstName,String lastName,
			int age,String nationalIdentity) 
	{
		super(id,email,password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.nationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	
	
	
	
}
