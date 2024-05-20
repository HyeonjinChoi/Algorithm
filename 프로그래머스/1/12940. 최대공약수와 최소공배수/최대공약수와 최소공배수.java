class Solution {
    public int[] solution(int n, int m) {
        int num1 = Math.min(n, m);
        int num2 = Math.max(n, m);
        
        int gcd = -1;
        for (int i = 1; i <= num1; i++) if (num1 % i == 0 && num2 % i == 0) gcd = i;
        
        int lcm = num1 * num2 / gcd;
        
        return new int[] {gcd, lcm};
    }
}