package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Sunday");
        priorityQueue.offer("Monday");
        priorityQueue.offer("Tuesday");
        priorityQueue.offer("Wednesday");
        priorityQueue.offer("Thursday");
        priorityQueue.offer("Friday");
        priorityQueue.offer("Saturday");
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());




    }
}
