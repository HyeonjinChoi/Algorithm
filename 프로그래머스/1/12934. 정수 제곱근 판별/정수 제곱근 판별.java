class Solution {
    public long solution(double n) {
        double sqrtNum = Math.sqrt(n);
        double answer = (sqrtNum % 1 == 0) ? Math.pow(sqrtNum + 1, 2) : -1;
        return (long)answer;
    }
}