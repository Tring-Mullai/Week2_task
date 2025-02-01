package models;

import exceptions.PropertyNotFoundException;
import services.PropertyService;

public class Buyer extends User {
    public Buyer(String name) {
        super(name, "Buyer");
    }

    public void searchForProperty(PropertyService service, String location) throws PropertyNotFoundException {
        if (!service.hasProperty(location)) {
            throw new PropertyNotFoundException("Property not found at " + location);
        }
        service.listProperties();
    }
}