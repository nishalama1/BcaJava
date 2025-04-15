package Classwork;
public class practice {

    static char[][] board={
        {'*','C','*'},   //0
        {'*','*','*'},   //1
        {'*','*','*'},   //2
    };

    static int[][]boardInt={
        {1,2,3},
        {1,2,3},
        {1,2,3},
    };


    public static void main(String[] args) {
    
    System.out.println("this is the menu!!Please select your choice");
    System.out.println("1. PrintBoard");
    System.out.println("2.");
   printBoard();
        
    }
    
    static void printBoard(){
        // System.out.println(board[2][1]);
        // System.out.println(board[0][1]);
        for(int i=0;i<3;i++){
            System.out.print("[");

            for(int j=0;j<3;j++){
    
        System.out.print(board[1][2]+" ");
        
        }
        System.out.print("]");

        System.out.println();
    }
}

//   static void manipulatorBoard(int x int y char value){
//     System.out.println();
//   }
}