//write a program to remove the duplicate elements from an integer array
public class Jenisha_removeDuplicate {
        public static void main(String[] args) {
            int[] jenisha_a={1,2,3,4,5};
            int[] result=removeDuplicate(jenisha_a);
            
        }
        
        static int[] removeDuplicate(int[] jenisha_a){
            int jenisha_lengthA=jenisha_a.length;
            int jenisha_temp[]=new int[jenisha_lengthA];
            int j=0;
            
    
            for(int i=0;i<jenisha_lengthA-1;i++){
                if(jenisha_a[i]!=jenisha_a[i+1]){
                    jenisha_temp[j++]=jenisha_a[i];
                    
                   
    
                }
            }
             jenisha_temp[j++]=jenisha_a[jenisha_lengthA-1];
            for(int k=0;k<j;k++){
              System.out.print(jenisha_temp[k]);
            }
           int [] result=jenisha_temp;
           return result;
    
            
        }
    }

