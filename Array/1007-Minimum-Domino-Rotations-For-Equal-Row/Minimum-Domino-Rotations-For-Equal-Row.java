
class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        
        int res = check(tops[0], tops, bottoms, n);
        if (res != -1) return res;
        
        if (tops[0] != bottoms[0]) {
            res = check(bottoms[0], tops, bottoms, n);
        }

        return res;
    }

    private int check(int target, int[] tops, int[] bottoms, int n) {
        int swapTop = 0;
        int swapBottom = 0;

        for (int i = 0; i < n; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return -1; 
            } else if (tops[i] != target) {
                swapTop++; 
            } else if (bottoms[i] != target) {
                swapBottom++; 
            }
        }

        return Math.min(swapTop, swapBottom);
    }
}

