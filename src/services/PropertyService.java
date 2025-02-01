package services;

import models.Property;
import java.util.ArrayList;
import java.util.List;

public class PropertyService {
    private List<Property> properties = new ArrayList<>();

    public void addProperty(Property property) {
        properties.add(property);
        System.out.println("Property added: " + property);
    }

    public void listProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties available.");
            return;
        }
        for (Property property : properties) {
            System.out.println(property);
        }
    }

    public boolean hasProperty(String location) {
        return properties.stream().anyMatch(p -> p.getLocation().equalsIgnoreCase(location));
    }
}
