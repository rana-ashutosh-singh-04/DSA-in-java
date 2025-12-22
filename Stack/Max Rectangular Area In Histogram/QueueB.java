import java.util.*;

public class QueueB {

    public static void maxArea(int arr[]){
        int n = arr.length;
        int nsr[] = new int[n];
        int nsl[] = new int[n];
        int maxArea = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        // Next smaller right 
        for(int i=n-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i] ) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next smaller left

        s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Current Area

        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int CurrentArea = height * width;
            maxArea = Math.max(CurrentArea, maxArea);
        }
        System.out.println("max area in histogram = " + maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; // heights in histogram
        maxArea(arr);
    }
}