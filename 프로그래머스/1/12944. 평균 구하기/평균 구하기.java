class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x += arr[i];
            
        }
        
        double y = (double) x / arr.length;
        return y;
        
        
    }
}