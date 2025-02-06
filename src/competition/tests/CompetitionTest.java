package competition.tests;

import competition.Car;
import competition.Competition;
import competition.Driver;
import competition.Fuel;

public class CompetitionTest {
    public static void main(String[] args) {

        // Inserción datos
        Driver driver1 = new Driver("Lewis Hamilton");
        Car car1 = new Car(driver1, "Ferrari", "SF25", (short) 2025, Fuel.HYBRID, (byte) 1600);

        Driver driver2 = new Driver("Max Verstappen");
        Car car2 = new Car(driver2, "Red Bull", "RB25", (short) 2025, Fuel.HYBRID, (byte) 1600);

        Driver driver3 = new Driver("Lando Norris");
        Car car3 = new Car(driver3, "McLaren", "MF1", (short) 2025, Fuel.HYBRID, (byte) 1600);

        Driver driver4 = new Driver("Fernando Alonso");
        Car car4 = new Car(driver4, "Aston Martin", "AMRT1", (short) 2025, Fuel.HYBRID, (byte) 1600);

        Driver driver5 = new Driver("Pierre Gasly");
        Car car5 = new Car(driver5, "Alpine", "ALP3", (short) 2025, Fuel.HYBRID, (byte) 1600);

        Driver driver6 = new Driver("Nico Hulkenberg");
        Car car6 = new Car(driver6, "Sauber", "KS25", (short) 2025, Fuel.HYBRID, (byte) 1600);

        Driver driver7 = new Driver("Esteban Ocon");
        Car car7 = new Car(driver7, "Haas", "HS-10", (short) 2025, Fuel.HYBRID, (byte) 1600);

        Driver driver8 = new Driver("Alex Albon");
        Car car8 = new Car(driver8, "Williams", "WWW", (short) 2025, Fuel.HYBRID, (byte) 1600);

        Driver driver9 = new Driver("George Russell");
        Car car9 = new Car(driver9, "Mercedes", "W15", (short) 2025, Fuel.HYBRID, (byte) 1600);

        Driver driver10 = new Driver("Yuki Tsunoda");
        Car car10 = new Car(driver10, "Racin Bulls", "AT-1", (short) 2025, Fuel.HYBRID, (byte) 1600);


        Car[] cars = {car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};

        Competition competition = new Competition(cars, 3);
        System.out.println(competition.startCompetition());
        System.out.println(competition.orderClassification());
    }
}
