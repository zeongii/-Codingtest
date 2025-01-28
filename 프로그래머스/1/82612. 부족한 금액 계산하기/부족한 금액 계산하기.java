class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        
        for (int i = 0; i <= count; i++) {
            total += (long) price * i;
        }
        
        return Math.max(total-money, 0);
        
        
        
    }
}