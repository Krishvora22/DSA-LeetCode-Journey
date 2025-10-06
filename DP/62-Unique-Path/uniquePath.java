class Solution {
    public int path(int i , int j , int [][]dp , int m , int n){
        if(i>=m || j>=n){
            return 0;
        }

        if(i==m-1 && j==n-1){
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int left=path(i+1 , j , dp ,m , n );
        int right=path(i , j+1 , dp , m , n);
        dp[i][j]=left+right;

        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }

        return path(0 ,  0 , dp , m , n);
        
    }
}