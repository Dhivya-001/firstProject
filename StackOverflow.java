package com.exception;

public class StackOverflow {
	public static void methodA() {
		 methodB();
	}
	public static void methodB() {
		methodA();
	}

}
