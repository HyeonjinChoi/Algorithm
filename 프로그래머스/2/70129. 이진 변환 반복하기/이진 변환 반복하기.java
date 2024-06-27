class Solution {
    public int[] solution(String s) {
        int transformationCount = 0, zeroCount = 0;
        
        while (!s.equals("1")) {
            int originLength = s.length();
            s = s.replaceAll("0", "");
            int newLength = s.length();
            zeroCount += (originLength - newLength);
            s = Integer.toBinaryString(newLength);
            transformationCount++;
        }
        
        return new int[]{transformationCount, zeroCount};
    }
}