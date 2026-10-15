
public class heapSort {

    private static void heapify(int arr[], int si, int ei){
        int leftIdx = si*2+1;
        int rightIdx = si*2+2;
        int parIdx = si;

        if(leftIdx<ei && arr[leftIdx]>arr[parIdx]){
          parIdx = leftIdx;
        }

        if(rightIdx<ei && arr[rightIdx]>arr[parIdx]){
            parIdx = rightIdx;
        }

        if(parIdx!=si){
            // swap
            int temp = arr[si];
            arr[si] = arr[parIdx];
            arr[parIdx] = temp;

            heapify(arr, parIdx, ei);
        }
    }

    public static void hSort(int arr[]){
        
        // build maxHeap 
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify( arr,i,n);
        }

        // push largest elems at the end
        for(int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};

        hSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

    }
}