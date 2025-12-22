import java.util.*;

public class index{

    public static void unsortedAcitiviySelection(){
        int start [] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};

         // sorting
        int activities[][] = new int[start.length][3];

        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> shortform

        Arrays.sort(activities,Comparator.comparingDouble(O->O[2]));

        ArrayList<Integer> ans = new ArrayList<>();


        // 1st acitvity
        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        
        for(int i=0 ; i<activities.length ; i++){
             if(activities[i][1]>= lastEnd){
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
             }
        }

        System.out.println("max activities = " + maxAct);

        for(int i=0; i<ans.size(); i++){
        System.out.println("A"+ans.get(i)+" ");
        }System.out.println();
    }
    public static void main(String args[]){

        // unsorted activity selection
        unsortedAcitiviySelection();
        
        // sorted by end time
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st acitvity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i=0; i<end.length; i++){
            if(start[i]>= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("max activities = " + maxAct);

        for(int i=0; i<ans.size(); i++){
            System.out.println("A"+ans.get(i)+" ");
        }System.out.println();
    }
}