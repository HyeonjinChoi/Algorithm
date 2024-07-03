import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : tangerine) map.put(value, map.getOrDefault(value, 0) + 1);
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        int count = 0, totalTangerines = 0;
        for (int value : list) {
            totalTangerines += value;
            count++;
            
            if (totalTangerines >= k) break;
        }

        return count;
    }
}