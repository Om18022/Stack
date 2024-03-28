package Stack;
import java.util.Stack;
public class PosttoInfix {
    public static void main(String[] args) {
        String pos = "ab+";
        Stack<String> stack = new Stack<>();

        for(int i = 0 ; i<pos.length(); i++){
            if(pos.charAt(i) == '+' || pos.charAt(i) == '-' || pos.charAt(i) == '*' || pos.charAt(i) == '/' ){
                String f = stack.pop();
                String s = stack.pop();
                String inf = "(" + s + pos.charAt(i) + f + ")";
                stack.push(inf);
            }else{
                stack.push(String.valueOf(pos.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
