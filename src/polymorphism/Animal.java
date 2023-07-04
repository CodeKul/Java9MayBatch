package polymorphism;

public class Animal {
    String breed = "Any";
    void run(){
        System.out.println("in animal run method");
    }
}

class Dog extends Animal{
    String breed = "German Shepard";

    void run(){
        System.out.println("in Dog run method");
    }
}

class AnimalImpl{
    public static void main(String[] args) {
        Animal animal; //reference variable
        animal = new Dog(); //reference variable hold the object of it's child class //upcasting
        animal.run();
        System.out.println(animal.breed);
    }
}