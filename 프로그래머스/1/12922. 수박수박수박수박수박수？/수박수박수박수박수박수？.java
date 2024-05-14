class Solution {
    public String solution(int n) {
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) answer[i] = i % 2 == 0 ? '수' : '박';
        return String.valueOf(answer);
    }
}