import java.util.*;

class recurrsion{

    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }

    public static int printFactorial(int n){
        if( n==0){
            return 1;
        }
        int  fn = n * printFactorial(n-1);
        return fn;
    }

    public static int sumFirstN(int n){
        if(n==1){
            return 1;
        }
        int sfn = n + sumFirstN(n-1);
        return sfn ;
    }

    public static int printFibbonacci (int n ) {
        // SPACE COMPLEXITY = (o)n;
        // TIME COMPLEXITY = (2^n);

        if(n==0 || n==1){
            return n;
        }
        int fbnm1 = printFibbonacci(n-1);
        int fbnm2 = printFibbonacci(n-2);
        int fb = fbnm1 + fbnm2;
        return fb;
    }

    public static boolean issortedArrays(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        
        if(arr[i]>arr[i+1]){
            return false;
        }

       return issortedArrays(arr, i+1);
    }

    public static int firstArray(int arr[], int key, int i){

        
        if(i == arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return firstArray(arr, key, i+1);
    }

    public static int printPower (int x, int n){
        if(n==1){
            return x;
        }
         x = x * printPower(x,n-1);
         return x;
    }
    public static void main(String[] args) {
        // 1 > print no. in increasing order
        // printInc(4);

        // 2 > print no. in decreasing order
        // printDec(5);

        // 3 > print factorial of N 
        // System.out.println(printFactorial(3));

        // 4> Print sum of first n natural no..
        // System.out.println(sumFirstN(3));

        // 4 > Print nth fibonnaci number
        // System.out.println( printFibbonacci(23));  
        
        //5> check if array is sorted 
        // int arr[] = {3,3,32,4,2,2};
        // int i=0;
        // System.out.println(issortedArrays(arr,i));

        // 6> check for first arrayElement 
        //     int arr[] = {3,4,45,35,2,2,2};
        //     int key = 2;
        //     int i=0;
        //    System.out.println( firstArray(arr, key, i));

        // 7> find (x,n)
         int x = 3;
         int n = 1;
         System.out.println(printPower(x,n));

         

    }
}