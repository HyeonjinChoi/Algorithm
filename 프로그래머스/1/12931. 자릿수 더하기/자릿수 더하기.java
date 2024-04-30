import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int remainder = 0;

        while (n != 0) {
            remainder = n % 10;
            n /= 10;
            answer += remainder;
        }

        return answer;
    }
}