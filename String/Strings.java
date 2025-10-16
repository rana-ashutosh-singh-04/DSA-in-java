import java.util.*;

public class Strings {
    public static void printLetters(String str) {
        for(int i = 0 ; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length()-1;
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        } return true;        
     }
    
     public static float getShortestPath(String path){
        int x= 0, y=0;
        for(int i=0; i<path.length(); i++){
            int dir = path.charAt(i);
            // North
            if(dir == 'N'){
                y++;
            } // South
            else if(dir == 'S'){
                y--;
            } //East
            else if(dir == 'E'){
                x++;
            }// West
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
     }
     public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr+=str.charAt(i);
        }
        return subStr;
     } 
     public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");
        
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<=str.length()-1){
                sb.append(str.charAt(i) );
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }return sb.toString();
     }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    //    String str = "Aman";
    //    String str2 = new String(" Rajawat");

    //    String str1 = sc.next();
    //   String str2 = sc.nextLine();
    //   System.out.print(str1 +str2);

    // in string .length() is a function but not in arr -> arr.length
        //  String fullName = "Tony Stark";
        //  System.out.println(fullName.length());

    // -------Concatenation-------sum-up of 2 or more elements(in java by adding sign of '+')
    // String firstName = "Ashutosh";
    // String lastName = "singh";
    // String fUllName = firstName + " " + lastName;
    // System.out.println(fUllName );

    // ----------string charAt Method---------
    // printLetters(fUllName);

    // ------------Palindrome-------------
    // String str = "nsaa";
    // System.out.println(isPalindrome(str));
     
    // -q2- Given a rooute containing 4 directions (E,W,N,S), find the 'shortest' path to reach destiantion.
    //  String path = "WNEENESENNN";
    //  LOGIC --------N-> Y+1
             //       S -> y-1
             //        W -> x-1
             //        E -> x+1
            //  System.out.println(getShortestPath(path));

   // --------  String Function - compare
        //  String s1 = "Tony";
        //  String s2 = "Tony";
        //  String s3 = new String("Tony");
        //  if(s1 == s2){
        //     System.out.println("s1 and s2 are equal");
        //  }else{
        //     System.out.println("s1 and s2 are not equal");
        //  }
          
        //  if(s1 == s3 ){
        //     System.out.println("s1 and s3 are equal");
        //   } else {
        //   System.out.println("s1 and s3 are not equal");
        //  }

    // -----------for Compairing the values inside the String
        // if(s1.equals(s3)){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }

    // ---------Substring(sub-Sequence)------------------
            //    String str = "Hello world";
            //    System.out.println(subString(str, 0, 5));

    //q3>-----For a given set of String, Print the largest string
    // Lexicograph comparison of string
    // String fruit[] = {"Appple", "mango" , "banana"};
    // String largest = fruit[0] ;
    // for(int i=1; i<fruit.length; i++){
    //     if(largest.compareTo(fruit[i])<0){
    //         largest = fruit[i];
    //         }
    //     }

    // ----------------------------StringBullder - same as String but quick and easy and mutable reducedes time complexity in loop and in copying element--------------------
    // StringBuilder sb = new StringBuilder("");
    // for(char ch='a'; ch<='z'; ch++){
    //     sb.append(ch);
    // }-------------------String - O(27*n) and StingBuilder(27)
    // sb.toString();
    // System.out.println(sb);

    // q4>------------ For a given String convert each the first letter of each word to uppercase.-------------------------------

    //  String str = "hi, i am Shradha";
    //  System.out.println(touppercase(str));

    // q5> --------- String Comression----------- 

    // String of time complexity O(n)
    String str = "aaabbcccdd";
   
    String newStr = "";
    for(int i=0; i<str.length(); i++){
       
      Integer count = 1;
      while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
        count++;
        i++;
      }
      newStr += str.charAt(i);
      if (count>1) {
        newStr +=count.toString(i);
      }
     
      
    } System.out.println(newStr);
    }
}
