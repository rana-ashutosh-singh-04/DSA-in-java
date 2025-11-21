import java.util.*;

public class DoubleLinkedlist{

    public class node {
        int data ;
        node next;
        node prev;

        public node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        
    }

    public static node head;
    public static node tail;
    public static int size;
    
    // addFirst in double linkedList
    public void addFirst(int data){
        node newNode = new node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
         newNode.next = head;
        head.prev = newNode;
        head = newNode;
        
        
    }

    // print doubleLinkedlist
    public void printDoubleLinkedlist(){
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //-------- removeFirst---------- node from double linkedList

    public int removeFirst(){
        if(head==null){
            return Integer.MIN_VALUE;
        }else if(head==tail){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int temp = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return temp;
    }


    public static void main(String[] args) {
        DoubleLinkedlist dll = new DoubleLinkedlist();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.printDoubleLinkedlist();
        System.out.println(size);
        dll.removeFirst();
        dll.printDoubleLinkedlist();
        System.out.println(size);

    }
}