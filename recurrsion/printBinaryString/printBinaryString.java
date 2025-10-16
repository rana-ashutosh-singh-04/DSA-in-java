import java.util.*;

public class printBinaryString {
    Scanner sc = new Scanner(System.in);
     
    public static void main(String[] args) {
        printBinaryString(3, 0, new String(""));
    }

    public static void printBinaryString(int n ,int lastplace, String s){

        if(n==0){
            System.out.println(s);
            return;
        }

        printBinaryString(n-1, 0, s+"0");
        if(lastplace == 0){
             printBinaryString(n-1, 1, s+"1");
        }
        
    }
}
