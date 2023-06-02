package inheritance;

/**
 * Single Inheritance
 */
public class Lion {
    String sound;
    float height;
    String color;
}

class Cub extends Lion{
    float speed;
}

class CubImpl{
    public static void main(String[] args) {
       Cub cub = new Cub();
       cub.color = "Brown";
       cub.sound = "Roar";
       cub.height = 2.6f;
       cub.speed = 3.5f;

        System.out.println("Color "+cub.color);
        System.out.println("Speed "+cub.speed);
        System.out.println("Sound "+cub.sound);
        System.out.println("Height "+cub.height);
    }
}