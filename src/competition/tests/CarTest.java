package competition.tests;

import competition.Car;
import competition.Driver;
import competition.Fuel;

public class CarTest {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Lewis Hamilton");
        Driver driver2 = new Driver("Fernando Alonso");

        Car car1 = new Car(driver1, "Mercedes", "W11", (short) 2010, Fuel.HYBRID, (short) 1600);
        Car car2 = new Car(driver2, "Ferrari", "SF1", (short) 2010, Fuel.HYBRID, (short) 1600, (byte) 2, (byte) 2, (byte) 1, 0);

        System.out.println(car1);
        System.out.println(car2);

        car1.setBrand("Mercedes RT");
        System.out.println("\nCar 1 Brand updated: " + car1.getBrand());
        System.out.println("Car 1 ID updated: " + car1.getId());
        car1.setModel("W12");
        System.out.println("\nCar 1 Model updated: " + car1.getModel());
        System.out.println("Car 1 ID updated: " + car1.getId());
        System.out.println(car1);
        System.out.println(car1);
        System.out.println(car1);

        System.out.println("Next Car ID: " + Car.getIdNext());
    }
}
