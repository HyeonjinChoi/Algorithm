import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for (int value : arr) { if (value % divisor == 0) { resultList.add(value); } }
        
        Collections.sort(resultList);
        
        if (resultList.isEmpty()) { resultList.add(-1); }
        
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}