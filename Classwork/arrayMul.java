package Classwork;
import java.util.Scanner;

public class arrayMul {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size= sc.nextInt();


                for( int i=1;i<=size;i++){
                System.out.println("the multiplication of:"+i);
                for(int j=1;j<=10;j++){
                    System.out.println(i + "*"+ j + "=" + i*j );
                }
            }

        }
    
}
