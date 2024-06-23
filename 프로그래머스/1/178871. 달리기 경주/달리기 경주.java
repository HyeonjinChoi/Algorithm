import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (String name : callings) {
            int firstPos = playerMap.get(name);
            int secondPos = firstPos - 1;
            
            String temp = players[secondPos];
            players[secondPos] = players[firstPos];
            players[firstPos] = temp;
            
            playerMap.put(players[secondPos], secondPos);
            playerMap.put(players[firstPos], firstPos);
        }
        
        return players;
    }
}