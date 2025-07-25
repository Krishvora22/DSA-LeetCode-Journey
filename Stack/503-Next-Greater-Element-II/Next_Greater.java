import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
      Stack<Integer> s = new Stack<>();

      int []ans = new int[nums.length];

      for (int i = 2 * nums.length - 1; i >= 0; i--) {
            int curr = nums[i % nums.length];

        while(!s.isEmpty() && s.peek()<=curr){
            s.pop();
        }
        if(i<nums.length){
           ans[i] = s.isEmpty() ? -1 : s.peek();
        }

        s.push(curr);
      }  
      return ans;
    }
}