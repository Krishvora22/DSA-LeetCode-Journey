
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return countSubarrays(nums, right) - countSubarrays(nums, left - 1);
    }

    private int countSubarrays(int[] nums, int bound) {
        int count = 0;
        int length = 0; // length of current valid subarray

        for (int num : nums) {
            if (num <= bound) {
                length++;           // extend current valid subarray
                count += length;    // add all subarrays ending here
            } else {
                length = 0;         // reset if num > bound
            }
        }

        return count;
    }
}
