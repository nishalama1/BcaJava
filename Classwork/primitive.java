package Classwork;
public class primitive {
     public static void main(String[] args){

        byte roll=1;
        System.out.println("the roll no is:" + rollno(roll));
        
        char sec='A';
        System.out.println("the section is:" + section(sec));

        float percent= 55.5f;
        System.out.println("the percentage is :" + percentage(percent));

        int totalTeacher=5;
        System.out.println("the totak marks is:" + total(totalTeacher));

        boolean pass=true;
        System.out.println("college open today ?\t" + pass(pass));

    
     }
       

        public static byte rollno( byte num){
    return num= 8;
}

        public static char section( char a){
    return a ='A';
        }

         public static float percentage( float a){
    return a= 55.5f;
        }

        public static int total(int x){
    return x= 5;
        }

        public static boolean pass(boolean x){
    return x=true;
        }
}


