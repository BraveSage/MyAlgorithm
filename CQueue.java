import java.util.LinkedList;
import java.util.Stack;

public class CQueue {
    LinkedList<Integer> A, B;
    public CQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    public void appendTail(int value) {
        A.addLast(value);
    }
    public int deleteHead() {
        if(!B.isEmpty()) return B.removeLast();
        if(A.isEmpty()) return -1;
        while(!A.isEmpty())
            B.addLast(A.removeLast());
        return B.removeLast();
    }

    Stack<Integer> stack1;
    Stack<Integer> stack2;


    public void appendTail2(int value) {
        stack1.push(value);
    }

    public int deleteHead2() {
        // 如果第二个栈为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        String num = "200";
        System.out.println(num.equals(200));
    }
}
