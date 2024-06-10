class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int weapon = CountDivisor(i);
            
            if (weapon > limit) {
                weapon = power;
            }
            
            answer += weapon;
        }

        return answer;
    }

    private int CountDivisor(int n) {
        int count = 0;
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) count++;
                else count += 2;
            }
        }
        
        return count;
    }
}