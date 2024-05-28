import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] list = Arrays.stream(strings)
            .sorted(Comparator.comparing((String value) -> value.charAt(n))
                    .thenComparing(Comparator.comparing(String::new)))
            .toArray(String[]::new);
        
        return list;
    }
}