package dataAccess.concretes;

import dataAccess.abstracts.*;
import entities.concretes.User;

public class BaseUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı sisteme eklendi: "+user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı sistemden silindi: "+user.getEmail());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: "+user.getEmail());
	}

	@Override
	public User get(int id) {
		// Not implemented yet.
		return null;
	}

	
	
}
