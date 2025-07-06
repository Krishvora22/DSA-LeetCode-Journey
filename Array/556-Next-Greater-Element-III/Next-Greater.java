class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = (Integer.toString(n)).toCharArray();
        int i = arr.length - 2;

        // Find the first decreasing digit from the right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If the number is in descending order, there's no greater permutation
        if (i == -1) {
            return -1;
        }

        // Find the next greater digit to swap with
        int k = arr.length - 1;
        while (arr[k] <= arr[i]) {
            k--;
        }

        // Swap
        swap(arr, i, k);

        // Build the result: left part stays same, right part reversed
        StringBuilder ans = new StringBuilder();

        for (int j = 0; j <= i; j++) {
            ans.append(arr[j]);
        }

        for (int j = arr.length - 1; j > i; j--) {
            ans.append(arr[j]);
        }

        // Convert to long to check for 32-bit overflow
        long ans_ = Long.parseLong(ans.toString());

        return (ans_ > Integer.MAX_VALUE) ? -1 : (int) ans_;
    }

    // Swap characters in array
    void swap(char[] arr, int i, int j) {
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
