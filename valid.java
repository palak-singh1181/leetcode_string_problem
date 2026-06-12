// valid.java

import java.util.*;

class valid {
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // base

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i); // new base
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        valid sol = new valid();

        System.out.println(sol.longestValidParentheses("(()"));    // 2
        System.out.println(sol.longestValidParentheses(")()())")); // 4
        System.out.println(sol.longestValidParentheses(""));        // 0
    }
}
