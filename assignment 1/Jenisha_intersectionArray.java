//Find the intersection of two arrays
public class Jenisha_intersectionArray {
    public static void main(String[] args) {
        int[] jenisha_arr1 = {1, 2, 3, 4, 5};
        int[] jenisha_arr2 = {2, 3, 5, 6, 7};
        
        findIntersection(jenisha_arr1, jenisha_arr2);
    }

    public static void findIntersection(int[] jenisha_arr1, int[] jenisha_arr2) {
        System.out.print("Intersection: ");
        
        for (int i = 0; i < jenisha_arr1.length; i++) {
            for (int j = 0; j < jenisha_arr2.length; j++) {
                // If an element in arr1 matches an element in arr2, print it
                if (jenisha_arr1[i] == jenisha_arr2[j]) {
                    System.out.print(jenisha_arr1[i] + " ");
                    break; 
                }
            }
        }
    }
}