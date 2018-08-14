package com.diogo.trabalhofinal.trabalhofinalb.services;

public class EmailSender {
	
	public final static String FROM_EMAIL = "teste@gmail.com";
	public final static String PASSWORD_EMAIL = "abc123";
	
	public static void send(String toEmail,String subject, String body) {
		EmailConfig config = new EmailConfig();
		config.sendEmail(FROM_EMAIL,PASSWORD_EMAIL,toEmail,subject,body);
	}
}
