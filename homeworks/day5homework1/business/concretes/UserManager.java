package business.concretes;

import java.util.List;

import business.abstracts.*;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import java.util.List;



public class UserManager implements UserService {

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void add(User user, List<UserChecker> userCheckers,UserChecker finalChecker) {
		
		boolean allValid = true;
		for (UserChecker checker : userCheckers) {
			allValid = checker.check(user);
			if (!allValid) {
				System.out.println("Lütfen eksik/yanlış bölgeleri kontrol ediniz");
				return;
			}
		}
		
		boolean lastCheck = finalChecker.check(user);
		if(lastCheck) {
			System.out.println("Hesabınız başarıyla oluşturuldu!");
			this.userDao.add(user);
			}
	
		
		
		
	}

	@Override
	public void delete(User user) {
				
	}

	@Override
	public void update(User user, List<UserChecker> userCheckers) {
				
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}
	
	
	
}
