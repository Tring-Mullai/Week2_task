package main;

import models.*;
import services.PropertyService;
import exceptions.PropertyNotFoundException;
import java.util.Scanner;

public class RealEstateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PropertyService propertyService = new PropertyService();
        
        while (true) {
            System.out.println("Are you a Buyer or a Seller? (Enter 'exit' to quit)");
            String userType = scanner.nextLine().trim().toLowerCase();
            
            if (userType.equals("exit")) {
                break;
            }
            
            System.out.println("Enter your name:");
            String name = scanner.nextLine().trim();
            
            if (userType.equals("seller")) {
                Seller seller = new Seller(name);
                
                System.out.println("Enter property type (Residential/Commercial):");
                String type = scanner.nextLine().trim();
                
                System.out.println("Enter property location:");
                String location = scanner.nextLine().trim();
                
                System.out.println("Enter property price:");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                
                Property property = type.equalsIgnoreCase("Residential")
                    ? new ResidentialProperty(location, price)
                    : new CommercialProperty(location, price);
                
                seller.listProperty(propertyService, property);
            } else if (userType.equals("buyer")) {
                Buyer buyer = new Buyer(name);
                System.out.println("Enter location to search for properties:");
                String location = scanner.nextLine().trim();
                
                try {
                    buyer.searchForProperty(propertyService, location);
                } catch (PropertyNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Invalid choice. Please enter 'Buyer' or 'Seller'.");
            }
        }
        scanner.close();
    }
}
