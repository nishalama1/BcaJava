package Exceptionhandle;

public class Main {
    

    public static void main(String[] args) {
        
        try{
          
            MyAge(102);
            
        }catch(Exception e ){

        System.out.println(e.getMessage());

        }

    }

    public static void MyAge(int age) throws AlreadyDead,NotYetBorn{

      if (age<=0){
        throw new NotYetBorn();
    
      }  

      if(age>101){
        throw new AlreadyDead();
      }
    
}
}
