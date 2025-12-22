import java.util.*;

class newfile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
       if(x%3==0 && x%2==0){
        System.out.println("Divisible by 6");
       }else{
        System.out.println("not divisible by 6");
       }

        // System.out.println(x*y);
    }
}