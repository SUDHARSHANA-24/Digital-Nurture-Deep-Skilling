package com.practice.solid.ocp;

public class Card implements Payment{
	@Override
    public void pay() {
        System.out.println("Card Payment Successful");
    }
}
