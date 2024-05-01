class Solution {
    public long[] solution(long n) {
        int size = countDigit(n);
        long[] answer = new long[size];
        
        for (int i = 0; i < size; i++) {
            answer[i] = n % 10;
            n /= 10;
        }
        
        return answer;
    }
    
    public int countDigit(long n) {
        int count = 0;
        
        while (n != 0) {
            count++;
            n /= 10;
        }
        
        return count;
    }
}