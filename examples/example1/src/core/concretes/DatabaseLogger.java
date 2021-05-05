package core.concretes;

import core.abstracts.*;

public class DatabaseLogger implements Logger {
	
	public void log(String message) {
		System.out.println("Database logged: "+message);
	}
}
