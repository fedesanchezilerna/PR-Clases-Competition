package competition;

public class Driver {

    // Attributes
    private String name;
    private String id;
    private static int idNext = 1;

    // Constructor
    public Driver(String name) {
        this.name = name;
        this.id = generateID();
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.id = generateID(); // Update ID after changing name - ASK IF THIS APPLIES
    }

    public String getId() {
        return id;
    }

    // Methods
    @Override
    public String toString() {
        return String.format("%s\t%s", name, id);
    }

    private String generateID() {
        String code = "DRI" + String.format("%04d", idNext++);
        String initials = name.length() >= 3 ? name.substring(0, 3).toUpperCase() : name.toUpperCase();
        return code + initials;
    }

    public static String getIdNext() {
        return String.format("DRI%04d", idNext);
    }
}
