class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int [n][n];

        int idx = 1;
        
        int rStart = 0, lStart = 0;
        int rEnd = n-1, lEnd = n-1;
        
        while (idx <= n*n) {
            for (int i = lStart; i <= lEnd; i++) {
                answer[rStart][i] = idx++;
            }
            rStart++;
            
            for (int i = rStart; i <= rEnd; i++) {
                answer[i][lEnd] = idx++;
                
            }
            lEnd--;
            
            for (int i = lEnd; i >= lStart; i--) {
                answer[rEnd][i] = idx++;
               
            }
             rEnd--;
            
            for (int i = rEnd; i >= rStart; i--) {
                answer[i][lStart] = idx++;
                
            }
            lStart++;
        } 
        
        
        
        
        return answer;
    }
}