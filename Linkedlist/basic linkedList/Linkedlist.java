public class Linkedlist {

    public static class Node{
        int data;
        Node next; 

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void  addFirst(int data){
        // step 1 = create a new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }

        // step-2 = newNode next = head;
        newNode.next = head;

        // step-3 = head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // step-1 = create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step-2 = tail next = newNode
        tail.next = newNode;

        // step-3 = newNode = tail
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printll(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;

        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
        
    }

    public static int removeLast(){
        if(size==0){
            System.out.println("can't delete elements, LL is empty");
            return 0;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public static int alt_search(int target){  //O(n)
        Node temp = head;
        int i = 0;
        while ( i<size) {
            if(temp.data == target){
                return i;
            }
            temp = temp.next;
            i++;

        }

        return -1;
    }

    public static int helper( Node head, int key){
        if(head==null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head, key);
        if(idx == -1 ){
            return -1;
        }

        return idx +1;
        
    }

    public static int rec_search(int target ){
        return helper(head, target);
    }

    public static void rev_linkedlist(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void deleteNthfromEnd(int n) {
        //  calculate size 
        int sz =0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if(sz == n){
            head = head.next;
            return;
        }

        // sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next!=null && fast.next.next!=null) {
            slow = slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;

    }

    public static boolean checkpalindrome(){
        if(head==null || head.next==null){
             return true;
        }

        // find mid
        Node midNode = findmid(head);
       
        // reverse to the mid
        Node prev = null;
        Node curr = midNode;
        Node next ;
        while (curr!=null) {
            next = curr.next;
           curr.next = prev;
            prev = curr;
            curr = next;

        }
        
        Node right = prev;  // right half-head
        Node left = head;

        while (right!=null) {
            if(left.data!= right.data){
                return false;
            }
            left=left.next;
            right= right.next;
        }
        return true;
    }
    public static void main(String[] args) { //O(n)
        Linkedlist ll = new Linkedlist();
        ll.addFirst(2);
        ll.addLast(2);
        ll.addLast(2);
        ll.printll();
        System.out.println(checkpalindrome());


        // ll.addLast(4);
        // ll.add(2, 9);
        // // ll.removeFirst();
        // System.out.println(size);
        // // ll.removeLast();
        // ll.printll();
        // System.out.println(alt_search(9));
        // ll.rev_linkedlist();
        // ll.printll();
        // deleteNthfromEnd(3);
        // ll.printll();

    }
}
