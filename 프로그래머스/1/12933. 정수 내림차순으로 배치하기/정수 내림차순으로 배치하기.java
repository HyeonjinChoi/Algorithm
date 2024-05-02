import java.util.*;

class Solution {
    public long solution(long n) {
        ArrayList<Long> list = new ArrayList<>();
        
        while (n != 0) {
            list.add(n % 10);
            n /= 10;
        }
        
        Collections.sort(list);
        
        long answer = 0;
        int index = 1;
        
        for (long value : list) {
            answer += value * index;
            index *= 10;
        }
        
        return answer;
    }
}