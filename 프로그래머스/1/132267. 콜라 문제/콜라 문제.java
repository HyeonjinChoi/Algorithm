class Solution {
    public int solution(int a, int b, int n) {
        return colaCount(a, b, n);
    }
    
    public int colaCount(int a, int b, int n) {
        if (n < a) return 0;
        else return n / a * b + colaCount(a, b, n / a * b + n % a);
    }
}