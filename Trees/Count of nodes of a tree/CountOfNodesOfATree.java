import java.util.*;

public class CountOfNodesOfATree{

    static class node{
        int data;
        node left, right;

        public node(int data){
            this.data = data;
             this.left = null;
             this.right = null;
        }
    }

    public static int countOfNodes(node tree ){
        if(tree == null){
            return 0;
        }
        
        int leftCount = countOfNodes(tree.left);
        int rightCount = countOfNodes(tree.right);
        
        return leftCount+rightCount+1 ;
    }

    public static int SumOfNodes(node tree){
        if(tree == null){
            return 0 ;
        }

        int sumOfLeft = SumOfNodes(tree.left);
        int sumOfRight = SumOfNodes(tree.right);

        return sumOfLeft + sumOfRight + tree.data;
    }
    
    public static void main(String[] args) {
        node tree = new node(1);
        tree.left = new node(2);
        tree.right = new node(3);
        tree.left.left = new node(4);
        tree.left.right = new node(5);
        tree.right.right = new node(6);

        System.out.println(countOfNodes(tree));

        System.out.println(SumOfNodes(tree));
    }
}