class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        return robFrom(0,nums,memo);

    }

    public int robFrom(int i, int[] nums, int[] memo){
        if(i >= nums.length) return 0;

        if(memo[i] != 0) return memo[i];

        memo[i] = Math.max(robFrom(i+1,nums,memo), robFrom(i+2,nums,memo) + nums[i]);

        return memo[i];
    }
}
