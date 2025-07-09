import java.util.Arrays;

class Solution {
   public static int sumSubseqWidths(int[] nums) {
    long ans = 0;
    long mod = (long)1e9 + 7;
    Arrays.sort(nums);  
    long pow = 1;

    for(int i = 0; i < nums.length; i++, pow = (pow * 2) % mod) {
        ans = (ans + (nums[i] - nums[nums.length - i - 1]) * pow) % mod;
    }

    return (int)((int)(ans + mod) % mod);
}

}