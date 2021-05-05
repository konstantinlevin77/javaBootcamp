package business.concretes;

import java.util.List;

import business.abstracts.*;
import entities.concretes.User;
import dataAccess.abstracts.*;
import core.abstracts.*;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	@Override
	public void add(User user,Logger logger) {
		// Don't forget that this is just a simulation
		if (user.getUsername() == "konstantinlevin77") {
			System.out.println("This username is already taken, please try another one.");
			return;
		}
		this.userDao.add(user);
		logger.log("Added user -> "+user.getUsername());
				
		
	}

	@Override
	public void update(User user,Logger logger) {
		// Not implemented
		
	}

	@Override
	public void delete(User user, Logger logger) {
		// Not implemented
		
	}


	@Override
	public User get(int id, Logger logger) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		return null;
	}


	@Override
	public List<User> getALl(Logger logger) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		return null;
	}

}
