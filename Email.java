package com.exception;

public class Email {
	public static void main(String[] args) throws EmailException {
		try {
			String mail="dgmail.com";
			String name="Dhivya";
			if(mail.contains("@")) {
				System.out.println("Valid mail id");
				}else {
					throw new EmailException("Invalid mail id");
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
