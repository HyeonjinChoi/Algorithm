class Solution {
    public String solution(int[] food) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                str.append(i);
            }
        }
        return str.toString() + "0" + str.reverse().toString();
    }
}