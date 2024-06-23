import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        Map<String, int[]> directions = new HashMap<>();
        directions.put("N", new int[]{-1, 0});
        directions.put("S", new int[]{1, 0});
        directions.put("W", new int[]{0, -1});
        directions.put("E", new int[]{0, 1});
        
        int[] startPosition = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    startPosition[0] = i;
                    startPosition[1] = j;
                }
            }
        }
        
        int[] currentPosition = startPosition.clone();
        for (String route : routes) {
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            int[] move = directions.get(direction);
            boolean canMove = true;
            
            int targetRow = currentPosition[0] + move[0] * distance;
            int targetCol = currentPosition[1] + move[1] * distance;
            
            for (int i = 1; i <= distance; i++) {
                int newRow = currentPosition[0] + move[0] * i;
                int newCol = currentPosition[1] + move[1] * i;
                if (newRow < 0 || newRow >= park.length || newCol < 0 || newCol >= park[0].length() || park[newRow].charAt(newCol) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                currentPosition[0] = targetRow;
                currentPosition[1] = targetCol;
            }
        }
        
        return currentPosition;
    }
}