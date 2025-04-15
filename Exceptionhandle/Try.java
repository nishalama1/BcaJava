package Exceptionhandle;

public class Try {
    
   public static void main(String[]args){
     int a[]={1,2,3,4,5,5};
    try{
    a[7]=45;
    System.out.println("trry this once");

    }catch(Exception e){
        System.out.println("this is wrong");
        
    }finally{
        System.out.println("idk");
    }
   } 
}
