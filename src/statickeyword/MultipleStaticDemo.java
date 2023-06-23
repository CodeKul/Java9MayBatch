package statickeyword;

public class MultipleStaticDemo {
    public static void main(String[] args) {
        System.out.println("in main method");
    }
    static {
        System.out.println("in static 1");
    }

    static {
        System.out.println("in static 2");
    }

    static {
        System.out.println("in static 3");
    }


}
