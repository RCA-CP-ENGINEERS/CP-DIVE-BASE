//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//        Example:
//
//Input: ["MinStack","push","push","push","getMin","pop","top","getMin"]
//        [[],[0],[1],[0],[],[],[],[]]
//Output: [null,null,null,null,0,null,1,0]

public class getMinStack_Rodin {
    private int[] stack;
    private int[] minStack;
    private int top;
    private int minTop;

    public getMinStack_Rodin() {
        stack = new int[100];
        minStack = new int[100];
        top = -1;
        minTop = -1;
    }

    public void push(int x) {
        if(top == stack.length -1) {
            System.out.println("Stack overflow!");
        }
        top++;
        stack[top] = x;

        if (minTop == 1 || x <= minStack[minTop]) {
            minTop ++;
            minStack[minTop] = x;
        }
    }

    public void pop() {
        if(top == -1) {
            System.out.println("Stack underflow!");
            return;
        }
        int poopedElement = stack[top];
        top--;
        if (poopedElement == minStack[minTop] ) {
            minTop--;
        }
    }

    public int top() {
        if(top == -1 ) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public int getMin() {
        if(minTop == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return minStack[minTop];
    }


    public static void main(String[] args) {
        getMinStack_Rodin minStack = new getMinStack_Rodin();

        minStack.push(0);         // Push 0
        minStack.push(1);         // Push 1
        minStack.push(0);         // Push 0
        System.out.println(minStack.getMin()); // Minimum: 0
        minStack.pop();           // Pop 0
        System.out.println(minStack.top());    // Top element: 1
        System.out.println(minStack.getMin()); // Minimum: 0
    }


}
