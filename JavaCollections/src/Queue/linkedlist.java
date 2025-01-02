package Queue;

import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args){
        LinkedList<Integer> li = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            li.add(i);
        }

        li.add(3, 9);
        System.out.println(li.toString()); // [0, 1, 2, 9, 3, 4, 5, 6, 7, 8, 9]

        li.set(2, 10);

        System.out.println(li. toString()); // [0, 1, 10, 9, 3, 4, 5, 6, 7, 8, 9]

        System.out.println(li.get(3)); // 9
        System.out.println(li.remove(1)); // 1
        System.out.println(li.toString()); // [0, 10, 9, 3, 4, 5, 6, 7, 8, 9]
    }
}
