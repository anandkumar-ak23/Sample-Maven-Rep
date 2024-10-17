package com.package1;

import java.util.ResourceBundle;

public class App {
	
	public int userVerification(String un, String pwd) {
		
		ResourceBundle rb= ResourceBundle.getBundle("config");
		
		String userName=rb.getString("username");
		String p= rb.getString("password");
		
		if(un.equals(userName) && pwd.equals(p)) {
			return 1;
		}
		else return 0;
		
	}
}
