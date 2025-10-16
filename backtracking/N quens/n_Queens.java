//  Time complexity O(n!);
//  Time complexity without condition (n^n)

public class n_Queens{

    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print( board[i][j]+" ");
            }
            System.out.println();
        }System.out.println("......chess board ..........");
    }

    public static boolean isQueen(char board[][], int row, int col){
        // vertical up
                for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
       
        // diag left up

         for (int i=row-1,j=col-1; i>=0&&j>=0; i--,j--) {
                if(board[i][j]=='Q'){
                    return false;
                
            }
        }

        // diag right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
                if(board[i][j]=='Q')
                return false;
        }
        return true;
    }

    public static boolean n_Queens(char board[][], int row){
        // base
        if(row == board.length){
            // printBoard(board);
            count++;
            return true;

        }
        // recursion
            for(int j=0; j<board[0].length ; j++){
                if(isQueen(board,row,j)){
                board[row][j] = 'Q';
                if(n_Queens(board, row+1))
                {
                    return true;
                }; // recursion
                board[row][j] = 'x'; //backtracking
                }
                
            } return false;
        
    }
    static int count =0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j]='x';
            }
        }
        // n_Queens(board,0);
       
        if(n_Queens(board, 0)){
            printBoard(board);
        }
         System.out.println(count);
    }
}