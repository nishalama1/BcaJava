package Interfaces;


public class Vehicle implements Drivable, Honkable {

    public void brand(){
        
    }
   

    @Override
    public void Start() {
      System.out.println("Start the vehicle");
    }

    @Override
    public void Stop() {
        System.out.println("Stop the vehicle");
    }

    @Override
    public void breakable() {
       System.out.println("please break it");
    }
  
}
