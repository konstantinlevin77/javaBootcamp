package business.concretes.checkers;

import business.abstracts.*;
import entities.concretes.*;

public class PasswordChecker implements UserChecker {

	@Override
	public boolean check(User user) {
		
		if (user.getPassword().length() >= 6) {
			System.out.println("Şifreniz doğru uzunlukta");
			return true;
		}
		System.out.println("Şifreniz 6 hane veya daha uzun olmalıdır.");
		return false;
		
		
	}
} 
