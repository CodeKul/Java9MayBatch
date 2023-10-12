package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> countries = new LinkedHashSet<>();
        countries.add("India");
        countries.add("Australia");
        countries.add("Shri-Lanka");
        countries.add("New-Zealand");
        countries.add("England");
        countries.add("Australia");
        countries.add("null");
        countries.add(null);
        System.out.println(countries);
    }
}
