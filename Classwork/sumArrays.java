package Classwork;
// import java.util.Arrays;
// import java.util.Scanner;

public class sumArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={1,2,3,8,12};

        int length1= arr1.length;
        int length2=arr2.length;
        int[] result= SumFunction(arr1, arr2,length1,length2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        
        // System.out.println("Sum of Array:" + Arrays.toString(result)); // it formats array as string
    }
    static int maxLength(int length1,int length2){
        if(length1>length2){
           return length1;
        }
        else{
            return length2;

        }

    }
    static int[] SumFunction(int arr1[],int arr2[],int length1,int length2){
        
       int max= maxLength(length1,length2);
        int sum[]= new int[max];


        for(int i=0;i<max;i++){
            int val1= i<length1 ? arr1[i]:0;
            int val2=i<length2 ? arr2[i]:0;
             sum[i]= val1 + val2;

        }
        return sum;

    }
    
}