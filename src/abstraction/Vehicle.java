package abstraction;

public abstract class Vehicle {

    Vehicle(){
        System.out.println("in constructor");
    }
    abstract void start();
    void display(){
        System.out.println("in display method");
    }

    static void show(){
        System.out.println("in static show method");
    }

    final void print(){
        System.out.println("in final print method");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("in start method");
    }

    void display(){
        System.out.println("in car display method");
    }
}

class VehicleImpl{
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        //vehicle.start();
        vehicle.display();
        Vehicle.show();
        vehicle.print();
    }
}