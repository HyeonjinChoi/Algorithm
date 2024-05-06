class Solution {
    public int solution(long num) {
        int count = 0;
        if (num == 1) { return 0; }
        
        while (true) {
            if (count == 500) { 
                count = -1; 
                break;
            } else if (num == 1) {
                break;
            }
            
            if (num % 2 == 0) { 
                num /= 2; 
            } 
            else { 
                num = num * 3 + 1; 
            }
            
            count++;
        }
        
        return count;
    }
}