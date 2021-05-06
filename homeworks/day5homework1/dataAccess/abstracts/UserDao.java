package dataAccess.abstracts;

import entities.concretes.*;

public interface UserDao {
	
	public void add(User user);
	public void delete(User user);
	public void update(User user);
	public User get(int id);
	
	

}
