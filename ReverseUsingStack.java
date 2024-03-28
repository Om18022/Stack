package Stack;
import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
        String s = "hello mini";
        Stack<Character> st = new Stack<>();

        for (int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        int i=0;
        while (!st.isEmpty()){
            System.out.print(st.pop());
        }

    }
}
