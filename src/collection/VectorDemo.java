package collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        for (int i=1;i<12;i++){
            vector.add(i);
        }
        System.out.println("capacity: "+vector.capacity());
        System.out.println("size: "+vector.size());
        System.out.println("indexOf: "+vector.indexOf(4,5));
        System.out.println("elementAt "+vector.elementAt(10));
        //last index of
        //last element
        // first element
    }
}
