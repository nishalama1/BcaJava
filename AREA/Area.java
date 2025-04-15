package AREA;

public class Area {

    public static void main(String[] args) {
        
    int l=20;
    int b=30;
    int a=2;
    int r=7;

    // object ho
    Rectangle rectangle = new Rectangle();
    rectangle.printArea(l,b);

    Square square= new Square();
    square.printArea(a); 
   
    Circle circle= new Circle();
    circle.printArea(r);
  
}

}