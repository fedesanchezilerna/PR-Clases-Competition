package competition;

import java.util.Random;

public class Race {
    private Car[] cars;
    private String id;
    private static int idNext = 1;

    public Race(Car[] cars) {
        this.cars = cars;
        this.id = generateId();
    }

    private String generateId() {
        return String.format("RAC%03d-%d", idNext++, cars.length);
    }

    public void startRace() {
        Random random = new Random();
        for (Car car : cars) {
            int points = random.nextInt(100) + 1;
            car.setPoints(car.getPoints() + points);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Race ").append(id).append("\n");
        sb.append(
                String.format("%-10s %-12s %-8s %-6S %-8s %-6S %-3S %-3S %-3S %-3S %s",
                        "ID", "BRAND", "MODEL", "YEAR", "FUEL", "cc", "D.", "W.", "S.", "P.", "DRIVER\n"));
        for (Car car : cars) {
            sb.append(car.toString()).append("\n");
        }

        return sb.toString();
    }

    // Getters and setters
    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
        this.id = generateId(); // Update ID when cars array changes
    }

    public String getId() {
        return id;
    }

    public static String getIdNext() {
        return String.format("RAC%03d", idNext);
    }
}
