package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            q.add(i);
        }

        System.out.println(q.toString()); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println(q.element()); //0
        System.out.println(q.peek()); // 0

        System.out.println(q.remove()); //0 Throws an exception if the queue is empty.

        System.out.println(q.toString());
        System.out.println(q.poll());// 1 Returns null if the queue is empty.

        System.out.println(q.toString());

    }

}
