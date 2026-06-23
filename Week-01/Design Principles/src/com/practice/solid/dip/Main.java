package com.practice.solid.dip;

public class Main {
	 public static void main(String[] args) {

	        Keyboard keyboard = new WiredKeyboard();

	        Computer computer =new Computer(keyboard);

	        computer.start();
	    }
}
