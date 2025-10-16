import java.util.Scanner.*;
class removeDuplicate{
    public static void main (String args[]){
        String str = "appnaacollegee ";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
       System.out.println(frinedPairing(3) );  
    }
     public static void removeDuplicates(String str , int idx, StringBuilder newStr, boolean map[]){

        if(idx == str.length()-1){
            System.out.println(newStr);
            return;
        }
       char currChar = str.charAt(idx);
       if(map[currChar-'a'] == true){
        removeDuplicates(str, idx+1, newStr, map);
       }else{
        newStr.append(currChar);
        map[currChar-'a']=true;
        removeDuplicates(str, idx+1, newStr, map);
       }
         
    }

    public static int frinedPairing(int n) {
        // base Case
        if(n==1 || n==2){
            return n;
        }
       return frinedPairing(n-1)+(n-1)*frinedPairing(n-2);
    }
}