class Solution {
    int dp[][];
    int unique(int m , int n , int i , int j , int[][] arr , int[][]dp){
        if(i == m-1 && j==n-1 ) return 1;
        if(i >= m || j >= n) return 0;
        if(arr[i][j] == 1) return 0;

        if(dp[i][j]!=-1) return dp[i][j] ;


        int right=unique(m , n , i, j+1 , arr , dp);
        int down=unique(m , n , i+1, j , arr , dp);
        
        dp[i][j]= right+down;
        return dp[i][j];

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m =obstacleGrid.length;
        int n =obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;
        
        dp = new int[m][n];
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        return unique(m , n , 0 , 0 , obstacleGrid , dp);
    }
}