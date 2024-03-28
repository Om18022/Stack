package Stack;
import java.util.Stack;
public class DeleteMiddleInAStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
//        s1.push(60);

        int m = (s1.size()/2) + 1;

        while(m != s1.size()){
            s2.push(s1.pop());
        }
        s1.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        for(int i=0; i<s1.size(); i++){
            System.out.println(s1.get(i));
        }
    }
}
