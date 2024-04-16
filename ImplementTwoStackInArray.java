package Stack;

public class ImplementTwoStackInArray {
    public static void main(String[] args) {
        twostack ts=new twostack(5);
        ts.push1(5);
        ts.push1(11);
        ts.push2(10);
        ts.push2(15);

        ts.push2(7);

        System.out.println(ts.pop1());
        System.out.println(ts.pop2());

    }
}
class twostack {
    int[] arra;
    int top1, size;
    int top2;

    twostack(int n) {
        size = n;
        arra = new int[n];
        top1 = n / 2 + 1;
        top2 = n / 2;

    }

    void push1(int x) {
        if (top1 > 0) {
            top1--;
            arra[top1] = x;
        } else {
            System.out.println("Stack Overflow" + x);
            return;
        }
    }

    void push2(int x) {
        if (top2 < size - 1) {
            top2++;
            arra[top2] = x;
        } else {
            System.out.println("Stack is overflow" + x);
        }
    }

    int pop1() {
        if (top1 <= size / 2) {
            int x = arra[top1];
            top1++;
            return x;
        } else {
            System.out.println("stack underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2()
    {
        if (top2 >= size / 2 + 1)
        {
            int x=arra[top2];
            top2--;
            return x;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);

        }
        return 1;
    }
}