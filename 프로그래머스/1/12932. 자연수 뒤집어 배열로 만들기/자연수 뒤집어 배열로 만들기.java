import java.util.*;
class Solution {
    public int[] solution(long n) {
        ArrayList <Integer> num = new ArrayList<>(); 
        
        while(n > 0) {
            int a = (int) (n % 10);
            n /= 10;
            num.add(a);
        }
        int[] answer = new int[num.size()];
        
        for (int i = 0; i < num.size(); i++) {
            answer[i] =  num.get(i);
        
            
        }
        
        return answer;
    }
}