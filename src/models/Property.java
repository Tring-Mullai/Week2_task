package models;

public class Property {
    private String type;
    private String location;
    private double price;

    public Property(String type, String location, double price) {
        this.type = type;
        this.location = location;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Property Type: " + type + ", Location: " + location + ", Price: " + price;
    }
}