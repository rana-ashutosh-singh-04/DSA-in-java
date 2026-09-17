
public class preorderTraversalBST{

    public static class Node{
        int data;
        Node leftNode ;
        Node rightNode ;

        Node(){};
        Node(int data){
            this.data = data;
            leftNode=null;
            rightNode=null;
        }
    }

    public static Node createTree(Node root,int k){

        if(root==null){
            Node newNode = new Node(k);

            return newNode ;
        }
        if(root.data<k){
          root.rightNode = createTree(root.rightNode, k);
        }else if(root.data>k){
           root.leftNode = createTree(root.leftNode,k);
        }

        return root;
    }

    public static void preOrderTraversal(Node root){

        if(root==null)return;
        System.out.print(root.data+" ");
        if(root.leftNode!=null) preOrderTraversal(root.leftNode);
        if(root.rightNode!=null)preOrderTraversal(root.rightNode);
    }
    public static void main(String[] args) {
              int arr[] = {5, 3, 7, 2, 4, 6, 8};


        Node root = null;

        for(int i=0; i<arr.length; i++){
           root = createTree(root, arr[i]);
        };

        preOrderTraversal(root);

    }
}