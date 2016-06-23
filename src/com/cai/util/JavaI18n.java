package com.cai.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class JavaI18n {

	
	public static void main(String[] args) {
		
		Locale local=new Locale("tr");
		ResourceBundle myMessages = ResourceBundle.getBundle("EmailClientMessages",
				local);
				String greetingLabel = myMessages.getString( "greeting");
		System.out.println("greeting:"+greetingLabel);
		
	}
}
