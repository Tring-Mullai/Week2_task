package models;

import services.PropertyService;

public class Seller extends User {
    public Seller(String name) {
        super(name, "Seller");
    }

    public void listProperty(PropertyService service, Property property) {
        service.addProperty(property);
    }
}

