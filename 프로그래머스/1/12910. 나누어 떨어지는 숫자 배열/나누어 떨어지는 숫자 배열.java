import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
       
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) {
                answerList.add(num);
            }
        }
        
        if (answerList.isEmpty()) {
            return new int[]{-1};
        
        }
        
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}