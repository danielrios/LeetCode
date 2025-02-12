class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                myStack.push(c);
            } else if (!myStack.isEmpty() && (c == '}' && myStack.peek() == '{'
                    || c == ')' && myStack.peek() == '('
                    || c == ']' && myStack.peek() == '[')) {
                myStack.pop();
            } else {
                return false;
            }
        }
        return myStack.isEmpty();
    }
}