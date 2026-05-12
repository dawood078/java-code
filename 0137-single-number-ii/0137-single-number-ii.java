class Solution {
    public int singleNumber(int[] nums) {

        int ones = 0;
        int twos = 0;

        for (int num : nums) {

            // Add bits appearing first time
            ones = (ones ^ num) & ~twos;

            // Add bits appearing second time
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}