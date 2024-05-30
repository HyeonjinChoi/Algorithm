class Solution {
    public int[] solution(String s) {
        int size = s.length();
        int[] answer = new int[size];
        answer[0] = -1;
        
        for (int i = 1; i < size; i++) {
            answer[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}