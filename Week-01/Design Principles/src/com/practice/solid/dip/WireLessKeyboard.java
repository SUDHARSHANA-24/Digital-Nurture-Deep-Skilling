package com.practice.solid.dip;

public class WireLessKeyboard implements Keyboard {
	@Override
    public void type() {
        System.out.println("Typing using Wired Keyboard");
    }
}
