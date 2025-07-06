class Solution {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int[] maxIdx = new int[arr.length];

        int max = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > arr[max]) {
                max = i;
            }
            maxIdx[i] = max;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[maxIdx[i]]) {
                char temp = arr[i];
                arr[i] = arr[maxIdx[i]];
                arr[maxIdx[i]] = temp;
                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }
}
