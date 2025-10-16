import java.lang.reflect.Array;
import java.util.*;

public class recursion{

    public static boolean isSorted( int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
         return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound ==-1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }

       int halfPower= optimizedPower(a,n/2);
       int halfPowerSq = halfPower*halfPower;

    //    n is odd
    if(n %2 !=0){
        halfPowerSq = a * halfPowerSq;
    }
    return halfPowerSq;
    }
    public static void main(String[] args) {
         
         int a= 2;
         int n = 5;
         System.out.println(optimizedPower(a, n));
    }
}