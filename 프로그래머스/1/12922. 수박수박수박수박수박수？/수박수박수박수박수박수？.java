class Solution {
    public String solution(int n) {
        
        StringBuilder a = new StringBuilder();
        
        for ( int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                a.append("수");
            } else {
                a.append("박");
            }
            
            
        }
        
        String answer = a.toString();
        return answer;
    }
}