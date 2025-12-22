import java.util.*;

public class BinaryTreesB{

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
       static int idx = -1;
       public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]== -1){
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
       }

        public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+ " ");
    }

    // Level order Traversal
    public static void LevelOrderTraversal(Node root){
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if(currNode == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }

            }
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0 ;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh);
    }
        
    }

   

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);

        // tree.preOrder(root);

        // System.out.println();

        // tree.inOrder(root);

        // System.out.println(); 

        // tree.postOrder(root);

        // tree.LevelOrderTraversal(root);

        System.out.println(tree.height(root));
    }
}