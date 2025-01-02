package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

//In order to use the functionalities of the Deque interface, we need to use classes that implement it:
//
//ArrayDeque
//LinkedList
//
//use for stack mainly
public class arraydeque {

    public static void main(String[] args){
        Deque<Integer> dq = new ArrayDeque<>(); // or LinkedList<>()

        for (int i = 0; i < 10; i++) {
            dq.addFirst(i); //dq.offerfirst
        }

        for (int i = 100; i > 30; i--) {
            dq.addLast(i); //dq.offerLast
        }

        System.out.println(dq.getFirst()); //9
        System.out.println(dq.getLast()); //31
        System.out.println(dq.peek()); //9

        System.out.println(dq.toString()); // [9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 100, 99, 98, 97, 96, 95, .... 31]
        System.out.println(dq.remove()); //9 give error if empty
        System.out.println(dq.toString()); // [8, ...]

        dq.push(1);
        System.out.println(dq.toString()); // [1, 8, 7, 6, 5, 4, 3, ...
    }
}
