import java.util.Arrays;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int [numlist.length];
        Arrays.sort(numlist);
        
        for (int i = 0; i < numlist.length; i++) {
            // i번째 숫자 - n의 절댓값이 0일 경우 첫번째 1일경우 
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(numlist[i]-n) <= Math.abs(numlist[j] - n)) {
                    int a = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = a;
                }
            }
        }
        
        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[i];
        }
        
        
        return answer;
    }
}