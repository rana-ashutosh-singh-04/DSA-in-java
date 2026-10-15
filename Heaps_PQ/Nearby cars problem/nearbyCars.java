import java.util.*;

public class nearbyCars {

    public class  Point implements Comparable<Point> {
        int x;
        int y;
        int distSq ;
        int idx;

        public Point(int x,int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
       public int compareTo(Point p2){
        return this.distSq - p2.distSq;
       }

        
    }
    
    void main() {

        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[][] = new int[n][2];

        for (int i = 0; i <n ; i++){
            
                arr[i][0]=sc.nextInt();
                arr[i][1] = sc.nextInt();
            
        }

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++){ 
            int distSq = Math.powExact(arr[i][0], 2)+Math.powExact(arr[i][1],2);
            pq.add(new Point(arr[i][0], arr[i][1], distSq,i));
        }

        for(int i=0; i<k; i++){
            System.err.println("c"+pq.remove().idx);
        }

    }
}