// Write a program to find all the elements that are  repeated in array
public class Jenisha_repeatArray {
     public static void main(String[] args){
        int[] jenisha_arr={1,2,3,4,5,1,2,3,4};
         repeatElement(jenisha_arr);
    }
    static void repeatElement(int[] jenisha_arr){
        System.out.println("Repeated Array Elements are");
        for(int i=0;i<jenisha_arr.length;i++){
            for(int j=i+1;j<jenisha_arr.length;j++){
                if(jenisha_arr[i]==jenisha_arr[j]){
                    System.out.print(jenisha_arr[i]);     
                }
            }
        }
    }
    
}

