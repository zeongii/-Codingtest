import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] number = {a,b,c,d};
        Arrays.sort(number);
        
        for (int i = 1; i < number.length; i++) {
            if (number[0] == number[3]) {
                answer = 1111 * number[0];
            } else if (number[0] == number[2]) {
                answer = (int)Math.pow((10*number[0]+number[3]),2);
            } else if (number[1] == number[3]) {
                answer = (int)Math.pow((10*number[1]+number[0]),2);
            } else if (number[0] == number[1] && number[2] == number[3]) {
                answer = (number[1] + number[2]) * Math.abs(number[1] -number[2]);
            } else if(number[0] == number[1] && number[2] != number[3]) {
                answer = number[2] * number[3];
            } else if (number[1] == number[2] && number[0] != number[3]) {
                answer = number[0] * number[3];
            } else if (number[0] != number[1] && number[2] == number[3]) {
                answer = number[0] * number[1];
            } else {
                answer = number[0];
            }
            
        }
        
        
        
        return answer;
    }
}