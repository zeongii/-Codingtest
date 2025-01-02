import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int a = arr.length;
        if (a == 1) {
            return new int[] {-1};
        } 
        
        //배열의 최솟값
        int min = Arrays.stream(arr).min().getAsInt();
        
        int[] answer = Arrays.stream(arr)
                        .filter(small -> small != min)
                        .toArray();
        
        
        return answer;
    }
}