package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(40);
        set.add(89);
        set.add(5);
        set.add(75);
        set.add(12);
        set.add(63);
        set.add(75);
//        set.add(null);
        System.out.println(set);
    }
}
