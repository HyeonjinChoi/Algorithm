import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> reportCountMap = new HashMap<>();
        
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            reportCountMap.put(id, 0);
        }
        
        for (String rep : report) {
            String[] parts = rep.split(" ");
            String fromUser = parts[0];
            String toUser = parts[1];
            
            if (reportMap.get(fromUser).add(toUser)) {
                reportCountMap.put(toUser, reportCountMap.get(toUser) + 1);
            }
        }
        
        List<String> suspendedUsers = new ArrayList<>();
        for (String id : id_list) {
            if (reportCountMap.get(id) >= k) {
                suspendedUsers.add(id);
            }
        }
        
        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            int count = 0;
            for (String reportedUser : reportMap.get(id)) {
                if (suspendedUsers.contains(reportedUser)) {
                    count++;
                }
            }
            result[i] = count;
        }
        
        return result;
    }
}