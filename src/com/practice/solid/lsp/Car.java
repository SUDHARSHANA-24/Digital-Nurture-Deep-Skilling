package com.practice.solid.lsp;

public class Car extends EngineVehicle{
	@Override
    public void move() {
        System.out.println("Car is moving");
    }
}
