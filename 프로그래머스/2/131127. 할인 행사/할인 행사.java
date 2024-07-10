import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) wantMap.put(want[i], number[i]);
        
        int count = 0;
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            if (isValid(wantMap, discountMap)) count++;
        }
        
        return count;
    }
    
    private boolean isValid(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for (String key : wantMap.keySet()) if (discountMap.getOrDefault(key, 0) < wantMap.get(key)) return false;
        return true;
    }
}