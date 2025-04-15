package Interface;

public class Circle implements AreaCalculator, PerimeterCalculator {
    int r;
    long Area;
    Circle(int r){
        this.r=r;

    }
    @Override
    public void Area() {
        Area=22/7*r*r;
     System.out.println("The area is"+Area);
    }

}
