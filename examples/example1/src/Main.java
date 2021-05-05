import entities.concretes.Product;
import entities.concretes.User;

import business.concretes.*;
import dataAccess.concretes.*;
import core.concretes.*;
import core.abstracts.*;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,16,"konstantinlevin76","bruh@bruhmail.com","Mehmet","Tekman","sifre312");
		Product product1 = new Product(1,1,"Muz","LevinMarket",20,300);
		Logger logger = new DatabaseLogger();
		
		ProductManager productManager = new ProductManager(new MehmetnateProductDao());
		UserManager userManager = new UserManager(new HibernateUserDao());
		
		productManager.add(product1, logger);
		userManager.add(user1, logger);
		

	}

}
