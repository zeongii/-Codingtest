import java.util.*;

class Solution {
    public long solution(long n) {
       // 숫자를 문자열로 변환
        String s = Long.toString(n);
        
        // 문자 배열 생성
        Character[] number = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            number[i] = s.charAt(i);
        }
        
        // 내림차순 정렬
        Arrays.sort(number, Collections.reverseOrder());
        
        // 정렬된 문자 배열을 StringBuilder로 결합
        StringBuilder answer = new StringBuilder();
        for (char digit : number) {
            answer.append(digit);
        }
        
        // 결과를 Long 타입으로 변환하여 반환
        return Long.parseLong(answer.toString());
    }
}