package competition.tests;

import competition.Car;
import competition.Driver;
import competition.Fuel;
import competition.Race;

public class RaceTest {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Lewis Hamilton");
        Car car1 = new Car(driver1, "Mercedes", "M10", (short) 2010, Fuel.PETROL, (byte) 1600);
        Driver driver2 = new Driver("Sebastian Vettel");
        Car car2 = new Car(driver2, "Ferrari", "SF1", (short) 2010, Fuel.PETROL, (byte) 1600);

        Car[] cars = {car1, car2};
        Race race = new Race(cars);

        race.startRace(); // Simulate race
        System.out.println(race); // Display race results

        System.out.println("Race Next ID: " + Race.getIdNext());
    }
}
