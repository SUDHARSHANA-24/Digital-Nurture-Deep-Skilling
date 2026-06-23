package com.practice.solid.ocp;

public class Cash implements Payment {
	
	@Override
    public void pay() {
        System.out.println("Cash Payment Successful");
    }
}
