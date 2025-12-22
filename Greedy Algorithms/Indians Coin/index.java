import java.util.*;

public class index{
    public static void main(String[] args) {
        
       Integer coin[] = {1,2,5,10,20,50,100,500,2000};

       Arrays.sort(coin, Comparator.reverseOrder());

       int CountOfCoins = 0;
       int amount = 590;
       ArrayList<Integer> ans = new ArrayList<>();

       for(int i=0; i<coin.length; i++){
        if(coin[i] <= amount){
            while (coin[i]<=amount) {
                CountOfCoins++;
                amount -= coin[i];
                ans.add(coin[i]);
            }
        }
       }

       System.out.println("total (min) coins used = "+ CountOfCoins);

       for(int i=0; i<ans.size(); i++){
        System.out.print(ans.get(i)+" ");
       }
       System.out.println();
    }
}