import java.util.*;

public class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for (char type : types) {
            scores.put(type, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            char type1 = survey[i].charAt(0);
            char type2 = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) scores.put(type1, scores.get(type1) + (4 - choice));
            else if (choice > 4) scores.put(type2, scores.get(type2) + (choice - 4));
        }

        StringBuilder result = new StringBuilder();
        
        result.append(scores.get('R') >= scores.get('T') ? 'R' : 'T');
        result.append(scores.get('C') >= scores.get('F') ? 'C' : 'F');
        result.append(scores.get('J') >= scores.get('M') ? 'J' : 'M');
        result.append(scores.get('A') >= scores.get('N') ? 'A' : 'N');

        return result.toString();
    }
}