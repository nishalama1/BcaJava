
import java.util.Random;
public class Randomly {
    public static void main(String[] args) {
        String a[] = {"Apple","Banana","cherry","pineapple","nice","sweet"};
        int size= a.length-1;

        Random random = new Random();
        int r = random.nextInt(size);
        System.out.println(a[r]);

    }
}
