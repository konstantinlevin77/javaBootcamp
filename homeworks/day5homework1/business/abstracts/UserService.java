package business.abstracts;

import entities.concretes.*;
import java.util.List;

public interface UserService {
	
	public void add(User user,List<UserChecker> checkers,UserChecker finalChecker);
	public void delete(User user);
	public void update(User user,List<UserChecker> checkers); 
	public User get(int id);
	public List<User> getAll();
	
}
