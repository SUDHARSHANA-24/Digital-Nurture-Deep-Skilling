package com.practice.solid.dip;

public class WiredKeyboard implements Keyboard {
	@Override
    public void type() {
        System.out.println("Typing using Wired Keyboard");
    }
}
