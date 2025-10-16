import java.util.*;

class pattern_demo{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

           
        }
         for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                if(i==0||j==0|| j==4||i==4){
                        System.out.print("*");
                    }
                    else{
                    System.out.print(" ");
                }
                }
                System.out.println();
            }


            }
    }


