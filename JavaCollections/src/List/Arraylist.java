package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(11);
        a.add(12);
        System.out.println(a.toString()); // [10, 11, 12]

        ArrayList<Integer> b = new ArrayList<>();

        b.addAll(a);
        System.out.println(b.toString()); // [10, 11, 12]

        System.out.println(b.get(0)); //10

        Iterator<Integer> it = b.iterator();

        while (it.hasNext()){
            System.out.print(it.next() + " "); // 10 11 12
        }
        System.out.println();

        a.set(0 , 1);

        System.out.println(a.toString()); //[1, 11, 12]

        a.remove(0);

        System.out.println(a.toString()); //[11, 12]

        a.clear();
        System.out.println(a.toString()); //[]

        Integer[] cpy = b.toArray(new Integer[0]);

        for(int i : cpy)
            System.out.println(i);
        /*
            10
            11
            12
        * */

        System.out.println(b.contains(11));
    }
}
