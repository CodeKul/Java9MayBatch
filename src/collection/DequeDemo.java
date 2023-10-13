package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer>  numbers = new ArrayDeque<>();
        numbers.add(1);
        numbers.add(2);
        numbers.addFirst(3);
        numbers.addLast(5);
        numbers.add(4);
        numbers.removeFirst();
        numbers.removeLast();
        numbers.push(5);
        System.out.println(numbers);
    }
}
