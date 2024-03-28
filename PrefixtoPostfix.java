package Stack;
import java.util.Stack;
public class PrefixtoPostfix {
    public static void main(String[] args) {
        String pre = "+ab";
        Stack<String> stack = new Stack<>();

        for(int i =pre.length()-1 ; i>=0; i--){
            if(pre.charAt(i) == '+' || pre.charAt(i) == '-' || pre.charAt(i) == '*' || pre.charAt(i) == '/' ){
                String f = stack.pop();
                String s = stack.pop();
                String inf = "(" + f  + s + pre.charAt(i)+ ")";
                stack.push(inf);
            }else{
                stack.push(String.valueOf(pre.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
