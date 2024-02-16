import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "((";
        System.out.println("Is valid parentheses : " + isValid(str));

    }

    public static boolean isValid(String s) {
        boolean isValidParentheses = true;
        if (s.length() == 1) {
            isValidParentheses = false;
        } else {
            Stack<String> stack = new Stack<>();
            String[] list = s.split("");

            for (String parentheses : list) {
                if (parentheses.equals("(") || parentheses.equals("[") || parentheses.equals("{")) {
                    stack.push(parentheses);
                    continue;
                }

                if (stack.isEmpty()) {
                    isValidParentheses = false;
                } else {
                    String check = stack.pop();
                    switch (parentheses) {
                        case ")": {
                            if (!check.equals("(")) {
                                isValidParentheses = false;
                            }
                        }
                        break;
                        case "]": {
                            if (!check.equals("[")) {
                                isValidParentheses = false;
                            }
                        }
                        break;
                        case "}": {
                            if (!check.equals("{")) {
                                isValidParentheses = false;
                            }
                        }
                        break;
                    }
                }

            }

            if (!stack.isEmpty()) {
                isValidParentheses = false;
            }

        }
        return isValidParentheses;

    }
}
