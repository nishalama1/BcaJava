package String;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Iam an apple.\n");
        sb.append(  2);
        sb.append(  'A');
        sb.append(  false);
        // sb.reverse();
        sb.insert(5,"Java");
        System.out.println(sb.replace(5,6,"Java")   );
        sb.delete(2,3);
        System.out.println(sb);
            }
        }
        