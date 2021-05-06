import entities.concretes.*;
import dataAccess.concretes.*;
import business.concretes.*;
import business.concretes.checkers.EmailExistingChecker;
import business.concretes.checkers.EmailPatternChecker;
import business.concretes.checkers.EmailVerifiedChecker;
import business.concretes.checkers.FirstNameChecker;
import business.concretes.checkers.LastNameChecker;
import business.concretes.checkers.PasswordChecker;
import business.abstracts.*;
import java.util.*;
import adapters.GoogleLoginAdapter;


public class Main {

	public static void main(String[] args) {
		User mehmet = new User(1,"Mehmet","Tekman","mehmet@.com","123456");
		
		UserManager userManager = new UserManager(new BaseUserDao());
		
		List<UserChecker> userCheckers = new ArrayList<UserChecker>();
		userCheckers.add(new EmailExistingChecker());
		userCheckers.add(new EmailPatternChecker());
		userCheckers.add(new FirstNameChecker());
		userCheckers.add(new LastNameChecker());
		userCheckers.add(new PasswordChecker());
		
		userManager.add(mehmet, userCheckers,new EmailVerifiedChecker());
		
		LoginService loginManager = new LoginManager();
		loginManager.logIn("tekmanmehmet@gmail.com","1232");
		
		LoginService googleLogin = new GoogleLoginAdapter();
		googleLogin.logIn("tekmanmehmet@gmail.com", "1234");
				
	}

}
