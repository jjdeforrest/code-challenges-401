package utilities;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){

            Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == '(') {
                stack.push(')');
            }
            if (symbol == '{') {
                stack.push('}');
            }
            if (symbol == '[') {
                stack.push(']');
            } else if (symbol == ')' || symbol == '}' || symbol == ']') {
                if (stack.isEmpty() || stack.pop() != symbol)
                    return false;
            }
        }
        return stack.isEmpty();
    }


}
