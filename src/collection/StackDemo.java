package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i=10;i<100;i=i+10){
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println("Remove item "+stack.pop());
        System.out.println(stack);
        System.out.println("peek "+stack.peek());

    }
}
