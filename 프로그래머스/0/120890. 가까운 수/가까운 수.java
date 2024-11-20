import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        
        
        Arrays.sort(array);
        
        int answer = array[0];
        int a = Math.abs(array[0] - n);
        
        for (int i = 1; i < array.length; i++) {
            int b = Math.abs(array[i] - n);
            if (a != b)  {
                if (b < a) {
                a = b;
                answer = array[i];
            } 
            } else {
                answer = Math.min(answer, array[i]);
            }
            
        }
    
        
        
        return answer;
    }
}