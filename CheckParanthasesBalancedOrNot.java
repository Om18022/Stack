package Stack;
import java.util.Stack;
public class CheckParanthasesBalancedOrNot {
    public static void main(String[] args) {
        String s="{}{[)]}";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='{' || c=='[' || c=='('){
                stk.push(c);
            }else {
                if (stk.isEmpty())
                    return false;
                if ((c=='}' && stk.peek() != '{') || (c==']' && stk.peek() != '[') || c==')' && stk.peek() != ')'){
                    return false;
                }
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
}
