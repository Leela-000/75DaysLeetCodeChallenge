import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // Map to store prefix sums and their frequency
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: sum = 0 occurs once

        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;

            // If (sum - k) exists, it means there's a subarray ending here with sum = k
            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }

            // Update the frequency of the current prefix sum
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
