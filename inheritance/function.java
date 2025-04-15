package inheritance;
public class function {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,7};
        int[]arr2={4,6,7};
        int result=sumOfElements(arr1, arr2);
        System.out.println("sum of array elements="+result);
        }
    
    public static int sumOfElements(int[] arr1,int[] arr2){
    int sum=0;
    for (int num1:arr1){
    sum+=num1;
     }
 return sum;

}
}



