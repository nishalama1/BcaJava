package animalSound;


//extends garesi chai you can use any features of parent.
public class dog extends animal  {
    // void bark(){
    //     eat();
    //     System.out.println("dog is barkig");
    // }
 @Override
    void eat(){
        super.eat();
        System.out.println("dog eats.");
    }

}
