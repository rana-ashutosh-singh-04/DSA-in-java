import java.util.*;

public class DiameterOfATree{

    static class node{
        int data;
        node left ;
        node right;

        public node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
         }
    }

    public static int height(node head){
        if(head==null){
            return 0;
        }

        int leftHeight = height(head.left);
        int rightHeight = height(head.right);

        return  Math.max(leftHeight, rightHeight)+1;
    }

    public static int treeDiameter(node head){

        if(head == null){
            return 0;
        }

        int leftDiameter = treeDiameter(head.left);
        int leftHeight = height(head.left);

        int rightDiameter = treeDiameter(head.right);
        int rightHeight = height(head.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(rightDiameter, leftDiameter));

    }

    static class Info{
        int ht;
        int diameter;

        public Info(int ht, int diameter){
            this.ht = ht;
            this.diameter = diameter;
        }
    }

    public static Info treeDiameter2(node head){

        if(head==null){
            return new Info(0, 0);
        }
        
        Info leftInfo = treeDiameter2(head.left);
        Info rightInfo = treeDiameter2(head.right);

        int diameter = Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),(leftInfo.ht+rightInfo.ht+1));
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(ht, diameter);
    }
    public static void main(String[] args) {
        node head = new node(1);
        head.left = new node(2);
        head.right = new node(3);
        head.left.left = new node(4);
        head.left.right = new node(5);
        head.right.left = new node(6);
        head.right.right = new node(7);

        System.out.println(treeDiameter(head));
        System.out.println(treeDiameter2(head).diameter);
    }
}