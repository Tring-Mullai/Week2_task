package models;

public class User {
    private String name;
    private String type;

    public User(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void displayInfo() {
        System.out.println("User Name: " + name);
        System.out.println("User Type: " + type);
    }
}
