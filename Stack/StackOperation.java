package Stack;
import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Pushing elements onto the stack
        st.push(12);
        st.push(3);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
       System.out.println(st);

        // Printing the top element
        System.out.println("Top element: " + st.peek());

        // Popping an element
        st.pop();
        System.out.println(st);


        System.out.println(st.search(1));

        // Searching for an element (for example, 3)
        int position = st.search(3);
        if (position != -1) {
            System.out.println("Element 3 is found at position: " + position);
        } else {
            System.out.println("Element not found in the stack.");
        }
    }
}
