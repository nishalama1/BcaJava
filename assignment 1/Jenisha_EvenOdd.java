//write a program to count even or odd numbers in array.
public class Jenisha_EvenOdd{
    public static void main(String[] args) {
         int[]jenisha_a={1,2,3,4,5,6};
         int[] result=evenOdd(jenisha_a);
    }

    static int[] evenOdd(int[] jenisha_a){
        // int length= jenisha_a.length;
        int jenisha_evenCount=0;
        int jenisha_oddCount=0;
        for(int i=0;i<jenisha_a.length;i++){
            if(jenisha_a[i]%2==0){
                jenisha_evenCount++;
            }
            else{
                jenisha_oddCount++;
            }
            }
            System.out.println("Even:"+jenisha_evenCount+"Odd:"+jenisha_oddCount);
            return new int[]{
                jenisha_evenCount,jenisha_oddCount};

        }

    }
