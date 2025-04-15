//write a code to check whether the array is sorted in ascending order
public class Jenisha_sortedArray {
    public static void main(String[] args){
        int[] jenisha_arr={1,2,3,4,5};
        if(SortedOrNot( jenisha_arr)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }

    }
    public static boolean SortedOrNot(int[] jenisha_arr){
        int n=jenisha_arr.length;
        for(int i=0;i<n-1;i++){
           if( jenisha_arr[i]>jenisha_arr[i+1]){
            return false;
           }
        }
        return true;
    }
    
}
