class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        
        int location = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                location = 1;
            } 
            
            answer += location % 2 == 0 ? str[i].toUpperCase() : str[i].toLowerCase();
            location++;
        }
     
        return answer;
        
    }
}