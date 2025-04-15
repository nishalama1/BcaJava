package AREA;

public class ArrayArea {

    public static void main(String[] args) {
        
    
    int [] length={20,30,40,50};
    int [] breadth={20,30,40,50};
    // int [] radius={20,30,40,50};

      
    for (int i = 0; i < length.length; i++) {
        int rectangleArea = length[i] * breadth[i];
        System.out.println("Rectangle Area for length " + length[i] + " and breadth " + breadth[i] + " = " + rectangleArea);
}
}

}
