import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] num1 = s.split(" ");
        int[] num2 = new int[num1.length];
        
        for (int i = 0; i < num1.length; i++) {
            num2[i] = Integer.parseInt(num1[i]);
        }
        int maxNum = Arrays.stream(num2).max().getAsInt();
        int minNum = Arrays.stream(num2).min().getAsInt();

        String maxString = Integer.toString(maxNum);
        String minString = Integer.toString(minNum);
        
        answer = minString.concat(" ").concat(maxString);
        
        
        
        return answer;
    }
}