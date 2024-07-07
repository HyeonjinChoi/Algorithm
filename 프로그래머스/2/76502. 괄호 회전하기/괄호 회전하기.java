import java.util.*;

class Solution {
    public int solution(String s) {
        int count = 0, length = s.length();
        
        for (int i = 0; i < length; i++) {
            if (isValid(s)) count++;
            
            s = s.substring(1) + s.charAt(0);
        }
        
        return count;
    }
    
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                
                char top  = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        
        return stack.isEmpty();
    }
}