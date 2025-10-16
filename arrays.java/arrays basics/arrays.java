import java.util.*;

public class arrays {

    public static void printSpiralMatrix(int arr[][]) {
        int sc = 0 ,sr=0 ;
        int ec=arr[0].length-1 , er=arr.length-1;
        int row ;
        int col;

        while (sc<=ec && sr <=er) {

            // print starting column from sc to ec
            col = sc;
            for( row=sr; row<=er && sc<=ec; row++){
                System.out.print(arr[row][col]+", ");
            }
            sc++;

            // print ending row from er to ec
            row = er;
            for(col=sc; col<=ec && sr<=er; col++){
                System.out.print(arr[row][col]+", ");
            }
            er--;

            // print ending column from ec to sr
            col = ec;
            for(row=er; row>=sr && sc<=ec; row--){
                System.err.print(arr[row][col]+", ");
            }
            ec--;
            // print ending row from sr to src
            row = sr;
            for(col=ec; col>=sc && sr<=er; col--){
                System.out.print(arr[row][col]);
            }

           
           } System.out.println();
    }

    // public subarrays
    public static void printSubarrays(int numbers[]){
        int ts = 0;
       
        for(int i=0; i<numbers.length; i++){
             int start =i;
             for(int j=i; j<numbers.length; j++){
                int end =j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    ts++; //subarrays
                }
                System.out.println();
             }
             System.out.println();

        }
         System.out.println("total subarrays = "+ ts);
    }

    
    public static void printPairs(int numbers[]){
        int tp= 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
        //    inner loop 
        for(int j=i+1; j<numbers.length; j++){
            System.out.print("("+ curr +"," +numbers[j]+")");
            tp++;
        }
        System.out.println("total pairs ="+tp);
        }
}
     
    // public static void reverse(int numbers[]){
    //     int first =0, last = numbers.length-1;

    //     while(first<last){
    //         // swap
    //         int temp = numbers[last];
    //          numbers[last]= numbers[first];
    //          numbers[first] = temp;

    //          first++;
    //          last--;

    //     }
    // }
//         public static int binary_Search(int numbers[], int key){
//              int start =0, end = numbers.length-1;
//              while(start <= end){
//                 int mid = (start + end) / 2;

//                 // comparisions
//                 if(numbers[mid]== key){
//                     return mid;
//                 }
//                 if(numbers[mid]<key){
//                      return mid;
//                 }
//                 else{
//                     // left
//                     end = mid-1;

//                 }
                
//              }
//              return -1;
//         }
//    public static int getLargest(int numbers[]){
//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//            for(int i=0; i<numbers.length; i++){
//                 if(largest<numbers[i]) {
//                         largest = numbers[i];
//                 }
              
//                         if(smallest>numbers[i]){
//                             smallest=numbers[i];
//                         }
//            }

//           System.out.println("smallest value is: " +smallest);
//           return largest;
//    }
   
   public static void main(String[] args) {
   
    // int numbers[] = {1,2,4,5,6,8,10};
    // printPairs(numbers);
    // printSubarrays(numbers);

    int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,17,20},{14,15,16,19,20},{21,25,22,24,23}};
    printSpiralMatrix(arr);
//    reverse(numbers);
//    for(int i=0; i<numbers.length; i++){
//     System.out.print(numbers[i]+" ");
//    }
//     int key= 234;
//    System.out.println("The largest value is :"+getLargest(numbers));
//    System.out.println(" Index for key is :" +binary_Search(numbers, key));
   }
}
