class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char p = 'p';
        char y = 'y';
        char P = 'P';
        char Y = 'Y';
        
        int PLen = 0;
        int YLen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p || s.charAt(i) == P ) {
                PLen++;
            } else if(s.charAt(i) == y ||s.charAt(i) == Y) {
                YLen++;
            }
        }
        
        
        if (PLen == YLen) {
            answer = true;
        } else {
            answer = false;
        }
        

        return answer;
    }
}