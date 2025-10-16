import java.util.*;

class searchInRotatedarray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,8};
        System.out.println(searchInRotatedarray(arr, 7, 0, arr.length));

    }

    public static int searchInRotatedarray(int arr[], int target, int si, int ei) {
        
        int mid = si + (ei-si)/2;

        if(arr[mid]==target){
            return mid;
        }
        // left line 
        if(arr[si]<=arr[mid]){

            // left 
            if(arr[si]<=target && target<=arr[mid]){
                return searchInRotatedarray(arr, target, si,mid-1);
            }
            else{
            return searchInRotatedarray(arr,target,mid+1,ei);
        }
        }
        
        // mid on L2
        else{
            // case c: right
            if(arr[mid]<=target &&  target <= arr[ei]){
                return searchInRotatedarray(arr, target, mid+1, ei);
            } else{
                // case d : left 
                return searchInRotatedarray(arr, target, si, mid-1);
            }
        }
    }
}