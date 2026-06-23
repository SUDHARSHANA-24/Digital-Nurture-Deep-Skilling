package com.practice.solid.lsp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---- Car ----");

        EngineVehicle car = new Car();
        car.startEngine();
        car.move();

        System.out.println();

        System.out.println("---- Bicycle ----");

        Vehicle bicycle = new Bicycle();
        bicycle.move();

	}

}
