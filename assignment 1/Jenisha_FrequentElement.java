//write a program to find the elements that appears frequently in an array
public class Jenisha_FrequentElement {
        public static void main(String[] args) {
            int[] jenisha_arr= {1, 2,3,4,5,1,2,1};
             int jenisha_mostFrequent = findMostFrequent(jenisha_arr); 
    
             System.out.println("Element: " + jenisha_mostFrequent + " appears most frequently.");
        }
    
        static int findMostFrequent(int[] jenisha_arr) {
            int n = jenisha_arr.length;
           
            int jenisha_maxCount = 0; // Store the maximum count of an element
            int jenisha_mostFrequent = jenisha_arr[0]; 
    
            for (int i = 0; i < n; i++) {
                int jenisha_count = 1; // Start counting  of arr[i]
                for (int j = i + 1; j < n; j++) {
                    if (jenisha_arr[i] == jenisha_arr[j]) {
                        jenisha_count++; 
                    }
                }
    
                if (jenisha_count > jenisha_maxCount) {
                    jenisha_maxCount = jenisha_count;
                    jenisha_mostFrequent = jenisha_arr[i];
                }
            }
    
            return jenisha_mostFrequent; 
        }
    }  
