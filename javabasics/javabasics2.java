// import java.util.*;
// public class javabasics2{
// public static void main(String args[]){
//     // char cha = 'a';
//     // int number = cha ;
//     // System.out.println(number);
//     // char chara ='b';
//     // int number2= chara;
//     // System.out.println(number2);

//     byte b = 5;
//     byte a = (byte)(b*2);
//     System.out.println(a);
// }
// }

// qes- 1 : In a program,input 3 numbers : A,BandC. You have to output the average of these 3 numbers

// import java.util.*;

// public class javabasics2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number:");
//         int A = sc.nextInt();
//         System.out.println("Enter the second number:");
//         int B = sc.nextInt();
//         System.out.println("Enter the third number");
//         int C = sc.nextInt();

//         int average= (A+B+C)/3;
//         System.out.println(average);
//     }
     
// }
// import java.util.*;
// // Average of 3 numbers
// public class javabasics2 {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int A=sc.nextInt();
//         int B=sc.nextInt();
//         int C=sc.nextInt();
//         int average= (A+B+C) /3;
//         System.out.println("average is : "+average);
//     }
// }

//ques- In a program, input the side of a square. You have to output the area of square

// import java.util.*;
// public class javabasics2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int S = sc.nextInt();
//         int area = S*S;
//         System.out.println(area);
//     }
// }

//Enter cost of 3 items from the user (using float data types )-a
//a pencil, a pen , and an eraser .you have to output the total cost of the 
// items back to the items in the bill as an advanced problem) 

import java.util.*;

public class javabasics2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of a pencil ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of a pencil ");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of a pencil ");
        float eraser = sc.nextFloat();
        float total = pen+pencil+eraser;
        System.out.println("The total bill is:"+total);

        //Add on- with 18% tax 
        float newtotal = total + ( 0.18f*total);
        System.out.println("Bill with GST is : " + newtotal);
    }
}