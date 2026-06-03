import java.util.Stack;

class validparenthesis {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        validparenthesis obj = new validparenthesis();

        System.out.println(obj.isValid("()"));       // true
        System.out.println(obj.isValid("()[]{}"));   // true
        System.out.println(obj.isValid("(]"));       // false
    }
}