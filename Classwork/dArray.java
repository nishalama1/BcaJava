package Classwork;
public class dArray {

    public static void main(String[] args) {
     int arr[]={1,2,3,4};
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(multiplyMatrix(arr) [i][j]+" ");
        }
        System.out.println();
     }
    }

    static int[][] multiplyMatrix(int[] arr){
        int array[][]=new int[arr.length] [arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                array[i][j]=arr[i]*(j+1);
            }

        }
        return array;
    }
}