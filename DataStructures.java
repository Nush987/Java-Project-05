import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class DataStructures {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Pine Apple");
        arrayList.add("Mango");
        arrayList.add("Grapes");
        arrayList.add("Orange");
        System.out.println(arrayList.get(4));

        // hashmap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Test", 2);
        System.out.println(map.get("Test"));

        // Linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        System.out.println(list.get(1)); // output B

    }

}
