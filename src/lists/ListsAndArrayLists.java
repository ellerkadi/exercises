package lists;

import java.util.ArrayList;
import java.util.List;

public class ListsAndArrayLists {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("John");
        listOfNames.add("Jane");
        listOfNames.add("Jack");
        listOfNames.add("Jill");

        System.out.println(listOfNames);

        for (String name : listOfNames) {
            System.out.println(name);
        }

        listOfNames.remove("John");
        listOfNames.set(2, "Kadi");

        System.out.println(" ");

        System.out.println("Print out name: " + listOfNames.get(0));
        System.out.println("Print out name: " + listOfNames.get(1));
        System.out.println("Print out name: " + listOfNames.get(2));
    }
}
