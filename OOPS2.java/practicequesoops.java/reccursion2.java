import java.util.*;

public class reccursion2 {

    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc =new Scanner(System.in);
        String K = sc.nextLine();
	    String S ="WECNITK";
	
	    if (S==K) {
	        System.out.println("welcome to web club");
	    }else{
	        System.out.println("Access denied");
	    }
    // public static int tilingProblem(int n){//2 x n (floor Size)
    //     // base case
    //     if(n==0|| n==1){
    //         return 1;
    //     }
    //     // kaam
    //     //vertical choice
    //     int fnm1 = tilingProblem(n-1);

    //     //horizontal choice
    //     int fnm2 = tilingProblem(n-2);

    //     int totalWays = fnm1 + fnm2;
    //     return totalWays;
    // }
    // public static void main(String[] args) {
    //     System.out.println(tilingProblem(3));
    // }
    }}