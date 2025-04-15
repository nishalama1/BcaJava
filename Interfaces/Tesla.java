package Interfaces;

public class Tesla extends Vehicle{
    public void brand(){
        System.out.println("i am tesla");
    }

    @Override
    public void Start(){
        System.out.println("Tesla start");
    }
}
