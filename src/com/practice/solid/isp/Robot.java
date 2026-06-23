package com.practice.solid.isp;

public class Robot implements Workable {
	@Override
    public void work() {
        System.out.println("Robot is working");
    }
}
