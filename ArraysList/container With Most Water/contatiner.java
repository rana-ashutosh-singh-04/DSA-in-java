import java.util.ArrayList;

public class contatiner{

    // ----------------- 2 pointer approach -------------------------

    public static void storeWater(ArrayList<Integer> height){
        int n = height.size();
        int lp = 0;
        int rp = n-1;
        int maxWater = 0;

       while (lp<rp) {
        // calculate water area
        int ht = Math.min((height.get(lp)), height.get(rp));
        int width = rp-lp;
        int currWater = ht * width;
        maxWater = Math.max(maxWater, currWater);

        // update ptr
        if(height.get(lp)<height.get(rp)){
            lp++;
        }else{
            rp--;
        }

       }
        System.out.println(maxWater);

    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    // -----------------------BRUTE FORCE-------------
    // public static void storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     // brute f
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=0; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = i-j;
    //             int currWater = ht*width;
    //              maxWater = Math.max(maxWater, currWater);
    //         }
    //     }

    //     System.out.println(maxWater);
    // }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();

        // 1,8,6,2,5,4,5,3,7

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(3);
        height.add(7);
        storeWater(height); //O(n^2)   //---------BRUTE FORCE----------4
        
        
    }
}