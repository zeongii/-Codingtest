class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for (int i = code-1; i < cipher.length();){
            answer += cipher.charAt(i);
            i += code;
        }
        
        return answer;
    }
}