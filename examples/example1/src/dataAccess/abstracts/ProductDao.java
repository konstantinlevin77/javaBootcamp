package dataAccess.abstracts;

import entities.concretes.*;
import java.util.List;

public interface ProductDao {
	
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	Product getProduct(int id);
	List<Product> getProducts(List<Integer> idList);

}
