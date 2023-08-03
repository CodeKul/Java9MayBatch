package string;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Mumbai";
        System.out.println(s1.concat(",India"));

        System.out.println(s1);
        s1 = "Goa";
        System.out.println(s1);
    }
}
