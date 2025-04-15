package Finalkeyword;

// Making the class final to prevent inheritance
final class FinalInheritant { 
    void display() {
        System.out.println("This is a final class.");
    }
}

// Trying to extend FinalInheritant will cause an error:
// class SportsCar extends FinalInheritant { }  // ❌ Compilation error: Cannot inherit from final class

public class FinalClassExample {
    public static void main(String[] args) {
        FinalInheritant myCar = new FinalInheritant();
        myCar.display();
    }
}
