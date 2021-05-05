package dataAccess.abstracts;

import entities.concretes.*;
import java.util.List;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	User getUser(int id);
	List<User> getUsers(List<Integer> idList);

}
