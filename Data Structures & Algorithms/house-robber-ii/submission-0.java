class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int n = nums.length;
        int[] skipLastHouse = new int[n-1];
        int[] skipFirstHouse = new int[n-1];

        for(int i=0; i<n-1; i++){
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i+1];
        } 

        int FirstHouseMoney = robAmount(skipLastHouse);
        int lastHouseMoney = robAmount(skipFirstHouse);

        return Math.max(FirstHouseMoney,lastHouseMoney);
    }

    public int robAmount(int[] nums){
        if(nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);
        }
        return dp[nums.length-1];
    }
}