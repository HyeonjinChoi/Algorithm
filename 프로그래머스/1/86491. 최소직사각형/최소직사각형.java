class Solution {
    public int solution(int[][] sizes) {
        int first_max = 0, second_max = 0;
        
        for (int[] arr : sizes) {
            if (arr[0] < arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            
            if (first_max < arr[0]) first_max = arr[0];
            if (second_max < arr[1]) second_max = arr[1];
        }
        
        return first_max * second_max;
    }
}