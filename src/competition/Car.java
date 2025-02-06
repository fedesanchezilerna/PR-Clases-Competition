package competition;

public class Car {
    private static int nextId = 1;
    private Driver driver;
    private String brand;
    private String model;
    private short year;
    private Fuel fuel;
    private short cc;
    private byte doors;
    private byte wheels;
    private byte seats;
    private int points;
    private String id;

    public Car(Driver driver, String brand, String model, short year, Fuel fuel, short cc) {
        this.driver = driver;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.cc = cc;
        this.doors = 3;
        this.wheels = 5;
        this.seats = 4;
        this.points = 0;
        this.id = generateId();
    }

    public Car(Driver driver, String brand, String model, short year, Fuel fuel, short cc, byte doors, byte wheels, byte seats, int points) {
        this.driver = driver;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.cc = cc;
        this.doors = doors;
        this.wheels = wheels;
        this.seats = seats;
        this.points = points;
        this.id = generateId();
    }

    private String generateId() {
        String code = "CAR" + String.format("%04d", nextId++);
        String x = brand.substring(0, 1).toUpperCase();
        String y = model.substring(0, 1).toUpperCase();
        return code + x + y;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        this.id = generateId();  // Update ID when brand changes
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        this.id = generateId();  // Update ID when model changes
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public short getCc() {
        return cc;
    }

    public void setCc(short cc) {
        this.cc = cc;
    }

    public byte getDoors() {
        return doors;
    }

    public void setDoors(byte doors) {
        this.doors = doors;
    }

    public byte getWheels() {
        return wheels;
    }

    public void setWheels(byte wheels) {
        this.wheels = wheels;
    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public static String getIdNext() {
        return "CAR" + String.format("%04d", nextId);
    }

    @Override
    public String toString() {
        return String.format("%-10s %-12s %-8s %-6d %-8s %-6d %-3d %-3d %-3d %-3d %-20s %s",
                id, brand, model, year, fuel, cc, doors, wheels, seats, points, driver.getName(), driver.getId());
    }
}