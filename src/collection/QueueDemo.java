package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
