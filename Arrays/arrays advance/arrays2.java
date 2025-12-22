import java.util.*;

public class arrays2 {

//   public static boolean search(int matrix[][], int key){
//     for(int i=0; i<matrix.length; i++){
//     for(int j= 0; j<matrix[0].length; j++){
//      if(matrix[i][j] == key){
//       System.out.println("found at cell (" + i + "," + j+")");
//       return true;
//      }
//     }
   
// }
// System.out.println("key not found");
// return false;

//   }
   
//   public static void matrix_col(String[] args) {

//      int matrix[] [] = new int [3] [3] ;
//         int n =matrix.length , m= matrix[0].length;

//           Scanner sc = new Scanner(System.in);
//           for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//           }

        
//         for(int i=0; i<n; i++){
//             for(int j= 0; j<m; j++){
//                System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix, 5);
//     }



//     public static void printSpiral(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length - 1;
//         int endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             for (int i = startCol; i <= endCol; i++) {
//                 System.out.print(matrix[startRow][i] + " ");
//             }
//             startRow++;

//             for (int i = startRow; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }
//             endCol--;

//             for (int i = endCol; i >= startCol; i--) {
//                 if (startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][i] + " ");
//             }
//             endRow--;

//             for (int i = endRow; i >= startRow; i--) {
//                 if (startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }
//             startCol++;
//         }
//         System.out.println();
//     }

//     // public static void main(String[] args) {
//     //     int matrix[][] = {
//     //             {1, 2, 3, 4},
//     //             {5, 6, 7, 8},
//     //             {9, 10, 11, 12},
//     //             {13, 14, 15, 16}
//     //     };

//     //     printSpiral(matrix);
//     // }
// // }
//   public static int diagonalSum(int matrix[][]) { //o(n^2)
//   int sum =0;

//   // for(int i=0; i<matrix.length; i++){
//   //   for(int j=0; j<matrix[0].length; j++){
//   //      if(i==j){
//   //       sum+= matrix[i][j];
//   //      }
//   //      if(i+j==matrix.length-1){
//   //       sum+= matrix[i][j];
//   //      }
//   //   }
//   for(int i=0; i<matrix.length; i++){
//     // pd
//     sum+=matrix[i][i];
//     // sd
//     if(i!=matrix.length-1-i)
//        sum+=matrix[i][matrix.length-i-1];
//   }return sum;
// }
  
  public static boolean stairCasesearch(int matrix[] [] , int key){
    int row =0, col =matrix[0].length-1;

    while(row<matrix.length && col>= 0) {
        if(matrix[row][col]== key){
            System.out.println("found key at (" + row + "," + col +")");
            return true;
        }
       else if(key<matrix[row][col]){
        col--;
       }
       else {
        row++;
       }
    }
    System.out.println("key not found!");
    return false;
  }

    public static void main(String[] args) {

      int matrix[][] = {{10,20,30,40,},
                        {15,25,35,45,},
                        {27,29,37,48},
                        {32,33,39,50}};

    int key = 33;
    stairCasesearch(matrix, key);
    }
}