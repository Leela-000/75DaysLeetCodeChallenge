class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array to use two-pointer approach
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2]; // initial sum

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update closest if this sum is nearer to target
                if (Math.abs(currentSum - target) < Math.abs(closest - target)) {
                    closest = currentSum;
                }

                // Move pointers based on comparison
                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // Exact match found
                    return currentSum;
                }
            }
        }
        return closest;
    }
}
