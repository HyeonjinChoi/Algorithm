class Solution {
    public String solution(int n) {
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer[i] = '수';
            } else {
                answer[i] = '박';
            }
        }
        return String.valueOf(answer);
    }
}