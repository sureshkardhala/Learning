public class Stack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if (stack.length > top) {
            stack[top] = data;
            top++;
        } else {
            System.out.println("Stack size is fulled");
        }

    }

    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Empty Stack");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
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

}