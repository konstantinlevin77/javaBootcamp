package business.concretes;

import java.util.List;

import business.abstracts.*;
import entities.concretes.Product;
import entities.concretes.User;
import dataAccess.abstracts.*;
import core.abstracts.*;



public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	// Constructor based dependency injection
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	
	@Override
	public void add(Product product,Logger logger) {
		if(product.getCategoryId() == 2) {
			System.out.println("This category can't accept more products.");
			return;
		}
		this.productDao.add(product);
		logger.log("Added prdouct -> "+product.getName());
		
	}

	@Override
	public void delete(Product product,Logger logger) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		
	}

	@Override
	public void update(Product product, Logger logger) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		
	}

	@Override
	public User get(int id, Logger logger) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		return null;
	}

	@Override
	public List<User> getAll(Logger logger) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		return null;
	}
	
	

}
