import java.util.*;

public class BFS_inAdjList{

    public static void TraverseBFS(ArrayList<ArrayList<Integer>> adj, int v){
        v= 5;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean[] isVis = new boolean[v];
        isVis[0] = true;
        ArrayList<Integer> arr = new ArrayList<>();
        while(!q.isEmpty()){
            int vetx = q.remove();
            arr.add(vetx);
            int e = adj.get(vetx).size();

            for(int i=0; i<e; i++){
                int vertex = adj.get(vetx).get(i);
                if(!isVis[vertex]){
                    q.add(vertex);
                    isVis[vertex] = true;
                }
            }
        }

        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

    
    public static void main(String[] args) {

        int v = 5;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i=0; i<v; i++){
            adjList.add(new ArrayList<>());
        }

          // Add undirected edges
        adjList.get(0).add(1);
        adjList.get(1).add(0);

        adjList.get(0).add(3);
        adjList.get(3).add(0);

        adjList.get(1).add(2);
        adjList.get(2).add(1);

        adjList.get(1).add(3);
        adjList.get(3).add(1);

        adjList.get(2).add(4);
        adjList.get(4).add(2);

        adjList.get(3).add(4);
        adjList.get(4).add(3);

        TraverseBFS(adjList, v);

    }
}