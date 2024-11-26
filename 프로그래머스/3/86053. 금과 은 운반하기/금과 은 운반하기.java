import java.util.*;
class Solution {
    static int A, B, size;
    static int [] G; static int [] S; static int [] W; static int [] T;
    
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        A = a; B =b; G = g; S = s; W = w; T = t; size = s.length;
        

          
        long start = 0;
        long end   = (long) Math.pow(10, 14) * 4;
        while(start < end){
            long mid = (start + end) / 2;
            if(check(mid)){
                end = mid;
            }
            else start = mid + 1;
        }
        return start;
    }
    public boolean check(long time){
        long totalSum = 0;
        long totalA   = 0;
        long totalB   = 0;
        for(int i = 0; i < size; i++){
            long count = time / (2L * T[i]);
            if(time % (2L * T[i]) >= T[i]){ 
                count++;
            }
            long sum = count * W[i]; 
            totalSum += Math.min(sum, G[i] + S[i]);
            totalA   += Math.min(sum, G[i]); 
            totalB   += Math.min(sum, S[i]); 
            if(totalSum >= A + B && totalA >= A && totalB >= B) return true;
        }
        if(totalSum < A + B) return false;
        if(totalA < A) return false;
        if(totalB < B) return false;
        
        return true;
    }
}