package Stack;
import java.util.Stack;
public class CheckStringPalindromeOrNotUsingStack {
    public static void main(String[] args) {
        String s = "ollo";
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i<s.length(); i++){
            st.push(ch[i]);
        }
        for (char c:ch){
            if (st.pop() != c){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
