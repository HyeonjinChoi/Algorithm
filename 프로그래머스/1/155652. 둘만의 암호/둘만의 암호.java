import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) skipSet.add(c);
        
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            char newChar = c;
            int count = 0;
            
            while (count < index) {
                newChar++;
                if (newChar > 'z') newChar = 'a';
                if (!skipSet.contains(newChar)) count++;
            }
            
            result.append(newChar);
        }
        
        return result.toString();
    }
}