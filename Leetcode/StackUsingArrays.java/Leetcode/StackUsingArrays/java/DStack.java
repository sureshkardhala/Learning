public class DStack {
    int capacity =2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (size() == capacity){
            expand();
        }
        stack[top] = data;
        top++;
    }

    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Empty Stack");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
    }

    public int peek() {
        top--;
        int data = stack[top + 1];
        return data;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public int size() {
        return top + 1;
    }

    public void expand(){
        System.out.println("HI");
        int len= size();
        int [] newStack = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, len);
        stack=newStack;
        capacity=capacity*2;
    }

    public void shrink(){
        int length=size();
        if(length <= (capacity/2)/2){
            capacity=capacity/2;
        }
        int newStack[] = new int [capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack=newStack;
    }
}
