package HashExamples;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

         // Adding elements
         treeSet.add(40);
         treeSet.add(10);
         treeSet.add(30);
         treeSet.add(50);
         treeSet.add(20);
 
         // Displaying elements (Sorted Order)
         System.out.println("TreeSet (Sorted): " + treeSet);
 
         // Attempting to add a duplicate element
         boolean isAdded = treeSet.add(30);
         System.out.println("Was 30 added again? " + isAdded); // false, because duplicates are not allowed
 
    

    }
}
