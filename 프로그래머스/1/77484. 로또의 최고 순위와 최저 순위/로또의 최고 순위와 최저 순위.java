import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correctCount = 0, zeroCount = 0;
            
        Arrays.sort(win_nums);
        
        for (int lotto : lottos) {
            if (Arrays.binarySearch(win_nums, lotto) >= 0) correctCount++;
            if (lotto == 0) zeroCount++;
        }
        
        answer[0] = getRank(correctCount + zeroCount);
        answer[1] = getRank(correctCount);
        
        return answer;
    }
    
    int getRank(int correctCount) {
        switch (correctCount) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}