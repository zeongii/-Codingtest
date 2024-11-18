import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        String intStr = my_string.replaceAll("[^0-9]", "");
    
        int[] st = new int[intStr.length()];
        
        for (int i = 0; i < intStr.length(); i++) {
            st[i] = intStr.charAt(i) - '0';
        }
        
        Arrays.sort(st);
        
            
        return st;
    }
}