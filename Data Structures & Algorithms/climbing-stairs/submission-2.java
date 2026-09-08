class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return climb(n,dp);
    }

    private int climb(int n, int[] dp){
        if(n <= 2) return n;

        if(dp[n] != 0) return dp[n];

        dp[n] = climb[n-1] + climb[n-2];

        return dp[n]; 
    }
}
