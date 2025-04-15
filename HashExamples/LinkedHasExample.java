package HashExamples;

import java.util.LinkedHashMap;
// import java.util.LinkedHashSet;

public class LinkedHasExample {
    public static void main(String[] args) {
       // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        linkedHashMap.put(3, "Cherry");
        linkedHashMap.put(4, "Mango");

        // Displaying the LinkedHashMap
        System.out.println("Initial LinkedHashMap: " + linkedHashMap);

        // Accessing a value by key
        System.out.println("Value for key 2: " + linkedHashMap.get(2));

    }
}
