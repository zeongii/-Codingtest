import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answ = my_string.toLowerCase();
        
        char[] ans = answ.toCharArray();
        Arrays.sort(ans);
        
        String answer = new String(ans); 
        
        
        return answer;
    }
}