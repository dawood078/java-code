class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];

        // Step 1: Count frequency
        for (int num : arr1) {
            freq[num]++;
        }

        int index = 0;

        // Step 2: Place elements as per arr2
        for (int num : arr2) {
            while (freq[num] > 0) {
                arr1[index++] = num;
                freq[num]--;
            }
        }

        // Step 3: Add remaining elements in ascending order
        for (int i = 0; i <= 1000; i++) {
            while (freq[i] > 0) {
                arr1[index++] = i;
                freq[i]--;
            }
        }

        return arr1;
    }
}