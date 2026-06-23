package com.practice.pattern.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Logger logger1 = Logger.getInstance();

	        logger1.log("Application Started");

	        Logger logger2 = Logger.getInstance();

	        logger2.log("User Logged In");

	        Logger logger3 = Logger.getInstance();

	        logger3.log("Application Closed");

	        System.out.println();

	        System.out.println(logger1);
	        System.out.println(logger2);
	        System.out.println(logger3);

	        System.out.println();

	        System.out.println(logger1 == logger2);
	        System.out.println(logger2 == logger3);
	}

}
