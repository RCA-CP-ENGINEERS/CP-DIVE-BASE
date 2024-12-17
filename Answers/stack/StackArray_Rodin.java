//Implement a stack with the following operations:
//push(x): Pushes an element onto the stack.
//pop(): Removes the top element from the stack.
//top(): Returns the top element.
//empty(): Returns whether the stack is empty.

public class StackArray_Rodin {
    private int[] stack;
    private int top;

    public StackArray_Rodin() {
        stack = new int[100];
        top = -1;
    }

    public void push(int x) {
        if(top == stack.length - 1) {
            System.out.println("Stack overflow!");
        }
        top++;
        stack[top] = x;
    }

    public int pop() {
        if( top == -1) {
            System.out.println("Stack underflow! Stack is empty!");
            return -1;
        }
        int val = stack[top];
        top--;
        return val;
    }

    public int top() {
        if( top == -1){
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }


    public boolean empty() {
        return top == 1;
    }



    public static void main(String[] args ) {
        StackArray_Rodin sar = new StackArray_Rodin();
        sar.push(1);
        sar.push(2);

        System.out.println(sar.top());
        System.out.println(sar.pop());
        System.out.println(sar.empty());
    }
}
