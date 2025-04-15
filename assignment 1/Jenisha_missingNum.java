//Find the Missing Number in a Seris.
public class Jenisha_missingNum {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};  
        int[] arr2 = {10, 11, 13, 14}; 
        int[] arr3 = {20, 21, 23, 24}; 
        System.out.println(findMissingNumber(arr1)); 
        System.out.println(findMissingNumber(arr2)); 
        System.out.println(findMissingNumber(arr3)); 
    }
      public static int findMissingNumber(int[] arr) {
            int jenisha_start = arr[0];
            int jenisha_end = arr[arr.length - 1];
    
            int expectedSum = (jenisha_end * (jenisha_end + 1) / 2) - ((jenisha_start - 1) * jenisha_start / 2);
    
            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }
    
            // The missing number
            return expectedSum - actualSum;
        }
    
    }

