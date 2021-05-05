package business.abstracts;

import java.util.*;
import entities.concretes.*;
import core.abstracts.*;

public interface ProductService {
	
	public void add(Product product,Logger logger);
	public void delete(Product product,Logger logger);
	public void update(Product product,Logger logger);
	public User get(int id,Logger logger);
	public List<User> getAll(Logger logger);

}
