package Stack;
import java.util.Stack;
public class PosttoPrefix {
    public static void main(String[] args) {
        String pos = "ab+";
        Stack<String> stack = new Stack<>();

        for(int i = 0 ; i<pos.length(); i++){
            if(pos.charAt(i) == '+' || pos.charAt(i) == '-' || pos.charAt(i) == '*' || pos.charAt(i) == '/' ){
                String f = stack.pop();
                String s = stack.pop();
                String inf = "(" + pos.charAt(i) +s  + f + ")";
                stack.push(inf);
            }else{
                stack.push(String.valueOf(pos.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
