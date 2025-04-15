//Implement a Matrix class that supports matrix addition and multiplication.
public class Jenisha_Matrix {
        public static void main(String[] args) {
            int[][] jenisha_MatrixA={{1, 2}, {3, 4}};
            int[][] jenisha_MatrixB={{5,6},{7,8}};
            int[][] result =MatrixAddition(jenisha_MatrixA, jenisha_MatrixB);
    
            for(int i=0;i<result.length;i++){
                for(int j=0;j<result.length;j++){
                System.out.print(result[i][j]);
            }
        }
    }
    
        public static int[][] MatrixAddition(int[][] jenisha_MatrixA,int[][] jenisha_MatrixB){
            int rows=jenisha_MatrixA.length;
            int cols=jenisha_MatrixA[0].length;
            int[][] result= new int[rows][cols];
    
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    result[i][j]= jenisha_MatrixA[i][j]+jenisha_MatrixB[i][j];
                }
            }
            return result;
        }
    
        
    }
    
