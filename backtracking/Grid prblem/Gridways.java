import java.util.*;

public class Gridways{

   //brute force - > -----------O(2^n+m)-----------
    public static int gridWays(int i, int j, int n, int m){

        // base case
        if(i==n-1 && j==m-1){ // condn for last cell
            return 1;
        }else if(i==n || j==n){//boundry cross condn
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);

        return w1+w2;

    }
    public static void main(String args[]){
        // find number of ways to reach from (0,0) to (N-1, M-1) in a NXM Grid. Allowed moves -= right or Down 

        int n = 3, m=3;
        System.out.println(gridWays(0,0,n,m));


        /* linear time complexity O(n)
         * total characters = (n-1 + m-1)
         * repeating char = (N-1)D, (N-1)R
         * find permutations = (n-1 + m-1)!/(n-1)!(m-1)! =>>>>>>>>>>> O(n) for !(fact)
        */
    }
}