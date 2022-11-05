package com.exception;

public class Age {

	public static void main(String[] args) throws AgeException {
		try {
			int age=20;
			String name="Anitha";
			if(age<=18) {
				throw new AgeException("Not eligible");
			}else {
				System.out.println("Eligible");
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
