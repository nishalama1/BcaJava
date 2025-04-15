package Interfaces;


public class Main {
   
    public static void main(String[] args) {
      Vehicle V;
      V = new Vehicle();
      V.Start();
      V = new Tesla();
      V.Start();
      V.brand();

      Honkable honkable= new HonkableImp();
      honkable.breakable();
      //anonymous class
      
    }
}
