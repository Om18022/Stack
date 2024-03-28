package Stack;
import java.util.Stack;
public class RemoveAllAdjcentDuplicate {
    public static void main(String[] args) {
        String adj = "abbacda";
        Stack<Character> stack = new Stack<>();

        for(char c: adj.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else if(stack.peek() == c){
                stack.pop();
            } else{
                stack.push(c);
            }
        }
        System.out.println(stack);
    }
}
