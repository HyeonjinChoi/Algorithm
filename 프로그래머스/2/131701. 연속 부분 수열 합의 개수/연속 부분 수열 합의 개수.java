import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
        
        int[] extendedElements = new int[len * 2];
        for (int i = 0; i < len; i++) {
            extendedElements[i] = elements[i];
            extendedElements[len + i] = elements[i];
        }
        
        for (int i = 0; i < len; i++) {
            int sum = 0;
            
            for (int j = 0; j < len; j++) {
                sum += extendedElements[i + j];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}