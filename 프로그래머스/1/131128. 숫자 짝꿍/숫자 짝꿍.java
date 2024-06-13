import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        int[][] arr = new int[2][10];
        
        for (char c : xArr) arr[0][c - '0']++;
        for (char c : yArr) arr[1][c - '0']++;
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(arr[0][i], arr[1][i]);
            for (int j = 0; j < commonCount; j++) answer.append(i);
        }
        
        if (answer.length() == 0) return "-1";
        if (answer.charAt(0) == '0') return "0";
        
        return answer.toString();
    }
}