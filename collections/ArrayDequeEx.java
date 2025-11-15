package collections;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque <String> arrayDeque=new ArrayDeque<>();
        System.out.println(arrayDeque);
        arrayDeque.add("Mahesh");
        arrayDeque.add("Mahesh");
        arrayDeque.add("Mahesh");
        arrayDeque.add("Mahesh");

        System.out.println(arrayDeque);

        arrayDeque.push("Rada");
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);
    }
}
