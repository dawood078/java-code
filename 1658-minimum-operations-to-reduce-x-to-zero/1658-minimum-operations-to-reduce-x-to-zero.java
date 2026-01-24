class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;

        // Step 1: calculate total sum
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // If x is greater than total sum, impossible
        if (x > totalSum) {
            return -1;
        }

        // We want to keep a subarray with sum = totalSum - x
        int target = totalSum - x;

        int left = 0;
        int sum = 0;
        int maxLen = -1;

        // Step 2: sliding window to find longest subarray with sum = target
        for (int right = 0; right < n; right++) {
            sum += nums[right];

            // shrink window if sum exceeds target
            while (sum > target && left <= right) {
                sum -= nums[left];
                left++;
            }

            // check if we found valid subarray
            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        // Step 3: if no subarray found, return -1
        if (maxLen == -1) {
            return -1;
        }

        // minimum operations = total elements - kept elements
        return n - maxLen;
    }
}





































































