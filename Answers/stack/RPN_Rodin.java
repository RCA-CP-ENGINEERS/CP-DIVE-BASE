import java.util.Stack;
public class RPN_Rodin {
//    Evaluate a reverse polish notation expression.
//    Example:
//
//
//    Input: ["2", "1", "+", "3", "*"]
//    Output: 9
//
//    Input: ["4", "13", "5", "/", "+"]
//    Output: 6

    public static Integer evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int val1, val2;

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    val1 = stack.pop();
                    val2 = stack.pop();
                    stack.push(val2 - val1);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    val1 = stack.pop();
                    val2 = stack.pop();
                    stack.push(val2 / val1);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"4", "13", "5", "/", "+"};
        int result = evaluateRPN(tokens);
        System.out.println("Result: " + result);
    }
}
