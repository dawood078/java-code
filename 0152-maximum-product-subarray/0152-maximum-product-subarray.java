class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < n; i++) {

            int num = nums[i];

            // When negative number comes, swap max and min
            if (num < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(num, maxProd * num);
            minProd = Math.min(num, minProd * num);

            result = Math.max(result, maxProd);
        }

        return result;
    }
}