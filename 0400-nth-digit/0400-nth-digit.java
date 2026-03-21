public class Solution {
    public int findNthDigit(int n) {
        long digitLength = 1;   // digits in current group
        long count = 9;         // count of numbers in current group
        long start = 1;         // starting number of current group
        
        // Step 1: Find the group
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
        
        // Step 2: Find the actual number
        long number = start + (n - 1) / digitLength;
        
        // Step 3: Find the digit in that number
        int digitIndex = (int)((n - 1) % digitLength);
        
        return String.valueOf(number).charAt(digitIndex) - '0';
    }
}