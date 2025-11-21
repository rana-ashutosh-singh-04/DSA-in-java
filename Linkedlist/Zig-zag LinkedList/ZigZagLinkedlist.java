import java.util.*;

public class ZigZagLinkedlist{

    public static class  node {
        int data;
        node next;

        public  node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public node head;
        public node tail;

    
    public  void addFirst(int data){
        node newNode = new node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void zigZag(){
        // find mid

        node fast = head.next;
        node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
         node mid = slow;

        // reverse 2nd half matrix

        node curr = mid.next;
        mid.next = null;
        node prev = null;
        node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        node left = head;
        node right = prev;
        node nextL, nextR;

        // zigZag // alt the matrix
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public void printll(){
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data+" ");
             temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ZigZagLinkedlist ll = new ZigZagLinkedlist();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll);
        ll.zigZag();
        System.out.println(ll);
        ll.printll();
    }
}