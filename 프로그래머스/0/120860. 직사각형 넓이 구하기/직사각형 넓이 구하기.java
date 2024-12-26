class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        
        int a = dots[0][0];
        int b = dots[0][1];
        int c = dots[0][0];
        int d = dots[0][1];
        
        for (int i = 1; i < dots.length; i++) {
            a = Math.min(a, dots[i][0]);
            b = Math.min(b, dots[i][1]);
            c = Math.max(c, dots[i][0]);
            d = Math.max(d, dots[i][1]);
            
        }
        
        answer = (c - a) * (d - b);
        
        
        
        return answer;
    }
}