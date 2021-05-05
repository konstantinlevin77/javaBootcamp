package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.*;
import entities.concretes.Product;

public class MehmetnateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Mehmetnate used, added to the database: "+product.getName());
		
	}

	@Override
	public void delete(Product product) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		
	}

	@Override
	public void update(Product product) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		
	}

	@Override
	public Product getProduct(int id) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		return null;
	}

	@Override
	public List<Product> getProducts(List<Integer> idList) {
		// This is just a simulation to understand how n-layer architectures work. Not implemented yet.
		return null;
	}
	

}
