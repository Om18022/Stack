package Stack;
import java.util.Stack;
public class GetMinO_1 {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minstack = new Stack<>();

    public static void main(String[] args) {
        push(10);
        pop();
        push(20);
        push(30);
        pop();
        push(1);
        pop();
        System.out.println(getmin());
        System.out.println(minstack);
    }

    private static int getmin() {
        return minstack.peek();
    }

    private static void pop(){
        int temp = stack.pop();
        if(temp == minstack.peek()){
            minstack.pop();
        }
    }

    private static void push(int value){
        stack.push(value);
        if(minstack.isEmpty()){
            minstack.push(value);
        }else if(minstack.peek() > value){
            minstack.push(value);
        }
    }
}
