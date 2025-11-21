import java.util.*;

public class pairsum{
    /* ----------brute force ---------
    public static boolean ispairsum(ArrayList<Integer>list,int key){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==key){
                    return true;
                }
            }
        }
        return false;
    }*/

    // -------- 2 pointer approach ------------

    public static boolean ispairsum(ArrayList<Integer>list,int key){
        int lp = 0;
        int rp = list.size()-1;

        while (lp != rp) {
            // case 
            if (list.get(lp)+list.get(rp)==key) {
                return true;
            }

            if(list.get(lp)+list.get(rp)<key){
                lp++;
            }

            if ((list.get(lp)+list.get(rp))>key){
                rp--;
            }
        }
        return false;
    }
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    int key = 4;

    System.out.println(ispairsum(list, key));
 }
}
