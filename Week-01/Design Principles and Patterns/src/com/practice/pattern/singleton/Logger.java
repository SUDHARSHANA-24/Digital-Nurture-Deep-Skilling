package com.practice.pattern.singleton;

public class Logger {
	 // Step 1: Create a static variable to store the single object
    private static Logger instance;

    // Step 2: Private constructor so no one can create objects using new
    private Logger() {
        System.out.println("Logger Object Created");
    }

    // Step 3: Public static method to provide access to the object
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    // Normal method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
