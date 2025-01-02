package List;

import java.util.Stack;

//Stack extends the Vector class, it inherits all the methods Vector

//Use ArrayDeque instead
public class stack {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < 10; i++) {
            s.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(s.pop() + " "); // 9 8 7 6 5 4 3 2 1 0
        }

        for (int i = 0; i < 10; i++) {
            s.push(i);
        }

        System.out.println(s.peek()); //9

        System.out.println("Position of 9: " + s.contains(9));

        System.out.println("Position of 9: " + s.search(0)); //10 bcoz 1 based postion
    }
}
