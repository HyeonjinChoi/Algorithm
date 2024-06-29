class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        for (int i = 3; i < total; i++) {
            if (total % i == 0) {
                int row = i, col = total / i;
                if (2 * row + 2 * col - 4 == brown) return new int[]{col, row};
            }
        }
        
        return new int[]{0, 0};
    }
}