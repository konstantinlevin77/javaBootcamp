package business.concretes.checkers;

import business.abstracts.*;
import entities.concretes.*;

public class EmailExistingChecker implements UserChecker {
	
	@Override
	public boolean check(User user) {
		System.out.println("E-postanız sistemde bulunmamaktadır!");
		return true;
	}

}
