class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Convert to 1-based indexing
                return new int[]{left + 1, right + 1};
            }

            // Need larger sum
            else if (sum < target) {
                left++;
            }

            // Need smaller sum
            else {
                right--;
            }
        }

        return new int[]{};
    }
}
