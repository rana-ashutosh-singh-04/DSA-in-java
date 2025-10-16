import java.util.*;

class SudokuSolver {

    public static void printSudoku(char[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) System.out.println("------+-------+------");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) System.out.print("| ");
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] sudoku, int row, int col, char digit) {
        for (int j = 0; j < 9; j++) if (sudoku[row][j] == digit) return false;
        for (int i = 0; i < 9; i++) if (sudoku[i][col] == digit) return false;

        int sr = (row / 3) * 3, sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++)
            for (int j = sc; j < sc + 3; j++)
                if (sudoku[i][j] == digit) return false;

        return true;
    }

    public static boolean solveSudoku(char[][] sudoku, int row, int col) {
        // base case
         if(row ==9){
            return true;
         }

        //  recursive

        int nextRow = row , nextCol = col+1;

        if(col+1==9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(sudoku[row][col]!='.'){
           return solveSudoku(sudoku, nextRow, nextCol);
        }

        for(char i='1'; i<='9'; i++){
            if(isSafe(sudoku, row, col, i)){
                sudoku[row][col] = i;
                if(solveSudoku(sudoku, nextRow, nextCol)){
                    return true;
                }
                    sudoku[row][col]  = '.';
            }


        }
        return false;
    }

    public static void main(String[] args) {
        char[][] sudoku = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (solveSudoku(sudoku, 0, 0)) {
            System.out.println("✅ Sudoku Solved Successfully:\n");
            printSudoku(sudoku);
        } else {
            System.out.println("❌ Sudoku not solvable");
        }
    }
}
