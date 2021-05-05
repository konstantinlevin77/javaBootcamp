package business.abstracts;


import core.abstracts.*;
import entities.concretes.*;
import java.util.*;

public interface UserService{
	
	void add(User user,Logger logger);
	void update(User user,Logger logger);
	void delete(User user,Logger logger);
	User get(int id,Logger logger);
	List<User> getALl(Logger logger);
	

}
