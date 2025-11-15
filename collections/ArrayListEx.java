package collections;
import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Mahesh");
        arrayList.add("Ganesh");
        arrayList.add("Vishal");
        arrayList.add("Rahul");
        arrayList.add("Vaibhav");
        System.out.println(arrayList);
        arrayList.add("Pungesh");
        arrayList.add(2, "Kel");
        System.out.println(arrayList);
        arrayList.addFirst("King");
        System.out.println(arrayList);
        arrayList.addLast("Pappa");
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.getClass());
        System.out.println(arrayList);
        for (String i : arrayList) {
            System.out.println(i);
        }

        arrayList.clear();

        System.out.println(arrayList);
    }
}
