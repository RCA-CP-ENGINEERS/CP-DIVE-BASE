package Answers.stack;

import java.util.Stack;

public class ValidParentheses_Kevin {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Invalid character or mismatched closing bracket
            }
        }

        return stack.isEmpty(); // If the stack is empty, all brackets are matched.
    }

    public static void main(String[] args) {

        //this case should output be true since each character has a corresponding closing element
        String input1 = "({[]})";

        //this case should be false because characters and corresponding closing elements are out of order
        String input2 = "({[})]";

        System.out.println("Input 1 is valid: " + isValid(input1));
        System.out.println("Input 2 is valid: " + isValid(input2));
    }

   /* Conclusion:

    Why use stacks?
    Stacks are suitable because: In a valid expression, parentheses should be matched in the order they were opened. When you encounter a closing parenthesis, you want to match it with the most
    recently opened one, which is precisely the behavior of a stack. The last opening parenthesis that is pushed onto the stack will be the first one to be popped when you encounter the corresponding
    closing parenthesis.*/
}
