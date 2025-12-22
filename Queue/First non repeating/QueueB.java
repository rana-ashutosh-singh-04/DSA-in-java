import java.util.*;

public  class QueueB {

    public static void printNonRepeating(String s){
        int freq[] = new int[26];
        Queue<Character> q  = new LinkedList<>();

        for(int i=0; i<s.length(); i++){
            q.add(s.charAt(i));
            freq[s.charAt(i)-'a']++;
            
            while (!q.isEmpty() && freq[ q.peek()-'a']>1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.println("-1"+"queue is e");
            }else{
                System.out.println(q.peek());
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        String s = "aabccbx";
        printNonRepeating(s);
    }

}
