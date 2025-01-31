package competition.tests;

import competition.Driver;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver = new Driver("Lewis Hamilton");
        System.out.println(driver); // Test toString()

        // Test getters and setters
        System.out.println("Driver ID: " + driver.getId());
        System.out.println("Next ID: " + Driver.getIdNext());

        driver.setName("Sebastian Vettel");
        System.out.println("Updated Driver: " + driver);
    }
}
