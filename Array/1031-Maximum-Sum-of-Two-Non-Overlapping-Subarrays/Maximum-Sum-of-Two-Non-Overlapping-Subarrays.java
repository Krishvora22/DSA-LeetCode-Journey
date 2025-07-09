class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(
            maxSum(nums, firstLen, secondLen),
            maxSum(nums, secondLen, firstLen)
        );
    }

    private int maxSum(int[] nums, int len1, int len2) {
        int n = nums.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int maxLen1 = 0;
        int result = 0;

        for (int i = len1 + len2; i <= n; i++) {
            int len1Sum = prefix[i - len2] - prefix[i - len2 - len1];
            int len2Sum = prefix[i] - prefix[i - len2];

            maxLen1 = Math.max(maxLen1, len1Sum);
            result = Math.max(result, maxLen1 + len2Sum);
        }

        return result;
    }
}
