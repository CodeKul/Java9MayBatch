package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Pune");
        cities.add(2,"Delhi");
        cities.set(3,"Hyderabad");
        Iterator<String>  iterator = cities.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Size: "+cities.size());
        System.out.println(cities.get(5));
        System.out.println("contains "+cities.contains("Pune"));
        System.out.println("remove "+cities.remove(5));
        System.out.println("index of "+cities.indexOf("Mumbai"));

    }
}
