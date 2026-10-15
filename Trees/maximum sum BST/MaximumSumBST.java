
public class MaximumSumBST {

    public static class Node{
        int data;
        Node left;
        Node right;




        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static  class Info{
        int max;
        int min;
        boolean isBSt;
        int sum;
        int currMax;

        Info(){
            this.max = 0 ;
            this.min = 0;
            this.isBSt = true;
            this.sum = 0;
            this.currMax = currMax;
        }

        Info(int max, int min, boolean  isBST, int sum, int currMax){
            this.max = max;
           this.min = min;
           this.isBSt = isBST;
           this.sum = sum;
           this.currMax = currMax;
            
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);

        root.left = new Node(14);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        root.right.left = new Node(19);
        root.right.right = new Node(1);
    }
}
