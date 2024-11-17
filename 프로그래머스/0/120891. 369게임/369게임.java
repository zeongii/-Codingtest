import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        ArrayList<Integer> ordernum = new ArrayList<>();
        while (order > 0) {
            ordernum.add (order % 10);
            order /= 10;
        }
        
        for (int i = 0; i < ordernum.size(); i++) {
            if (ordernum.get(i) == 3) {
                answer++;
            } else if (ordernum.get(i) == 6) {
                answer++;
            } else if (ordernum.get(i) == 9) {
                answer++;
            }
        }
        return answer;
    }
}