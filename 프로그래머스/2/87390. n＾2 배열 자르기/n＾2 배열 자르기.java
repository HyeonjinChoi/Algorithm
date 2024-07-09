import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int)(right - left + 1);
        int[] result = new int[length];

        for (int idx = 0; idx < length; idx++) {
            long index = left + idx;
            result[idx] = Math.max((int)(index / n), (int)(index % n)) + 1;
        }
        
        return result;
    }
}