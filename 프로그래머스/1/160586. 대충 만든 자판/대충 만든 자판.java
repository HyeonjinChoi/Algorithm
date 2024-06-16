import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> minKeyPresses = new HashMap<>();

        for (String row : keymap) {
            for (int i = 0; i < row.length(); i++) {
                char ch = row.charAt(i);
                int keyPresses = i + 1;
                if (!minKeyPresses.containsKey(ch) || minKeyPresses.get(ch) > keyPresses) {
                    minKeyPresses.put(ch, keyPresses);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int totalKeyPresses = 0;
            boolean isPossible = true;
            for (char ch : targets[i].toCharArray()) {
                if (minKeyPresses.containsKey(ch)) {
                    totalKeyPresses += minKeyPresses.get(ch);
                } else {
                    isPossible = false;
                    break;
                }
            }
            answer[i] = isPossible ? totalKeyPresses : -1;
        }
        
        return answer;
    }
}