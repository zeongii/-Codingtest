class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n = 0;
        
        for (int i = 1; i < k; i++){
            n += 2;
        }
        
        n %= numbers.length;
        answer = numbers[n];
        
        return answer;
    }
}