class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n = i; n <= j; n++) {
            int number = n;
            while (number > 0) {
                int s = number % 10;
                if (s == k) {
                    answer++;
                }
                number /=10;
            }
        }
        
        return answer;
    }
}