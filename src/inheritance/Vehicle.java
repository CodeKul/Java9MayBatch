package inheritance;

/**
 * Multilevel Inheritance
 */
public class Vehicle {
    String type;
    int noOfWheels;
}
class Car extends Vehicle{
    String brand;
    String companyName;
    String engine;
}
class Harrier extends Car{
    String model;
    String color;
}

class VehicleImpl{
    public static void main(String[] args) {
        Harrier harrier = new Harrier();
        harrier.brand = "Tata";
        harrier.color = "Black";
        harrier.noOfWheels = 4;
        harrier.engine = "BS-6";
        harrier.model = "Sports";

        System.out.println("Brand "+harrier.brand);
        System.out.println("Color "+harrier.color);
        System.out.println("Wheels No "+harrier.noOfWheels);
        System.out.println("Engine "+harrier.engine);
        System.out.println("Model "+harrier.model);
    }
}