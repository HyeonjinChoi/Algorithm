import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] possibleWords = {"aya", "ye", "woo", "ma"};
        Set<String> invalidWords = new HashSet<>();
        for (String word : possibleWords) {
            invalidWords.add(word + word);
        }
        
        int count = 0;
        for (String word : babbling) {
            String originalWord = word;
            for (String possibleWord : possibleWords) {
                word = word.replace(possibleWord, " ");
            }
            word = word.replace(" ", "");
            
            boolean isValid = true;
            for (String invalid : invalidWords) {
                if (originalWord.contains(invalid)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid && word.isEmpty()) {
                count++;
            }
        }
        
        return count;
    }
}