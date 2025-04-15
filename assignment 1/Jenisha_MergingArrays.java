
public class Jenisha_MergingArrays {

   public static void main(String[] args) {
    int [] jenisha_a={1,2,3};
    int [] jenisha_b={4,5,6};

    int[] result = mergeTwoArrays(jenisha_a, jenisha_b);

    for(int i=0;i<result.length;i++){
      System.out.print(result[i]);
    }


   } 

    public static int[] mergeTwoArrays(int[] jenisha_a,int[] jenisha_b){

    int length1= jenisha_a.length;
    int length2= jenisha_b.length;
     int[] mergeTwoArrays=new int[length1+length2];
    
     //element jenisha_a bata copy garnalai
     for(int i=0;i<length1;i++){
      mergeTwoArrays[i]=jenisha_a[i];
     }

     //element jenisha_b bata copy garnalai
     for(int i=0;i<length2;i++){
      mergeTwoArrays[length1+i]=jenisha_b[i];
     }
     return mergeTwoArrays;

   }
}
