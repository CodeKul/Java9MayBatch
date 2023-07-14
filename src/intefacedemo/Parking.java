package intefacedemo;


public interface Parking {
}

class TwoWheeler {
    void display(){
        System.out.println("in two wheeler");
    }
}

class FourWheeler implements Parking{
    void display(){
        System.out.println("in four wheeler");
    }
}

class ParkingImpl{
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        if (twoWheeler instanceof Parking){
            System.out.println("Allowed");
            twoWheeler.display();
        }
        FourWheeler fourWheeler = new FourWheeler();
        if (fourWheeler instanceof Parking){
            System.out.println("Allowed");
            fourWheeler.display();
        }
    }
}