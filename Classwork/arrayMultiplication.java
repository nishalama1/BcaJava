package Classwork;
import java.util.Scanner;
public class arrayMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size.");
        int size= sc.nextInt();
        int sum=0;
        int[] numbers= new int[size];

        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();   
            sum+=numbers[i];
           
        }
        System.out.println("the sum is:"+ sum);
        multiplication(10);
        
        
        
    }
    public static void multiplication(int size){
        System.out.println("the multiplication of 5 is:");
        for( int i=1;i<=size;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i + "*"+ j + "=" + i*j );
            }
        }
}
}