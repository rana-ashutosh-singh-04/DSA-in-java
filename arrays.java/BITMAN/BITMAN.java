import java.util.*;

public class BITMAN {

    public static void oddOrEven(int n){
        int bitMask =1;
        if((n & bitMask )== 0){
            //  even number 
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }

    }

    public static int getIthBith(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static boolean isPowerOFTwo(int n ){
         return (n&(n-1)) == 0;
         
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
    //     if( newBit ==0){
    //         return clearIthBit(n, i);
    //     }else{
    //         return setIthBit(n, i);
    //     }
                 n =clearIthBit(n, i);
                 int bitMask = newBit<<i;
                 return n| bitMask;
    }

    public static int clearIthBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearBitsINRange(int n, int i, int j){
        int a =((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n&1)!= 0)//check our LSB
            {
                count++;
            }n=n>>1;
        }return count;
    }

    public static int fastExpo(int a, int n){
        int ans =1;

        while(n>0){
            if((n& 1)!=0) {
                ans = ans *a;
                
            }
            a = a*a;
            n = n>>1;
           
        } return ans;
    }
    public static void swapWithoutotherVariable(int i, int j){
        System.out.println("Before swap: i="+i+" and y="+j);
        // swap using XOR
        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
     
        System.out.println("After swap :  i=" +i +"and j = "+j);
    }
    public static void main(String[] args) {
     swapWithoutotherVariable(10, 2);
    }
 
}
