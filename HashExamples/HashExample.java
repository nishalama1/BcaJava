package HashExamples;

import java.util.HashMap;

public class HashExample {
    public static void main(String[] args) {
        HashMap<Integer,String> Has= new HashMap<Integer,String>();
        //key ra value store garne 
        
        // Adding key-value pairs
        Has.put(1, "Apple");
        Has.put(2, "Banana");
        Has.put(1, "Cherry");//if same key elements bhayo bhane overlap garney raixa
        Has.put(1, "Cher");//if same key elements bhayo bhane overlap garney raixa
        Has.put(4, "Mango");

        // Displaying the HashMap
        System.out.println("Initial HashMap: " + Has);

        // Accessing a value by key
        System.out.println("Value for key 2: " + Has.get(2));
        
         // Removing an entry
         Has.remove(1);
         System.out.println("After removing key 1: " + Has);
 
         // Updating a value
         Has.put(2, "Blueberry");
         System.out.println("After updating key 2: " + Has);
    }
}
