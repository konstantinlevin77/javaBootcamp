package homeworks.day4.homework1.entities;

import java.util.Date;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private Date birthOfDate;
	public String nationalIdentity;
	
	public Customer() {
		
	}
	
	public Customer(int id,String firstName,String lastName, Date birthOfDate, String nationalIdentity) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.nationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	
	

}
