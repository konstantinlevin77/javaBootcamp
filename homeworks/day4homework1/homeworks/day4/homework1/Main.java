package homeworks.day4.homework1;
import homeworks.day4.homework1.concretes.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import homeworks.day4.homework1.abstracts.*;
import homeworks.day4.homework1.entities.*;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new BaseCustomerCheckManager());
		
		
		Date dateOfBirth = new GregorianCalendar(2021,Calendar.JULY,14).getTime();
		Customer customer = new Customer(1,"Mehmet","Blabla",dateOfBirth,"123123");
		customerManager.save(customer);
		

	}

}
