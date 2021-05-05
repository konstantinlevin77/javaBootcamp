package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.*;
import entities.concretes.User;

public class MehmetnateUserDao  implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Mehmetnate used, added to the database: "+user.getUsername());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Mehmetnate used, deleted from the database: "+user.getUsername());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Mehmetnate used, updated the database: "+user.getUsername());
		
	}

	@Override
	public User getUser(int id) {
		System.out.println("Mehmetnate used, got user: "+id);
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
