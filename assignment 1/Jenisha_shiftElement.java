//write a program that shifts all the elementof an array one position to left.
public class Jenisha_shiftElement {
    
    public static void main(String[] args){
        int[] jenisha_arr={1,2,3,4,5};
        positionLeft(jenisha_arr);
        printFunction(jenisha_arr);
    }

    static void positionLeft(int[] jenisha_arr){
        int first= jenisha_arr[0]; //Storing first element
        for(int i=0;i<jenisha_arr.length-1;i++){
            jenisha_arr[i]=jenisha_arr[i+1]; // shifting 0+1=1 index element into 0 index
        }
         jenisha_arr[jenisha_arr.length-1]= first; //shifting first element into last index

    }
    static void printFunction(int [] jenisha_arr){
        for(int i=0;i<jenisha_arr.length;i++){
            System.out.print(jenisha_arr[i]);
    
        }
    }  
}
