class Solution {
    public String solution(int a, int b) {
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] monthDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDays = 0;
        for (int i = 1; i < a; i++) totalDays += monthDays[i];
        totalDays += b;
        
        return days[totalDays % 7];
    }
}