class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                capitalize = true;
            } else if (capitalize) {
                result.append(Character.toUpperCase(c));
                capitalize = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }
}