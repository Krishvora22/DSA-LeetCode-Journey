class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;

            currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            currMin = Math.min(nums[i], Math.min(temp * nums[i], currMin * nums[i]));

            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxSoFar;
    }
}
