import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> expiredIndices = new ArrayList<>();
        Map<String, Integer> termsMap = new HashMap<>();

        String[] todaySplit = today.split("\\.");
        int todayYear = Integer.parseInt(todaySplit[0]);
        int todayMonth = Integer.parseInt(todaySplit[1]);
        int todayDay = Integer.parseInt(todaySplit[2]);

        for (String term : terms) {
            String[] termSplit = term.split(" ");
            termsMap.put(termSplit[0], Integer.parseInt(termSplit[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privacySplit = privacies[i].split(" ");
            String[] dateSplit = privacySplit[0].split("\\.");
            String termType = privacySplit[1];
            int termDuration = termsMap.get(termType);

            int year = Integer.parseInt(dateSplit[0]);
            int month = Integer.parseInt(dateSplit[1]);
            int day = Integer.parseInt(dateSplit[2]);

            month += termDuration;
            while (month > 12) {
                year++;
                month -= 12;
            }

            if (year < todayYear ||
                (year == todayYear && month < todayMonth) ||
                (year == todayYear && month == todayMonth && day <= todayDay)) {
                expiredIndices.add(i + 1);
            }
        }

        return expiredIndices.stream().mapToInt(i -> i).toArray();
    }
}