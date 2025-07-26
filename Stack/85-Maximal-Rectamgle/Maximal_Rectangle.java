import java.util.Stack;

class Solution {
    public int[] nextSmallerElement(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];

            while (!s.isEmpty() && arr[s.peek()] >= curr) {
                s.pop();
            }
            ans[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return ans; 
    }

    public int[] prevSmallerElement(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            int curr = arr[i];

            while (!s.isEmpty() && arr[s.peek()] >= curr) {
                s.pop();
            }
            ans[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return ans; 
    }

    public int maxarea(int[] heights) {
        int n = heights.length;
        int[] next = nextSmallerElement(heights, n);
        int[] prev = prevSmallerElement(heights, n);

        int area = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int l = heights[i];

            if (next[i] == -1) {
                next[i] = n;
            }

            int b = next[i] - prev[i] - 1;
            int newArea = l * b;

            area = Math.max(area, newArea);
        }
        return area;
    }

    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        if (n == 0) return 0;

        int[] heights = new int[m];
        int area = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            int newArea = maxarea(heights);
            area = Math.max(area, newArea);
        }

        return area;
    }
}
