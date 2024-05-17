class Solution {
    public boolean solution(String s) {
        try {
            int num = Integer.parseInt(s);
            return s.length() == 4 || s.length() == 6 ? true : false;    
        } catch(NumberFormatException e) {
            return false;
        }
    }
}