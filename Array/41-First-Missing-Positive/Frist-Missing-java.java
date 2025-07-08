import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}

// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int n = nums.length;

//         // Step 1: Place nums[i] at the correct index if possible
//         for (int i = 0; i < n; i++) {
//             while (
//                 nums[i] > 0 && nums[i] <= n && 
//                 nums[nums[i] - 1] != nums[i]
//             ) {
//                 // Swap nums[i] and nums[nums[i] - 1]
//                 int temp = nums[i];
//                 nums[i] = nums[temp - 1];
//                 nums[temp - 1] = temp;
//             }
//         }

//         // Step 2: Find the first index where nums[i] != i + 1
//         for (int i = 0; i < n; i++) {
//             if (nums[i] != i + 1) {
//                 return i + 1;
//             }
//         }

//         // If all values from 1 to n are present
//         return n + 1;
//     }
// }
