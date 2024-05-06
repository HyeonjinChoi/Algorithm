class Solution {
    public int solution(long num) {
        int count = 0;
        if (num == 1) { return 0; }
        
        for (int i = 0; i < 500; i++) {
            if (num == 1) { return count; }
            
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
            count++;
        }
        
        return -1;
    }
}