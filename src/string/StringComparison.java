package string;

/**
 * String can be compared in 3 ways
 * 1. == operator - compares references(memory address)
 * 2. equals - compares the content of the strings & case sensitivity,does not ignore the case
 * 3. compareTo - compares the values lexicographically and returns an integer,
 *                 comparison is based on the Unicode value
 *                 0 -> same
 *                 1 or positive  -> first string is greater than second string
 *                -1 or negative -> first string is less than  second string
 * 4. equalsIgnoreCase - compares the content of the strings & ignores the cases
 */
public class StringComparison {
    public static void main(String[] args) {

        String s1 = "Pune";
        String s2 = "Mumbai";
        String s3 = "Pune";
        String s4 = new String("Pune");
        String s5 = "MUMBAI";
        String s6 = "Chennai";
        System.out.println(s1==s3); //true
        System.out.println(s1==s4); //false

        System.out.println("s1.equals(s3) "+s1.equals(s3));
        System.out.println("s1.equals(s4) "+s1.equals(s4));


        System.out.println(s2==s5);
        System.out.println("s2.equals(s5) "+s2.equals(s5));
        System.out.println("s2.equalsIgnoreCase(s5) "+s2.equalsIgnoreCase(s5));


        System.out.println("s1.compareTo(s3) "+s1.compareTo(s3));
        System.out.println("s1.compareTo(s2) "+s1.compareTo(s2));
        System.out.println("s1.compareTo(s6) "+s1.compareTo(s6));


    }
}


