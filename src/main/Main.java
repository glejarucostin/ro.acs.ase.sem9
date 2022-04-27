package main;

import decorator.Car;
import decorator.VehicleWithHeating;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("red", 300, 4);
        car.start();
        car.stop();

        VehicleWithHeating carWithHeating=new VehicleWithHeating(car);
        carWithHeating.start();
        carWithHeating.stop();
        carWithHeating.activateHeating();
        carWithHeating.deactivateHeating();
    }
}
