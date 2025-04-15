package Abstract_keyword;

public class Rectangle extends Shape {

 int l;
 int b;
 long Area;


    public Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }
    
    // overide rakhnu to make easier for compilation
    @Override
    void Area() {
        Area=l*b;
      System.out.println("Area is" + Area);
    }

    @Override
    void corner() {
      System.out.println("rectangle has only four corner");
    }
}
