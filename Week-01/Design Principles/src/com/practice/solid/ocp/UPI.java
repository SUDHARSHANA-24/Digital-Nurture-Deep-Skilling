package com.practice.solid.ocp;

public class UPI implements Payment {
	@Override
    public void pay() {
        System.out.println("UPI Payment Successful");
    }
}
