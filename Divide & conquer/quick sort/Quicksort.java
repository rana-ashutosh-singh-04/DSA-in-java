import java.util.*;

class Quicksort{

    // public static void PrintArr(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+ " ");
    //     }
    //     System.out.println();
    // }

    // public static void Quicksort(int arr[], int si, int ei){
    //     // base 
    //     if(si>=ei){
    //         return ;
    //     }

    //     // last element
    //     int pIdx = partition(arr,si,ei);
    //     Quicksort(arr,si,pIdx-1); // left
    //     Quicksort(arr,pIdx,ei);  // right
    // }

    // public static int partition(int arr[], int si, int ei){
    //      int pivot = arr[ei];
    //      int i = si-1; // to make place for elements smaller than pivot

    //      for(int j=si; j <ei; j++){
    //         if(arr[j]<=pivot){
    //             i++;
    //             // swap
    //             int temp  = arr[j];
    //             arr[j]= arr[i];
    //              arr[i] = temp; 
    //         }
    //      }
    //       i++;
    //             // swap
    //             int temp  = pivot;
    //             arr[ei]= arr[i];
    //              arr[i] = temp; 
    //              return i;
    // }
    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        Quicksort(arr, 0, arr.length-1);
        PrintArr(arr);
    }

    public static void Quicksort(int arr[], int si, int ei) {
        
        if(si>=ei){
            return;
        }
        
        int pIdx =partition(arr, si, ei);
        Quicksort(arr, si, pIdx-1);
        Quicksort(arr,pIdx,ei);

    }

    public static int partition(int arr[], int si, int ei){
            int i=-1;
            int pivot = arr[ei];
            for(int j=0; j<ei; j++){
                if(arr[j]<pivot){
                    i++;
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[ei];
                    arr[j] = temp;
                }
                
            }
             i++;
                    // swap
                    int temp = pivot;
                    arr[ei] =arr[i];
                    arr[i] = temp;
                    return i;
        }

    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}