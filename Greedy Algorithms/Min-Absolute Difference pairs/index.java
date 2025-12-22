import java.util.*;

public class index{
    public static void main(String[] args) {
        // O(n logn)
        Scanner sc = new Scanner(System.in);
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int maxDiff = 0; 

        for(int i=0; i<A.length; i++){
           maxDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("min absolute difference of pair"+maxDiff);
    }
}