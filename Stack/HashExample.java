package Stack;

import java.util.HashSet;

public class HashExample {
    public static void main(String[] args) {
        HashSet<Integer> hash= new HashSet<>();
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(3);
        hash.add(6);
        hash.add(7);
        hash.add(8);


        // hashset le duplicate data rakhdaina

       System.out.println(hash);

       hash.remove(3);
       System.out.println(hash);

    

       System.out.println(hash.size());
    }
}
