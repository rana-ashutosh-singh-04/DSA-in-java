import java.util.*;

public class MaxLengthChain{
    public static void main(String args[]){

        // O(n logn)
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        // sorting by lambda func
        Arrays.sort(pairs,Comparator.comparingDouble(O->O[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1];
        for(int i=0; i<pairs.length; i++){
            if(pairs[i][0]>chainEnd){
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println(chainLength);
    }
}