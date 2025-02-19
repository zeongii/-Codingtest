class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        
        for (int i = 0; i < s.length(); i++) {
            char location = s.charAt(i);
            
            if (Character.isLowerCase(location)) {
                location = (char) ((location - 'a' + n) % 26 + 'a');
            } else if(Character.isUpperCase(location)) {
                location = (char) ((location - 'A' + n) % 26 + 'A');
            }
             answer += location;
            
        }
        
        return answer;
    }
}