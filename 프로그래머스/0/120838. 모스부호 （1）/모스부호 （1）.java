class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String morse[];
        morse = letter.split(" ");
        
        for (int i = 0; i < morse.length; i++ ){
            for (int j = 0; j < morseList.length; j++){
                if (morse[i].equals(morseList[j])) {
                    answer += (char)(j + 'a'); 
                }
                
            }
        }
        
        return answer;
    }
}