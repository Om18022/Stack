package Stack;
import java.util.Stack;
public class StackUsingCollectionframework {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st);
        int pop = st.pop();
        System.out.println("pop " + pop);

        int top = st.peek();
        System.out.println("top " + top);

        boolean isEmpty = st.isEmpty();
        System.out.println("isEmpty " + isEmpty);

        int size = st.size();
        System.out.println("size " + size   );
    }
}
