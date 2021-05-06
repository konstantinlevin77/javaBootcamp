package business.concretes.checkers;

import business.abstracts.*;
import entities.concretes.*;

public class FirstNameChecker implements UserChecker  {
	
	@Override
	public boolean check(User user) {
		if(user.getFirstName().length() >= 2) {
			System.out.println("İsminiz doğru uzunlukta");
			return true;
		}
		
		System.out.println("İsminiz en az iki harf olmalıdır");
		return false;
	}

}
