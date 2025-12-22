import java.util.ArrayList;
import java.util.Collections;
public class ArraysList{

    public static void SwapArraysList(ArrayList<Integer> list , int idx1, int idx2) {

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);// O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,5); //O(n)
        System.out.println(list);

        // System.out.println(list.get(2));//O(1)

        // list.remove(2);
        // System.out.println(list);//O(n)

        // list.set(2, 6);
        //   System.out.println(list);//O(n)

        // System.out.println(list.contains(6)); //O(n)

        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }

        // // reverse
        //  for(int i=list.size()-1; i>=0; i--){
        //     System.out.println(i);
        //  }

        // int max = Integer.MIN_VALUE;

        // for(int i=0; i<list.size(); i++){
        //     if(max<list.get(i)){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);

        // int idx1 = 1, idx2 = 3;
        // SwapArraysList(list,idx1, idx2);
        // System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

         // Sorting in reverse order
         
         Collections.sort(list,Collections.reverseOrder());
        //  reverse order is a comperator fnx
         System.out.println(list);

    } 
}