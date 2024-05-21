import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        int remain = -1;
        while (n != 0) {
            remain = n % 3;
            list.add(remain);
            n /= 3;
        }
        
        Collections.reverse(list);
        
        int sum = 0, i = 0;
        for (int value : list) {
            sum += value * Math.pow(3, i);
            i++;
        }
        
        return sum;
    }
}