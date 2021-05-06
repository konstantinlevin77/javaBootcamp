package business.concretes.checkers;

import business.abstracts.*;
import entities.concretes.*;

import java.util.regex.Pattern;

public class EmailPatternChecker implements UserChecker{
	
	private static final String EMAIL_PATTERN = 
			/*
			 * @ işaretine kadar belirtilen karakterler olabilir daha sonra @ işareti
			 * @ işaretinden sonra belirtilen karakterler olabilir onlardan sonra nokta
			 * noktadan sonra belirlenen kısaltmalar
			 * ve kısaltmalardan sonra da belki ülke kodu olabilir (iki harflilerdir)
			 * anlamlı regex patterni
			 */
			"^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	@Override
	public boolean check(User user) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
				Pattern.CASE_INSENSITIVE);
		
		boolean result = pattern.matcher(user.getEmail()).find(); 
		if (result) {
			System.out.println("E-mail'iniz geçerli bir epostadır.");
			return true;
		}
		System.out.println("E-postanız geçerli bir eposta değildir.");
		return false;
	}
	
	

}
