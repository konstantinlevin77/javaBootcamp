package core.concretes;

import core.abstracts.*;

public class EmailLogger implements Logger{
	
	public void log(String message) {
		System.out.println("E-mail logged: "+message);
	}

}
