package business.concretes;

import business.abstracts.*;


public class LoginManager implements LoginService{

	@Override
	public void logIn(String email,String password) {
		System.out.println("Başarı ile giriş yapıldı!");
		
	}
}
