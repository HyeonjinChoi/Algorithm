class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int value : numbers) { answer -= value; }
        return answer;
    }
}