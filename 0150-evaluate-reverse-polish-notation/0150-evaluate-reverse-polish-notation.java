class Solution {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            // Operators
            if (token.equals("+")) {

                int b = stack.pop();
                int a = stack.pop();

                stack.push(a + b);

            } else if (token.equals("-")) {

                int b = stack.pop();
                int a = stack.pop();

                stack.push(a - b);

            } else if (token.equals("*")) {

                int b = stack.pop();
                int a = stack.pop();

                stack.push(a * b);

            } else if (token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                stack.push(a / b);

            } else {

                // Number
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}