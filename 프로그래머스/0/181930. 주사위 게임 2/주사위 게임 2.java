class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a != b && b != c && a!=c) {
            answer = a+ b+ c;
        } else if (a == b && b == c) {
           answer =  (a + b + c) * ((int)Math.pow(a,2) + (int)Math.pow(b,2) + (int)Math.pow(c,2)) * ((int)Math.pow(a,3) + (int)Math.pow(b,3) + (int)Math.pow(c,3));
        } else {
            answer =  (a+b+c) * ((int)Math.pow(a,2) + (int)Math.pow(b,2) + (int)Math.pow(c,2));
        }
        
        return answer;
    }
}