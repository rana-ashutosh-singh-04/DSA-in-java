import java.util.*;

class spiralBoxPattern{
  
 public static void printSpiral(int matrix[][]) {
    int sr = 0;
    int sc = 0;
    int er = matrix.length-1;
    int ec = matrix[0].length-1;
    int row;
    int col;
    while (sr<=ec && er<=er) {
        // starting rows
        row = sr;
        for( col = sc; col<=ec; col++){
            System.out.print(matrix[row][col]+" ");
        }
        sr++;

        // ending cols
        col = ec;
        for(row = sr; row<=er ; row++){
            System.out.print(matrix[row][col]+" ");
        } 
        ec--;

        // ending rows;
        row = er;
        for( col=ec; col>=sc; col--){
            System.out.print(matrix[row][col]+" ");
        }
        er--;

        // starting col;
        col= sc;
        for( row = er; row>=sr ; row--){
            System.out.print(matrix[row][col]+" ");
        }
        sc++;
       
    }
 }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }

}