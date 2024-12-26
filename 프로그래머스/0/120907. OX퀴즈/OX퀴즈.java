class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            
            String[] calculation = quiz[i].split(" ");
            
            int cal = calculation[1].equals("+") ? Integer.parseInt(calculation[0]) + Integer.parseInt(calculation[2]) : Integer.parseInt(calculation[0]) - Integer.parseInt(calculation[2]);
            int ans = Integer.parseInt(calculation[4]);
            
            answer[i] = cal == ans ? "O" : "X";
        
        }        
        
        
        return answer;
    }
}