package Finalkeyword;

public class FinalMethod {
    final void hello(){
        System.out.println("hi this cant be override");
    }

    class Another extends FinalMethod{
    //  void hello(){
    //     System.out.println("okay");
    //  }
    }
    public static void main(String[] args) {
        FinalMethod obj=new FinalMethod();
        obj.hello();
    }
}
