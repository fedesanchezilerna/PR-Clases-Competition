package competition;

import java.util.Arrays;

public class Competition {

    private Car[] cars;
    private Race[] races;
    private int numRaces;

    public Competition(Car[] cars, int numRaces) {
        this.cars = cars;
        this.numRaces = numRaces;
        this.races = new Race[numRaces];

        for (int i = 0; i < numRaces; i++) {
            races[i] = new Race(cars); // All cars participate in all races
        }
    }

    public String startCompetition() {
        StringBuilder results = new StringBuilder();

        for (Race race : races) {
            race.startRace();
            results.append(race.toString()).append("\n");
        }
        return results.toString();
    }

    public String orderClassification() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Classification\n" +
                  "Final Classification:\n");

        // sort descending by points
        Arrays.sort(cars, (car1, car2) -> Integer.compare(car2.getPoints(), car1.getPoints()));

        for (Car car : cars) {
            sb.append(car.toString()).append("\n");
        }

        return sb.toString();
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Race[] getRaces() {
        return races;
    }

    public int getNumRaces() {
        return numRaces;
    }
}
