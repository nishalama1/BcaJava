package HashExamples;

import java.util.*;
public class allcode {

    public static void main(String[] args) {

        // HashMap (Unordered)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        // hashMap.put(1, "jjgyfc");
        hashMap.put(4, "A");
        hashMap.put(2, "B");
        System.out.println("HashMap: " + hashMap); // Random order

        // LinkedHashMap (Maintains Insertion Order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "C");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(4, "D");
        linkedHashMap.put(2, "B");
        System.out.println("LinkedHashMap: " + linkedHashMap); // Ordered by insertion

        // TreeMap (Sorted Order)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(4, "D");
        treeMap.put(2, "B");
        System.out.println("TreeMap: " + treeMap); // Sorted by key
    }
}

