package intefacedemo;

public interface Vehicle extends Engine{
    String chassisNo = "";
    void applyBrakes();
    void speedUpDown();
    void getNoOfGears();
}

interface MediaPlayer{
    boolean hasMediaPlayer();
}

interface Engine{
    String getEngineType();
}

class Car implements Vehicle,MediaPlayer{

    @Override
    public void applyBrakes() {
        System.out.println("in apply brakes");
    }

    @Override
    public void speedUpDown() {
        System.out.println("in speed up down");
    }

    @Override
    public void getNoOfGears() {
        System.out.println("get no of gears");
    }

    @Override
    public boolean hasMediaPlayer() {
        return true;
    }

    @Override
    public String getEngineType() {
        return "BS6";
    }
}

class Bike implements Vehicle{

    @Override
    public void applyBrakes() {
        System.out.println("in apply brakes");
    }

    @Override
    public void speedUpDown() {
        System.out.println("in speed up down");
    }

    @Override
    public void getNoOfGears() {
        System.out.println("get no of gears");
    }

    @Override
    public String getEngineType() {
        return "BS4";
    }
}

class VehicleImpl{
    public static void main(String[] args) {
        Vehicle vehicle1; //reference variable
        vehicle1= new Car();  // vehicle holds the object of it's implemented class
        vehicle1.applyBrakes();
        vehicle1.getNoOfGears();
        vehicle1.speedUpDown();
        System.out.println(vehicle1.getEngineType());
        MediaPlayer mediaPlayer = new Car();
        System.out.println(mediaPlayer.hasMediaPlayer());
    }
}