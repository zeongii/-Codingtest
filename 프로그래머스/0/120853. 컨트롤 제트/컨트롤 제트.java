class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] num = s.split(" ");
        
        for (int i = 0; i < num.length; i++) {
            if (!num[i].equals("Z")) {
                int a = Integer.parseInt(num[i]);
        
                answer += a;
            } else {
                int b = Integer.parseInt(num[i - 1]);
                
                answer -= b;
            }
            
            
        }
        
        
        return answer;
    }
}