public class CodeRunner {
    public static void main(String args[]) {
        Stack nums = new Stack();
        System.out.println("Empty = " + nums.isEmpty());
        nums.push(12);
        nums.push(13);
        nums.push(14);
        nums.push(15);
        nums.push(16);
        nums.push(17);
        nums.show();
        System.out.println("");
        System.out.println(nums.pop() + " is deleted!");
        nums.show();
        System.out.println("");
        System.out.println("Size of stack is : " + nums.size());

        System.out.println("Top of the stack is : " + nums.peek());

        System.out.println("Empty = " + nums.isEmpty());


        //Dynamic stack

        DStack dNums = new DStack();
        dNums.push(1);
        dNums.push(2);
        dNums.push(3);
        dNums.push(4);
        dNums.pop();
        dNums.pop();
        dNums.show();
    }
}
