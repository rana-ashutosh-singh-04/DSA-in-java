import java.util.Stack;

public class StackB {

    public static boolean isValid(String str ){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){

            char c = str.charAt(i);
            if(c == '(' || c=='[' || c=='{'){
                s.push(c);
            }else{
               if(s.isEmpty()){
                return false;
               }

               if((s.peek()=='(' && c==')')|| (s.peek()=='{' && c=='}')||(s.peek()=='['&& c==']')){
                s.pop();
               }else{
                return false;
               }
            }
        }
        return s.isEmpty();
    }
    
    public static void main(String[] args) {
        String str = "[]";
        System.out.println(isValid(str));
    }
}
