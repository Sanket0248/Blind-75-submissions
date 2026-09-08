class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        if(dp[n] != 0) return dp[n];

        dp[n] = climbStairs(n-1) + climbStairs(n-2);
        return dp[n];
    }
}
