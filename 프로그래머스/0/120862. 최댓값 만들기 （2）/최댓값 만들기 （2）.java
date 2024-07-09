import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        Arrays.sort(numbers);
        
            max1 = numbers[0] * numbers[1];
       
            max2 = numbers[numbers.length - 2] * numbers[numbers.length-1];
            if (max1 > max2){
                answer = max1;
            } else if (max1 < max2){
                answer = max2;
            }     else {
                answer = max1;
            }
        
        return answer;
    }
}