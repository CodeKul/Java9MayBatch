package association;

public class Car {
    String carName;
    String color;
    String model;
    Engine engine;
    MPlayer mPlayer;
    Car(String carName,String color,String model,Engine engine,MPlayer mPlayer){
        this.carName = carName;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.mPlayer = mPlayer;
    }

    void display(){
        System.out.println("Car Name "+carName);
        System.out.println("Model "+model);
        System.out.println("Color "+color);
        System.out.println("Chassis No "+engine.chassisNo);
        System.out.println("HP "+engine.hp);
        System.out.println("Media Player "+mPlayer.companyName);
    }
}
class Engine{
    String chassisNo;
    int hp;
    Engine(String chassisNo,int hp){
        this.chassisNo = chassisNo;
        this.hp = hp;
    }
}

class MPlayer{
    String companyName;
    MPlayer(String companyName){
        this.companyName = companyName;
    }
}

class CarImpl{
    public static void main(String[] args) {
        Engine engine = new Engine("APDKN545465",3000);
        MPlayer mPlayer = new MPlayer("JBL");
        Car car = new Car("Harrier","Black","Sports",engine,mPlayer);
        car.display();
    }
}