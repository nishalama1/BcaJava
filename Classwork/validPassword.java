package Classwork;
import java.util.Scanner;
public class validPassword {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the password: ");
      String input=sc.nextLine();
      char[] inputs = input.toCharArray();

      boolean hasUpperCase=false, hasLowerCase=false, hasDigit=false, hasAtTheRate=false;

      if((inputs[0]>= 'a'&& inputs[0]<= 'z')|| (inputs[1]>= 'a'&& inputs[1]<= 'z')||(inputs[2]>= 'a'&& inputs[2]<= 'z')||(inputs[3]>= 'a'&& inputs[3]<= 'z')){
        hasLowerCase=true;
      }


      if((inputs[0]>= 'A'&& inputs[0]<= 'Z')|| (inputs[1]>= 'A'&& inputs[1]<= 'Z')||(inputs[2]>= 'A'&& inputs[2]<= 'Z')||(inputs[3]>= 'A'&& inputs[3]<= 'Z')){
        hasUpperCase=true;
      }


      if((inputs[0]>= '0'&& inputs[0]<= '9')|| (inputs[1]>= '0'&& inputs[1]<= '9')||(inputs[2]>= '0'&& inputs[2]<= '9')||(inputs[3]>= '0'&& inputs[3]<= '9')){
        hasDigit=true;
      }


      if(inputs[0]== '@'|| inputs[1]== '@'||inputs[2]== '@'||inputs[3]== '@'){
        hasAtTheRate=true;
      }
    
      
      System.out.println(hasLowerCase);
      System.out.println(hasUpperCase);
      System.out.println(hasDigit);
      System.out.println(hasAtTheRate);


      if(hasUpperCase && hasLowerCase && hasDigit && hasAtTheRate){
        System.out.println("password is valid.");
      }else{
        System.out.println("password is invalid.");
      }
      sc.close();
    }
   

}