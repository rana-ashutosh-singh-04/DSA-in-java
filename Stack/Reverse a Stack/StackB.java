import java.util.*;
public class StackB{

    public static void printStack(Stack<Integer> s ){
        if(s.isEmpty()){
            return ;
        }

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data );
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int data = s.pop();
        reverseStack(s);
        pushAtBottom(s,data);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //-------- 3>2>1----------
        reverseStack(s);

        // ------1>2>3-----------
        printStack(s);
    }
}