package Classwork;
public class Main {
    public static void main(String[] args) {

        System.out.println("The sum of 4 number is: " + addFourNumber(2, 3, 4, 5));

        System.out.println("The greatest number is: " + greatestNumber(1, 4));

        System.out.println("The smallest number is: " + smallestNumber(10, 4));

        System.out.println(EvenOrOdd(10));

        System.out.println("Area of rectangle is: " + areaOfRectangle(3, 5));

        System.out.println("concatenate string: " + ("Jenisha Lama"));
       
    }

    // Addition of four numbers
    public static int addFourNumber(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Greatest number among two
    public static int greatestNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Smallest number among 2
    public static int smallestNumber(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    // Even or off number check
    public static String EvenOrOdd(int x) {
        if (x % 2 == 0) {
            return x + " is an even number";
        } else {
            return x + " is an odd number";
        }
    }

    // Area of rectangle
    public static int areaOfRectangle(int l, int b) {
        return (l * b);
    }

    // concatenate the two string
    public static String concatenate (String a, String b) {
        return a +b;
    }
}