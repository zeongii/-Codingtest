class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double x = Math.sqrt(n);
        
        if ( x == (int) x ){
            double a = x + 1;
            answer = (long) (a * a);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}