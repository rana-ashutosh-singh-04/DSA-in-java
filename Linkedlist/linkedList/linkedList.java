import java.util.LinkedList;

public class linkedList {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  Node head;
    public  Node tail;

    // PRINT METHOD
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public  void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public Node getMid(Node head){

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

        }
        return slow;

    }

    public  Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2 ;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        if(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        if(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;

    }

    public Node mergeSort(Node head){

        if(head == null || head.next == null){
            return head;
        }
        // find mid 
        Node mid = getMid(head);
        // left & right Ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList ();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head  = ll.mergeSort(ll.head);
       ll.print();

    }
}