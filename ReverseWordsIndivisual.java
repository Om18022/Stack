package Stack;
import java.util.Stack;
public class ReverseWordsIndivisual {
    public static void main(String[] args) {
        String s = "hello mini";
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i<s.length(); i++){
            if (ch[i]==' '){
                while (!st.isEmpty()){
                    System.out.print(st.pop());
                }
                System.out.print(' ');
            }else {
                st.push(ch[i]);
            }
        }
        while (!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
