package adapters;

import googleLogin.JGoogleLogin;
import business.abstracts.*;

public class GoogleLoginAdapter implements LoginService{

	@Override
	public void logIn(String email,String password) {
		JGoogleLogin jGoogleLogin = new JGoogleLogin();
		jGoogleLogin.logInWithGoogle();
		
	}
	
}
