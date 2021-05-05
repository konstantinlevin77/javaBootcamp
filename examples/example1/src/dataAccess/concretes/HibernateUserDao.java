package dataAccess.concretes;
import java.util.List;

import dataAccess.abstracts.*;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate used, added to the database: "+user.getUsername());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate used, deleted from the database: "+user.getUsername());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate used, updated the database: "+user.getUsername());
		
	}

	@Override
	public User getUser(int id) {
		// This is just a simulation to learn how n-layer software architectures work.
		System.out.println("Hibernate used, user got: "+id);
		return null;
	}

	@Override
	public List<User> getUsers(List<Integer> idList) {
		for (int id : idList) {
			this.getUser(id);
		}
		return null;
	}

}
