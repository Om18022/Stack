package Stack;

public class PushPopPeekPrint {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;
        System.out.println("Size of stack is : " + size(top));
        top = push(stack,top,10);
        top = push(stack,top,20);
        top = push(stack,top,40);
        top = push(stack,top,50);
        top = push(stack,top,70);
        print(stack,top);
        top = push(stack,top,10);
        top = pop(stack,top);
        top = pop(stack,top);
        top = pop(stack,top);
        print(stack,top);
        System.out.println(peak(stack,top) + " : is peak point.");
        System.out.println( "Stack is empty : " + isempty(top));
        System.out.println("Size of stack is : " + size(top));
    }

    private static int size(int top) {
        return top+1;
    }

    private static boolean isempty(int top) {
        if(top == -1){
            return true;
        }
        return false;
    }

    private static int peak(int[] stack, int top) {
        return stack[top];
    }

    private static int pop(int[] stack, int top){
        System.out.println(stack[top] + " " + "is popped(deleted value).");
        top--;
        return top;
    }
    private static void print(int[] stack, int top) {
        for(int i = top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }

    private static int push(int[] stack, int top, int value){
        if(top == stack.length-1){
            System.out.println("Stack is full. Can't add another value in stack.");
            return top;
        }
        top++;
        stack[top] = value;
        return top;
    }
}
