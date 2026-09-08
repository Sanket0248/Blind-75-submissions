class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        memo[1] =  Math.max(nums[0],nums[1]);
        return robFrom(nums.length-1,nums,memo);

    }

    public int robFrom(int i, int[] nums, int[] memo){
        // if(i >= nums.length) return 0;
        if(i == 0) return memo[0];
        if(i == 1) return memo[1];

        if(memo[i] != 0) return memo[i];

        memo[i] = Math.max(robFrom(i-1,nums,memo), robFrom(i-2,nums,memo) + nums[i]);

        return memo[i];
    }
}
