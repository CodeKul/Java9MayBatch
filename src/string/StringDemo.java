package string;

public class StringDemo {
    public static void main(String[] args) {
        // by using character array
        char c[]  = {'J','A','V','A'};
        String s1 = c.toString();

        // by using literal
        String s2 = "Codekul";

        //by using new keyword
        String s3 = new String("Computer Science");

        String name = "Sunday,Monday,Tuesday";

        String s4 = "   H    i      ";

        //Methods from string class

        System.out.println("Length: "+s2.length());
        System.out.println("Lowercase: "+s2.toLowerCase());
        System.out.println("Uppercase: "+s2.toUpperCase());
        System.out.println("equals : "+s2.equals("CodeKUL"));
        System.out.println("equalsIgnoreCase : "+s2.equalsIgnoreCase("CodeKUL"));
        System.out.println("substring : "+s3.substring(1,5));
        System.out.println("char At : "+s3.charAt(7));
        System.out.println("codePointAt: "+s3.codePointAt(0));
        System.out.println("concat : "+s3.concat(" Branch"));
        System.out.println("replace : "+s3.replace("Science","Applications"));
        String array[] = name.split(",");
        for (String s:array) {
            System.out.println(s);
        }
        System.out.println("@ 1st index "+array[1]);

        System.out.println("trim "+s4.trim());
    }
}
