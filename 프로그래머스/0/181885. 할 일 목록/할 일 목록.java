import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) { 
                result.append(todo_list[i]).append(",");
            }
        }
        
         if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }
        
        String[] answer = result.toString().split(",");
        
        return answer;
    }
    
}