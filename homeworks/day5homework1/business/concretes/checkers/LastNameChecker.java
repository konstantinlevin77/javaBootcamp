package business.concretes.checkers;

import business.abstracts.*;
import entities.concretes.*;

public class LastNameChecker implements UserChecker {

	@Override
	public boolean check(User user) {
		
		if (user.getLastName().length() >= 2) {
			System.out.println("Soyisminizin uzunluğu doğrudur.");
			return true;
		}
		
		System.out.println("Soyisminizin uzunluğu en az iki harf olmalıdır.");
		return false;
	}
}
