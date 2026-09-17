
public class deletionInBST{

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

    public static Node InOrderSuccessor(Node root){
        while(root!=null && root.leftNode!=null){
            root = root.leftNode;
        }
        return root;
    }

    public static Node deletionInBST(Node root, int k){
        if(root==null) return root;

        if(root.data==k){
            // leaf node
            if(root.leftNode==null && root.rightNode==null){
                return null;
            }
            // one child
            if(root.leftNode==null){
                return root.rightNode;
            }else if(root.rightNode==null){
                return root.leftNode;
            }
            // two child
            Node temp = InOrderSuccessor( root.rightNode);
            root.data = temp.data;

            root.rightNode = deletionInBST(root.rightNode,temp.data);

        }else if(root.data<k){
            root.rightNode = deletionInBST(root.rightNode,k);
        }else if(root.data>k){
            root.leftNode = deletionInBST(root.leftNode,k);
        }

        return root;
    }
    public static void main(String[] args) {
              int arr[] = {5, 3, 7, 2, 4, 6, 8};


        Node root = null;

        for(int i=0; i<arr.length; i++){
           root = createTree(root, arr[i]);
        };

        preOrderTraversal(root);

        System.out.println();
        deletionInBST(root,3);

        preOrderTraversal(root);

    }
}