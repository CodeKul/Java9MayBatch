package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer>  numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(2);
        numbers.add(11);
        numbers.add(15);
        numbers.add(2);
        System.out.println(numbers);

        System.out.println("isEmpty "+numbers.isEmpty());
        System.out.println("size "+numbers.size());
        System.out.println("removed no "+numbers.remove(3));

        for (Integer n : numbers){
            System.out.println("No "+n);
        }

        numbers.set(4,45);

        Iterator<Integer> iterator =  numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
