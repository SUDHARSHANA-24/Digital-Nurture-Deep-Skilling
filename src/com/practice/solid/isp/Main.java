package com.practice.solid.isp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human();

        human.work();
        human.eat();

        System.out.println();

        Robot robot = new Robot();

        robot.work();
	}

}
