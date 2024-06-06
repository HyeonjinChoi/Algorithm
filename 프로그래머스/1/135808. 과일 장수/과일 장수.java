import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        List<Integer> list = Arrays.stream(score).boxed().sorted().collect(Collectors.toList());
        
        int size = score.length, pivot = 0, sum = 0;
        for (int i = size % m; i < size; i++) {
            if (i % m == size % m) pivot = list.get(i);
            sum += pivot;
        }
        
        return sum;
    }
}