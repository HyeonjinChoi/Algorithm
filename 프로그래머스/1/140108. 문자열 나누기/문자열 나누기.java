import java.util.*;

class Solution {
    public int solution(String s) {
        int countFirst = 0, countSecond = 0, currentPosition = 0;
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(currentPosition) == s.charAt(i)) countFirst++;
            else countSecond++;
            
            if (countFirst == countSecond) {
                list.add(s.substring(currentPosition, i + 1));
                currentPosition = i + 1;
            }
        }
        
        if (currentPosition != s.length()) list.add(s.substring(currentPosition, s.length()));
        
        return list.size();
    }
}