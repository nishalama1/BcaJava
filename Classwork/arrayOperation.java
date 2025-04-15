package Classwork;
public class arrayOperation {
    public static void main(String[] args) {
        int[] numbers={2,3,5,8,5,1};

      int[] SmallLarge = findSmallLarge(numbers); // Get smallest and largest
        int sum = SmallLarge[0] + SmallLarge[1]; // Sum of smallest and largest
        int secondSmallest = arr[1];
        int secondLargest = arr[arr.length - 2];


        System.out.println("Smallest: " + SmallLarge[0]);
        System.out.println("Largest: " + SmallLarge[1]);
        System.out.println("second Smallest:"+ secondSmallest);
        System.out.println("second Largest:"+ secondLargest);
        System.out.println("Sum: " + sum);
    }

    public static int[] findSmallLarge(int[] arr) {
        int small = arr[0], large = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; 
            if (num < small) small= num;
            if (num > large) large = num;
        }

        return new int[]{small, large}; // Return smallest and largest
    }
}