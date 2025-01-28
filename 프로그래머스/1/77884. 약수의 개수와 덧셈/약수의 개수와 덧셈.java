class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        int big, small;
        
        
        //더 큰 수와 작은 수 구하기
        if (left > right) {
            big = left;
            small = right;
            
        } else {
            big = right;
            small = left;
            
        }
        for (int i = small; i <= big; i++ ){
            // 약수의 갯수가 짝수일 때 더하고 홀수일 때 빼기
            count = 0;
            for (int j = 1; j * j<= i; j++) {
                 if (j * j == i) count++;
                else if ( i % j == 0) count+=2;
            }
            if (count % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
            
        }
        
        
        return answer;
    }
}