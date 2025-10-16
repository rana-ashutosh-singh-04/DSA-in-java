public class permutation {

    public static void printPermutation(String str, String ans){

         // base case
            if(str.length()==0){
                System.out.println(ans);
            }

         // recursion
            for(int i=0; i<str.length(); i++){
                char curr = str.charAt(i);

                String Newstring = str.substring(0, i)+str.substring(i+1);
                printPermutation(Newstring, ans+curr);
            }
    }
    public static void main(String[] args) {
        // Tc - n*n!
        //  NOTE : every n elements have n ! permutations
        String str = "abc";
        String ans = "";
        printPermutation(str,ans);

    }
}