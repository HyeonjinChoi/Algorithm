class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ", -1);
        
        for (String value : arr) System.out.println(value);
        
        for (int i = 0; i < arr.length; i++) {
            answer.append(convert(arr[i]));
            if (i != arr.length - 1) answer.append(" ");
        }
        
        return answer.toString();
    }
    
    public String convert(String s) {
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            str.append(i % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        
        return str.toString();
    }
}
