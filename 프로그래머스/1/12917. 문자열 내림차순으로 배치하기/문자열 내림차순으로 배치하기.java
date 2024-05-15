import java.util.*;

class Solution {
    public String solution(String s) {
        String[] temp = s.split("");
        Arrays.sort(temp, Collections.reverseOrder());
        
        String answer = "";
        for (String value : temp) answer += value;
        
        return answer;
    }
}