class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] num = phone_number.split("");
        StringBuilder s = new StringBuilder();
        
        for (int i = 0; i < num.length; i++) {
            if (i < (num.length - 4) ) {
                s.append("*");
            } else {
                s.append(num[i]);
            }
        }
        
        answer = s.toString();
        return answer;
    }
    
}