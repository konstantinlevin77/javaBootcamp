package business.concretes.checkers;

import business.abstracts.*;
import entities.concretes.*;

public class EmailVerifiedChecker implements UserChecker {

	@Override
	public boolean check(User user) {
		System.out.println("E-mail'iniz başarı ile doğrulandı!");
		return true;
	}
}
