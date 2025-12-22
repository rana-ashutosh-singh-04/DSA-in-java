import java.util.*;

public class index {

     static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }  

    public static boolean isIdentical(node root, node subroot){
        if (root == null && subroot == null) {
            return true;
        }

        if (!isIdentical(root.left, subroot.left)) {
            return false;
        }

        if (!isIdentical(root.right, subroot.right)) {
            return false;
        }

        return true;


    }


    public static boolean isSubtree(node tree, node subtree){
        if(tree == null && subtree==null){
            return true;
        }

        if (tree.data == subtree.data) {
            if (isIdentical(tree,subtree)) {
                return true;
            }
        }

        return isSubtree(tree.left, subtree) || isSubtree(tree.right, subtree);
    }
    public static void main(String[] args) {
        
          node tree = new node(1);
        tree.left = new node(2);
        tree.right = new node(3);
        tree.left.left = new node(4);
        tree.left.right = new node(5);
        tree.right.left = new node(7);
        tree.right.right = new node(6);

        node subtree = new node(2);
        subtree.left = new node(4);
        subtree.right = new node(5);

        System.out.println(isSubtree(tree, subtree));
    }
}
