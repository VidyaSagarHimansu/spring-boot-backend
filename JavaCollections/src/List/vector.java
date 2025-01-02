package List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

//same as ArrayList
//but whenever we want to perform some operation on vectors, the Vector class automatically applies a lock to that operation.
//Default Capacity Increment:
//        By default, the capacity of a Vector doubles (i.e., grows by 100%) when it reaches its limit.
//        If you create a Vector with an initial capacity of 10, it will grow to 20, 40, and so on as needed.
//        Custom Capacity Increment:
//        You can specify a custom increment by using the constructor:
//        java
//        Copy code
//        Vector(int initialCapacity, int capacityIncrement)
public class vector {

    public static void main(String[] args){
        Vector<Integer> a = new Vector<>();

        a.add(10);
        a.add(11);
        a.add(12);
        System.out.println(a.toString()); // [10, 11, 12]

        Vector<Integer> b = new Vector<>();

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
