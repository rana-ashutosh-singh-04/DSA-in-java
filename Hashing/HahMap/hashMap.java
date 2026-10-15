
import  java.util.*;

public class hashMap{
    public static void main(String[] args) {
        HashMap<String,Integer> hmap  = new HashMap<>();

        hmap.put("India", 1000);
        hmap.put("America", 80);

        if(hmap.containsKey("India")){
            System.out.println(hmap.get("India"));
        }

        System.out.println(hmap);

    }
}