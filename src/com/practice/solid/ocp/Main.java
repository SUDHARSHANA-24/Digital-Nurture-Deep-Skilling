package com.practice.solid.ocp;

public class Main {
	public static void main(String[] args) {

        Payment p = new Cash();

        p.pay();
    }
}
