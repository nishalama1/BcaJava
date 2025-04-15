//method overload

package polymorphism;

public class Main {
   
   public static int add(int a, int b){
   int sum=a+b;
   return sum;
    }
    public static int add(int a, int b,int c){ //jasle value linxa teslai chai formal parameter bhanxa
        int sum=a+b+c;
        return sum;
         }

    public static int add(int a, int b,int c,int d){
        int sum=a+b+c+d;
        return sum;
    }

   

    // void add(int a){
    //  System.out.println(""+ a);
    // }

    // void add(int a, int b,int c){

    // }
    public static void main(String[] args) {
        

       System.out.println(add(5,7));
       System.out.println(add(5,7,8));//jasle value pathauxa thats actual argument
       System.out.println(add(5,8,7,6));
    }
    
}
