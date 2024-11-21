class Solution {
    public long solution(String numbers) {
        
        String[] newNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < newNumbers.length; i++) {
            numbers = numbers.replaceAll(newNumbers[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
        
         
    }
}