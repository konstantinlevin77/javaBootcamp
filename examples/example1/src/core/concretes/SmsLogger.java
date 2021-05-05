package core.concretes;

import core.abstracts.*;

public class SmsLogger implements Logger{
	
	public void log(String message) {
		System.out.println("Sms logged: "+message);
	}
	

}
