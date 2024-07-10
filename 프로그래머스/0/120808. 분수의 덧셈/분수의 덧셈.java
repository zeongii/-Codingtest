class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max = 0;
        int denom = denom1 * denom2;
        int num1 = numer1*denom2;
        int num2 = numer2*denom1;
        int number = num1 + num2;
        
        for (int i = 1; i <= number; i++){
            if (denom % i == 0){
                if (number % i == 0){
                max = i;           
                }
            }
        }
        
        answer[0] = number /max ;
        answer[1] = denom / max ;
        
        
        
        return answer;
        //나눴을 때 0이 되는 애를 고를건데 그 중 가장 큰 수를 골라야된다
    }
}