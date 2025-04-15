package Wrapper;


// methods associated by double


public class WrapperExample {
    public static void main(String[] args) {
        double a=55.05;
        Double d = Double.valueOf(a);
        String s= Double.toString(a);
        System.out.println("double object : " + d);
        System.out.println("String: " + s);
        //double lai string ma change gareko ho 


        String e="45.55";
        Double r= Double.valueOf(e);
        System.out.println("value is : " + r);

        String f="55.505";
        Double m= Double.parseDouble(f);
        System.out.println("value is : " + m);
          
        
        //equals()
       Double num1=3.44;
       Double num2=4.444;
       if(num1==num2){
        System.out.println("its true");
       } else{
        System.out.println("its not true");
       }

       //compareTo()
       Double l= 2.33;
       Double n= 5.333;
    
            // Using compareTo() to compare l and n
            if (l.compareTo(n) == 0) {
                System.out.println("Both numbers are equal.");
            } else if (l.compareTo(n) < 0) {
                System.out.println("l is smaller than n.");
            } else {
                System.out.println("l is greater than n.");
            }

        //compare()
        double h=3.444;
        double i=33.33;
         
    
            if (Double.compare(h, i) == 0) {
                System.out.println("Both numbers are equal.");
            } else if (Double.compare(h, i) < 0) {
                System.out.println("h is smaller than i.");
            } else {
                System.out.println("h is greater than i.");
            }

        }

        

    }
