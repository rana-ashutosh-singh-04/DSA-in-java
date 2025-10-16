import java.util.*;

 class demoqueens {
    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }System.out.println(" .....board........");
    }

    public static boolean isSafe(char board[][], int row, int col){
        // vertical up
        for(int i= row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            };
        }

        // diag up right
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            };
        }

        // diag up left 
        for(int i=row-1, j= col-1; i>=0 && j>=0; i--, j-- ){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char board[][] = new char[n][n];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j]='x';
            }
        }
        n_Queens(board,0);

    }

    
    public static void n_Queens(char board[][], int row){
        if(row==board.length){
            printBoard(board);
            return;
        }

        // recursion
        for(int j=0;j<board.length; j++){
          if(isSafe(board,row,j)){
                 board[row][j] = 'Q';
            n_Queens(board, row+1);
              board[row][j] = 'x';
            }
           
          
        }
    }
}