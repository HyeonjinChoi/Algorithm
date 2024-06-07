import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] firstStudent = {1, 2, 3, 4, 5};
        int[] secondStudent = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstStudent[i % firstStudent.length]) scores[0]++;
            if (answers[i] == secondStudent[i % secondStudent.length]) scores[1]++;
            if (answers[i] == thirdStudent[i % thirdStudent.length]) scores[2]++;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> resultList = new ArrayList<>();
        if (scores[0] == maxScore) resultList.add(1);
        if (scores[1] == maxScore) resultList.add(2);
        if (scores[2] == maxScore) resultList.add(3);
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) result[i] = resultList.get(i);
        
        return result;
    }
}