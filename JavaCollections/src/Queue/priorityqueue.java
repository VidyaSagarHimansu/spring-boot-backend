package Queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args){
        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

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

        Iterator<Integer> it = q.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
