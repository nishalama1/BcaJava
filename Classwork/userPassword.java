package Classwork;
import java.util.Scanner;
public class userPassword{

      public static boolean isValidPassword(String password) {
    boolean hasDigit=false;
    boolean hasUpperCase=false;
    boolean hasSpecialChar=false;

    // defining special characters
    String specialCharacters="!@#$%^&*()+";

    for(char ch:password.toCharArray()){

        if(Character.isDigit(ch)){
            hasDigit = true;
        }else if(Character.isUpperCase(ch)){
            hasUpperCase = true;
        }else if(specialCharacters.contains(Character.toString(ch))){
            hasSpecialChar = true;
        }

    }

    // checking if all conditions are met

    if(hasDigit && hasUpperCase && hasSpecialChar){
        return true;
    } else {
        return false;
    }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // ask user for password input
        System.out.println("Enter the password: ");
        String password= sc.nextLine();

        // for validate password
        if(isValidPassword(password)){
            System.out.println("Password is valid.");
        }else{
            System.out.println("Password is invalid.It must contain at least one special character, one digit, one uppercase.");     
        } 
        sc.close(); 
    }
}
