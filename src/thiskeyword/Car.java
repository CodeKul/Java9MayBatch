package thiskeyword;

/**
 * 3. to invoke current class constructor
 */
public class Car {
    String carName;
    String brandName;
    String color = "White";
    Double price;
    Car(){
        this("Nexon","Tata",1500006.5);

    }
    Car(String carName,String brandName,Double price){
        this.carName = carName;
        this.brandName = brandName;
        this.price = price;
    }
    Car(String carName,String brandName,String color,Double price){
        this.carName = carName;
        this.brandName = brandName;
        this.price = price;
        this.color = color;
    }

    void display(){
        System.out.println("Car Name: "+carName);
        System.out.println("brand name: "+brandName);
        System.out.println("color: "+color);
        System.out.println("price: "+price);
    }

}
class CarImpl{
    public static void main(String[] args) {
//        Car car1 = new Car("Nexon","Tata",1400000.5);
        //Car car = new Car("i20","Hyundai","Black",1400000.5);
        Car car = new Car();
        car.display();
    }
}