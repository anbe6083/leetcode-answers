class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char paren = s.charAt(i);
            if(paren == '(' || paren =='[' || paren =='{')
                stack.push(paren);
            else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(paren == ')' && top != '(')
                    return false;
                else if(paren == '}' && top != '{')
                    return false;
                if(paren == ']' && top != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}