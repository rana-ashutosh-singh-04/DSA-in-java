import java.util.*;

class optimizedPower {
    public static void main(String[] args) {
    //     int x , n;
    //     x = 2;
    //     n = 5;
    //   System.out.println( getPower(x, n));
    //   System.out.println(tilingProblem(4));  
    }


    public static int getPower(int x , int n){
        if(n==1){
            return x;
        }
        
       int xPowern = x * getPower(x, n-1);
       return xPowern;
    }

    public static int tilingProblem(int n){


        if(n==0 || n ==1){
            return 1;
        }

        // vertical 
        int totalMethod = tilingProblem(n-1);

        // Horizontal 
        int Horizontal = tilingProblem(n-2);

        int toWays = totalMethod + Horizontal;
        return toWays;
    }
}
