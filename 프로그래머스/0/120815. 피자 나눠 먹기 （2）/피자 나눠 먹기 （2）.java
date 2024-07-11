class Solution {
    public int solution(int n) {
        int answer = 0;
        int peice = 6;
        
        for (int i = 1; i <= peice * n ; i++){
            if ((peice * i) % n == 0){
                answer = i;
            break;

            }
        }
        
        
        
        return answer;
    }
}